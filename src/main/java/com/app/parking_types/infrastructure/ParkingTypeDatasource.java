package com.app.parking_types.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.parking_types.domain.IParkingTypeRepository;
import com.app.parking_types.domain.ParkingType;

@Component
public class ParkingTypeDatasource {

    private final IParkingTypeRepository parkingTypeRepository;

    public ParkingTypeDatasource(IParkingTypeRepository parkingTypeRepository) {
        this.parkingTypeRepository = parkingTypeRepository;
    }

    public List<ParkingType> findAll() {
        return parkingTypeRepository.findAll();
    }
    public Optional<ParkingType> findById(Long id) {
        return parkingTypeRepository.findById(id);
    }

    public ParkingType save(ParkingType parkingType) {
        return parkingTypeRepository.save(parkingType);
    }

    public Optional<ParkingType> update(ParkingType parkingType, Long id) {
        return parkingTypeRepository.findById(id).map(existingParkingType -> {
            existingParkingType.setParkingType(parkingType.getParkingType());
            return parkingTypeRepository.save(existingParkingType);
        });
    }

    public boolean deleteById(Long id) {
        if (parkingTypeRepository.existsById(id)) {
            parkingTypeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
