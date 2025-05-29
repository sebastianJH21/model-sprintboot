package com.app.parking_types.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.auth.infrastructure.dto.ApiResponse;
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
    public ResponseEntity<ApiResponse<List<ParkingType>>> getAllParkingTypes() {
        List<ParkingType> parkingTypes = parkingTypeService.findAll();
        return ResponseEntity.ok(new ApiResponse<>(true, "Lista de tipo parqueaderos", parkingTypes));
    }

    // user by id
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<ParkingType>> getParkingTypeById(@PathVariable Long id) {
        ParkingType parkingType = parkingTypeService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Tipo parqueadero encontrado", parkingType));
    }

    // create user
    @PostMapping
    public ResponseEntity<ApiResponse<ParkingType>> createParkingType(@RequestBody ParkingType parkingType) {
        ParkingType newParkingType = parkingTypeService.save(parkingType);
        return ResponseEntity.ok(new ApiResponse<>(true, "Tipo de parqueadero creado", newParkingType));
    }

    // update user
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<ParkingType>> updateParkingType(@PathVariable Long id, @RequestBody ParkingType parkingType) {
        ParkingType updatedParkingType = parkingTypeService.update(parkingType, id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Tipo de parqueadero actualizado", updatedParkingType));
    }

    // delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteParkingType(@PathVariable Long id) {
        parkingTypeService.deleteById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Tipo de parqueadero eliminado", null));
    }
}
