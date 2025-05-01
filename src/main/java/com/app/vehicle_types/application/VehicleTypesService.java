package com.app.vehicle_types.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// import com.app.parking_types.domain.VehicleType;
import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.vehicle_types.domain.IVehicleTypeRepository;
import com.app.vehicle_types.domain.IVehicleTypeService;
import com.app.vehicle_types.domain.VehicleType;

@Service
public class VehicleTypesService implements IVehicleTypeService {

    private final IVehicleTypeRepository vehicleTypesRepository;

    public VehicleTypesService(IVehicleTypeRepository vehicleTypesRepository) {
        this.vehicleTypesRepository = vehicleTypesRepository;
    }

    @Override
    public List<VehicleType> findAll() {
        return vehicleTypesRepository.findAll();
    }

    @Override
    public VehicleType findById(Long id) {
        return vehicleTypesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle type not found with ID: " + id));
    }

    @Override
    @Transactional
    public VehicleType save(VehicleType vehicleTypes) {
        if (vehicleTypesRepository.existsById(vehicleTypes.getId())) {
            throw new IllegalArgumentException("Vehicle type registred: " + vehicleTypes.getVehicleType());
        }
        return vehicleTypesRepository.save(vehicleTypes);
    }

    @Override
    @Transactional
    public VehicleType update(VehicleType vehicleTypes, Long id) {
        VehicleType existingVehicleTypes = findById(id);
        existingVehicleTypes.setVehicleType(vehicleTypes.getVehicleType());
        existingVehicleTypes.setVehicleType(vehicleTypes.getVehicleType());
        return vehicleTypesRepository.save(existingVehicleTypes);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        VehicleType vehicleTypes = findById(id);
        vehicleTypesRepository.delete(vehicleTypes);
    }
}
