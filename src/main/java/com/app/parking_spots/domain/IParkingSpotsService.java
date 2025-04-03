package com.app.parking_spots.domain;

import java.util.List;

public interface IParkingSpotsService {
    
    List<ParkingSpots> findAll();

    ParkingSpots findById(Long id);

    ParkingSpots save(ParkingSpots ParkingSpots);

    ParkingSpots update(ParkingSpots ParkingSpots, Long id);

    void deleteById(Long id);
}
