package com.app.parking_spots.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IParkingSpots extends JpaRepository<ParkingSpots, Long> {

    // Get all ParkingSpotss (already provided by JpaRepository)
    @Override
    @NonNull
    List<ParkingSpots> findAll();

    // Search ParkingSpots by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<ParkingSpots> findById(@NonNull Long id);
    
    // Save a ParkingSpots (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends ParkingSpots> S save(@NonNull S parkingSpots);

    // Check if a ParkingSpots with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete ParkingSpots by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);
}