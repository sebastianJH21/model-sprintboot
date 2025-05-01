package com.app.vehicle_types.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicleTypeRepository extends JpaRepository<VehicleType, Long> {

    // Get all users (already provided by JpaRepository)
    @Override
    @NonNull
    List<VehicleType> findAll();

    // Search user by ID (already provided by JpaRepository)
    @Override
    @NonNull
    Optional<VehicleType> findById(@NonNull Long id);

    // Save a user (already provided by JpaRepository)
    @Override
    @NonNull
    <S extends VehicleType> S save(@NonNull S VehicleType);

    // Check if a user with a specific ID exists (already provided by JpaRepository)
    @Override
    boolean existsById(@NonNull Long id);

    // Delete user by ID (already provided by JpaRepository)
    @Override
    void deleteById(@NonNull Long id);

}