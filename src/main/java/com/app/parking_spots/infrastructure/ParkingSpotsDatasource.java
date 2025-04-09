package com.app.parking_spots.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.parking_spots.domain.IParkingSpotsRepository;
import com.app.parking_spots.domain.ParkingSpots;

@Component
public class ParkingSpotsDatasource {

    private final IParkingSpotsRepository parkingSpotsRepository;

    public ParkingSpotsDatasource(IParkingSpotsRepository parkingSpotsRepository) {
        this.parkingSpotsRepository = parkingSpotsRepository;
    }

    public List<ParkingSpots> findAll() {
        return parkingSpotsRepository.findAll();
    }

    public Optional<ParkingSpots> findById(Long id) {
        return parkingSpotsRepository.findById(id);
    }

    public ParkingSpots save(ParkingSpots parkingSpots) {
        return parkingSpotsRepository.save(parkingSpots);
    }

    public Optional<ParkingSpots> update(ParkingSpots parkingSpots, Long id) {
        return parkingSpotsRepository.findById(id).map(existingParkingSpot -> {
            existingParkingSpot.setCode(parkingSpots.getCode());
            existingParkingSpot.setFlor(parkingSpots.getFlor());
            existingParkingSpot.setStatus_u(parkingSpots.getStatus_u());
            return parkingSpotsRepository.save(existingParkingSpot);
        });
    }

    public boolean deleteById(Long id) {
        if (parkingSpotsRepository.existsById(id)) {
            parkingSpotsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}