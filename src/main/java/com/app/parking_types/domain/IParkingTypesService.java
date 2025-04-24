package com.app.parking_types.domain;

import java.util.List;

public interface IParkingTypesService {
    
    List<ParkingTypes> findAll();

    ParkingTypes findById(Long id);

    ParkingTypes save(ParkingTypes parkingType);

    ParkingTypes update(ParkingTypes parkingType, Long id);

    void deleteById(Long id);
}
