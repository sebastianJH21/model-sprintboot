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

import com.app.parking_spots.domain.IParkingSpotService;
import com.app.parking_spots.domain.ParkingSpot;
import com.app.auth.infrastructure.dto.ApiResponse;

@RestController
@RequestMapping("/api/parking-spots")
public class ParkingSpotController {

    private final IParkingSpotService parkingSpotsService;

    public ParkingSpotController(IParkingSpotService parkingSpotsService) {
        this.parkingSpotsService = parkingSpotsService;
    }

    // GET all parking spots
    @GetMapping
    public ResponseEntity<ApiResponse<List<ParkingSpot>>> getAllParkingSpots() {
        List<ParkingSpot> spots = parkingSpotsService.findAll();
        return ResponseEntity.ok(new ApiResponse<>(true, "Lista de parqueaderos", spots));
    }

    // GET a parking spot by ID
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<ParkingSpot>> getParkingSpotById(@PathVariable Long id) {
        ParkingSpot spot = parkingSpotsService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Parqueadero encontrado", spot));
    }

    // CREATE a new parking spot
    @PostMapping
    public ResponseEntity<ApiResponse<ParkingSpot>> createParkingSpot(@RequestBody ParkingSpot parkingSpot) {
        ParkingSpot newSpot = parkingSpotsService.save(parkingSpot);
        return ResponseEntity.ok(new ApiResponse<>(true, "Parqueadero creado", newSpot));
    }

    // UPDATE a parking spot
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<ParkingSpot>> updateParkingSpot(@PathVariable Long id, @RequestBody ParkingSpot parkingSpot) {
        ParkingSpot updatedSpot = parkingSpotsService.update(parkingSpot, id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Parqueadero actualizado", updatedSpot));
    }

    // DELETE a parking spot
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteParkingSpot(@PathVariable Long id) {
        parkingSpotsService.deleteById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Parqueadero eliminado", null));
    }
}

