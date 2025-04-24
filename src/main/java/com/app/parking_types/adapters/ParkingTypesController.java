package com.app.parking_types.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.parking_types.domain.IParkingTypesService;
import com.app.parking_types.domain.ParkingTypes;

@RestController
@RequestMapping("/api/parkingTypes")
public class ParkingTypesController {

    private final IParkingTypesService parkingTypesService;

    public ParkingTypesController(IParkingTypesService parkingTypesService) {
        this.parkingTypesService = parkingTypesService;
    }

    // all users
    @GetMapping
    public ResponseEntity<List<ParkingTypes>> getAllParkingTypes() {
        List<ParkingTypes> parkingType = parkingTypesService.findAll();
        return ResponseEntity.ok(parkingType);
    }

    // user by id
    @GetMapping("/{id}")
    public ResponseEntity<ParkingTypes> getParkingTypeById(@PathVariable Long id) {
        ParkingTypes parkingType = parkingTypesService.findById(id);
        return ResponseEntity.ok(parkingType);
    }

    // create user
    @PostMapping
    public ResponseEntity<ParkingTypes> createParkingType(@RequestBody ParkingTypes parkingType) {
        ParkingTypes newParkingType = parkingTypesService.save(parkingType);
        return ResponseEntity.ok(newParkingType);
    }

    // update user
    @PutMapping("/{id}")
    public ResponseEntity<ParkingTypes> updateParkingType(@PathVariable Long id, @RequestBody ParkingTypes parkingType) {
        ParkingTypes updatedParkingType = parkingTypesService.update(parkingType, id);
        return ResponseEntity.ok(updatedParkingType);
    }

    // delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParkingType(@PathVariable Long id) {
        parkingTypesService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
