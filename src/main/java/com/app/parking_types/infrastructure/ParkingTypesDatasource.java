package com.app.parking_types.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.parking_types.domain.IParkingTypesRepository;
import com.app.parking_types.domain.ParkingTypes;

@Component
public class ParkingTypesDatasource {

    private final IParkingTypesRepository parkingTypesRepository;

    public ParkingTypesDatasource(IParkingTypesRepository parkingTypesRepository) {
        this.parkingTypesRepository = parkingTypesRepository;
    }

    public List<ParkingTypes> findAll() {
        return parkingTypesRepository.findAll();
    }
    public Optional<ParkingTypes> findById(Long id) {
        return parkingTypesRepository.findById(id);
    }

    public ParkingTypes save(ParkingTypes parkingType) {
        return parkingTypesRepository.save(parkingType);
    }

    public Optional<ParkingTypes> update(ParkingTypes parkingType, Long id) {
        return parkingTypesRepository.findById(id).map(existingParkingType -> {
            existingParkingType.setParkingType(parkingType.getParkingType());
            return parkingTypesRepository.save(existingParkingType);
        });
    }

    public boolean deleteById(Long id) {
        if (parkingTypesRepository.existsById(id)) {
            parkingTypesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
