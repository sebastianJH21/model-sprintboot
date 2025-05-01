package com.app.vehicle_types.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.vehicle_types.domain.IVehicleTypeRepository;
import com.app.vehicle_types.domain.VehicleType;

@Component
public class VehicleTypesDatasource {

    private final IVehicleTypeRepository vehicleTypesRepository;

    public VehicleTypesDatasource(IVehicleTypeRepository vehicleTypesRepository) {
        this.vehicleTypesRepository = vehicleTypesRepository;
    }

    public List<VehicleType> findAll() {
        return vehicleTypesRepository.findAll();
    }
    public Optional<VehicleType> findById(Long id) {
        return vehicleTypesRepository.findById(id);
    }

    public VehicleType save(VehicleType vehicleTypes) {
        return vehicleTypesRepository.save(vehicleTypes);
    }

    public Optional<VehicleType> update(VehicleType vehicleTypes, Long id) {
        return vehicleTypesRepository.findById(id).map(existingVehicleTypes -> {
            existingVehicleTypes.setVehicleType(vehicleTypes.getVehicleType());
            return vehicleTypesRepository.save(existingVehicleTypes);
        });
    }

    public boolean deleteById(Long id) {
        if (vehicleTypesRepository.existsById(id)) {
            vehicleTypesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
