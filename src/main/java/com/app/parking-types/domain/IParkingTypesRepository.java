package com.app.parking_types.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IParkingTypesRepository extends JpaRepository<ParkingTypes, Long> {

    // Get all users (already provided by JpaRepository)
    @Override
    @NonNull
    List<ParkingTypes> findAll();

    // Search ParkingTypes by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<ParkingTypes> findById(@NonNull Long id);

    // Save a ParkingTypes (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends ParkingTypes> S save(@NonNull S parkingTypes);

    // Check if a ParkingTypes with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete ParkingTypes by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);
}