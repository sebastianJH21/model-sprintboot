package com.app.parking_spots.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.parking_spots.domain.IParkingSpotRepository;
import com.app.parking_spots.domain.ParkingSpot;

@Component
public class ParkingSpotDatasource {

    private final IParkingSpotRepository parkingSpotsRepository;

    public ParkingSpotDatasource(IParkingSpotRepository parkingSpotsRepository) {
        this.parkingSpotsRepository = parkingSpotsRepository;
    }

    public List<ParkingSpot> findAll() {
        return parkingSpotsRepository.findAll();
    }

    public Optional<ParkingSpot> findById(Long id) {
        return parkingSpotsRepository.findById(id);
    }

    public ParkingSpot save(ParkingSpot parkingSpots) {
        return parkingSpotsRepository.save(parkingSpots);
    }

    public Optional<ParkingSpot> update(ParkingSpot parkingSpots, Long id) {
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