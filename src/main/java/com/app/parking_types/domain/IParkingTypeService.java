package com.app.parking_types.domain;

import java.util.List;

public interface IParkingTypeService {
    
    List<ParkingType> findAll();

    ParkingType findById(Long id);

    ParkingType save(ParkingType parkingType);

    ParkingType update(ParkingType parkingType, Long id);

    void deleteById(Long id);
}
