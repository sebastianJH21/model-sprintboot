package com.app.vehicle_types.domain;

import java.util.List;

public interface IVehicleTpyesService {
    
    List<VehicleTpyes> findAll();

    VehicleTpyes findById(Long id);

    VehicleTpyes save(VehicleTpyes VehicleType);

    VehicleTpyes update(VehicleTpyes VehicleType, Long id);

    void deleteById(Long id);
}
