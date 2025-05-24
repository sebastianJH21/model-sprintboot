package com.app.parking_spots.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.parking_spots.domain.IParkingSpotRepository;
import com.app.parking_spots.domain.IParkingSpotService;
import com.app.parking_spots.domain.ParkingSpot;
import com.app.shared.adapters.exception.ResourceNotFoundException;

@Service
public class ParkingSpotService implements IParkingSpotService {

    private final IParkingSpotRepository parkingSpotsRepository;

    public ParkingSpotService(IParkingSpotRepository parkingSpotsRepository) {
        this.parkingSpotsRepository = parkingSpotsRepository;
    }

    @Override
    public List<ParkingSpot> findAll() {
        return parkingSpotsRepository.findAll();
    }

    @Override
    public ParkingSpot findById(Long id) {
        return parkingSpotsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Parking spot not found with ID: " + id));
    }

    @Override
    @Transactional
    public ParkingSpot save(ParkingSpot parkingSpots) {
        return parkingSpotsRepository.save(parkingSpots);
    }

    @Override
    @Transactional
    public ParkingSpot update(ParkingSpot parkingSpots, Long id) {
        ParkingSpot existingParkingSpot = findById(id);
        existingParkingSpot.setCode(parkingSpots.getCode());
        existingParkingSpot.setFlor(parkingSpots.getFlor());
        existingParkingSpot.setStatus(parkingSpots.getStatus());
        return parkingSpotsRepository.save(existingParkingSpot);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        ParkingSpot parkingSpot = findById(id);
        parkingSpotsRepository.delete(parkingSpot);
    }
}
