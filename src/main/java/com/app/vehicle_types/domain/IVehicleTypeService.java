package com.app.vehicle_types.domain;

import java.util.List;

public interface IVehicleTypeService {
    
    List<VehicleType> findAll();

    VehicleType findById(Long id);

    VehicleType save(VehicleType VehicleType);

    VehicleType update(VehicleType VehicleType, Long id);

    void deleteById(Long id);
}
