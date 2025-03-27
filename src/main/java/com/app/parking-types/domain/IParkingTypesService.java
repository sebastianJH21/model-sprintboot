package com.app.parking_types.domain;

import java.util.List;

public interface IParkingTypesService {
    
    List<ParkingTypes> findAll();

    ParkingTypes findById(Long id);

    ParkingTypes save(ParkingTypes parkingTypes);

    ParkingTypes update(ParkingTypes parkingTypes, Long id);

    ParkingTypes deleteById(Long id);
}
