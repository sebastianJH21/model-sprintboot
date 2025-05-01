package com.app.parking_types.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.parking_types.domain.IParkingTypeService;
import com.app.parking_types.domain.ParkingType;

@RestController
@RequestMapping("/api/parkingTypes")
public class ParkingTypeController {

    private final IParkingTypeService parkingTypeService;

    public ParkingTypeController(IParkingTypeService parkingTypeService) {
        this.parkingTypeService = parkingTypeService;
    }

    // all users
    @GetMapping
    public ResponseEntity<List<ParkingType>> getAllParkingTypes() {
        List<ParkingType> parkingType = parkingTypeService.findAll();
        return ResponseEntity.ok(parkingType);
    }

    // user by id
    @GetMapping("/{id}")
    public ResponseEntity<ParkingType> getParkingTypeById(@PathVariable Long id) {
        ParkingType parkingType = parkingTypeService.findById(id);
        return ResponseEntity.ok(parkingType);
    }

    // create user
    @PostMapping
    public ResponseEntity<ParkingType> createParkingType(@RequestBody ParkingType parkingType) {
        ParkingType newParkingType = parkingTypeService.save(parkingType);
        return ResponseEntity.ok(newParkingType);
    }

    // update user
    @PutMapping("/{id}")
    public ResponseEntity<ParkingType> updateParkingType(@PathVariable Long id, @RequestBody ParkingType parkingType) {
        ParkingType updatedParkingType = parkingTypeService.update(parkingType, id);
        return ResponseEntity.ok(updatedParkingType);
    }

    // delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParkingType(@PathVariable Long id) {
        parkingTypeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
