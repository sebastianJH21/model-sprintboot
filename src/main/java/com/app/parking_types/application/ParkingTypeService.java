package com.app.parking_types.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;
import com.app.parking_types.domain.IParkingTypeRepository;
import com.app.parking_types.domain.IParkingTypeService;
import com.app.parking_types.domain.ParkingType;

@Service
public class ParkingTypeService implements IParkingTypeService {

    private final IParkingTypeRepository parkingTypeRepository;

    public ParkingTypeService(IParkingTypeRepository parkingTypeRepository) {
        this.parkingTypeRepository = parkingTypeRepository;
    }

    @Override
    public List<ParkingType> findAll() {
        return parkingTypeRepository.findAll();
    }

    @Override
    public ParkingType findById(Long id) {
        return parkingTypeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("parking type not found with ID: " + id));
    }

    @Override
    @Transactional
    public ParkingType save(ParkingType parkingType) {
        return parkingTypeRepository.save(parkingType);
    }

    @Override
    @Transactional
    public ParkingType update(ParkingType parkingType, Long id) {
        ParkingType existingParkingType = findById(id);
        existingParkingType.setParkingType(parkingType.getParkingType());
        return parkingTypeRepository.save(existingParkingType);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        ParkingType parkingType = findById(id);
        parkingTypeRepository.delete(parkingType);
    }
}
