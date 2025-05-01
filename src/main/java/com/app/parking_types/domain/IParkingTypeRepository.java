package com.app.parking_types.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IParkingTypeRepository extends JpaRepository<ParkingType, Long> {

    // Get all users (already provided by JpaRepository)
    @Override
    @NonNull
    List<ParkingType> findAll();

    // Search ParkingTypes by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<ParkingType> findById(@NonNull Long id);

    // Save a ParkingTypes (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends ParkingType> S save(@NonNull S parkingType);

    // Check if a ParkingTypes with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete ParkingTypes by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);
}