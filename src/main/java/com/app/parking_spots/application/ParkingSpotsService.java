package com.app.parking_spots.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.parking_spots.domain.IParkingSpotsRepository;
import com.app.parking_spots.domain.IParkingSpotsService;
import com.app.parking_spots.domain.ParkingSpots;
import com.app.shared.adapters.exception.ResourceNotFoundException;

@Service
public class ParkingSpotsService implements IParkingSpotsService {

    private final IParkingSpotsRepository parkingSpotsRepository;

    public ParkingSpotsService(IParkingSpotsRepository parkingSpotsRepository) {
        this.parkingSpotsRepository = parkingSpotsRepository;
    }

    @Override
    public List<ParkingSpots> findAll() {
        return parkingSpotsRepository.findAll();
    }

    @Override
    public ParkingSpots findById(Long id) {
        return parkingSpotsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Parking spot not found with ID: " + id));
    }

    @Override
    @Transactional
    public ParkingSpots save(ParkingSpots parkingSpots) {
        return parkingSpotsRepository.save(parkingSpots);
    }

    @Override
    @Transactional
    public ParkingSpots update(ParkingSpots parkingSpots, Long id) {
        ParkingSpots existingParkingSpot = findById(id);
        existingParkingSpot.setCode(parkingSpots.getCode());
        existingParkingSpot.setFlor(parkingSpots.getFlor());
        existingParkingSpot.setStatus_u(parkingSpots.getStatus_u());
        return parkingSpotsRepository.save(existingParkingSpot);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        ParkingSpots parkingSpot = findById(id);
        parkingSpotsRepository.delete(parkingSpot);
    }
}
