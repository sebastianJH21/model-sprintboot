package com.app.parking_types.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;
import com.app.parking_types.domain.IParkingTypesRepository;
import com.app.parking_types.domain.IParkingTypesService;
import com.app.parking_types.domain.ParkingTypes;

@Service
public class ParkingTypesService implements IParkingTypesService {

    private final IParkingTypesRepository parkingTypesRepository;

    public ParkingTypesService(IParkingTypesRepository parkingTypesRepository) {
        this.parkingTypesRepository = parkingTypesRepository;
    }

    @Override
    public List<ParkingTypes> findAll() {
        return parkingTypesRepository.findAll();
    }

    @Override
    public ParkingTypes findById(Long id) {
        return parkingTypesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("parking type not found with ID: " + id));
    }

    @Override
    @Transactional
    public ParkingTypes save(ParkingTypes parkingType) {
        return parkingTypesRepository.save(parkingType);
    }

    @Override
    @Transactional
    public ParkingTypes update(ParkingTypes parkingType, Long id) {
        ParkingTypes existingParkingTypes = findById(id);
        existingParkingTypes.setParkingType(parkingType.getParkingType());
        return parkingTypesRepository.save(existingParkingTypes);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        ParkingTypes parkingType = findById(id);
        parkingTypesRepository.delete(parkingType);
    }
}
