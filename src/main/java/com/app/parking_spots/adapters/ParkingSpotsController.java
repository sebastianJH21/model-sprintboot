package com.app.parking_spots.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.parking_spots.domain.IParkingSpotsService;
import com.app.parking_spots.domain.ParkingSpots;

@RestController
@RequestMapping("/api/parking-spots")
public class ParkingSpotsController {

    private final IParkingSpotsService parkingSpotsService;

    public ParkingSpotsController(IParkingSpotsService parkingSpotsService) {
        this.parkingSpotsService = parkingSpotsService;
    }

    // GET all parking spots
    @GetMapping
    public ResponseEntity<List<ParkingSpots>> getAllParkingSpots() {
        List<ParkingSpots> spots = parkingSpotsService.findAll();
        return ResponseEntity.ok(spots);
    }

    // GET a parking spot by ID
    @GetMapping("/{id}")
    public ResponseEntity<ParkingSpots> getParkingSpotById(@PathVariable Long id) {
        ParkingSpots spot = parkingSpotsService.findById(id);
        return ResponseEntity.ok(spot);
    }

    // CREATE a new parking spot
    @PostMapping
    public ResponseEntity<ParkingSpots> createParkingSpot(@RequestBody ParkingSpots parkingSpot) {
        ParkingSpots newSpot = parkingSpotsService.save(parkingSpot);
        return ResponseEntity.ok(newSpot);
    }

    // UPDATE a parking spot
    @PutMapping("/{id}")
    public ResponseEntity<ParkingSpots> updateParkingSpot(
            @PathVariable Long id,
            @RequestBody ParkingSpots parkingSpot) {
        ParkingSpots updatedSpot = parkingSpotsService.update(parkingSpot, id);
        return ResponseEntity.ok(updatedSpot);
    }

    // DELETE a parking spot
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParkingSpot(@PathVariable Long id) {
        parkingSpotsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
