package com.app.parking_spots.domain;

import java.util.List;

public interface IParkingSpotService {
    
    List<ParkingSpot> findAll();

    ParkingSpot findById(Long id);

    ParkingSpot save(ParkingSpot ParkingSpots);

    ParkingSpot update(ParkingSpot ParkingSpots, Long id);

    void deleteById(Long id);
}
