package com.app.vehicle_types.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.vehicle_types.domain.IVehicleTypeService;
import com.app.vehicle_types.domain.VehicleType;
import com.app.auth.infrastructure.dto.ApiResponse;

@RestController
@RequestMapping("/api/vehicle_types")
public class VehicleTypesController {

    private final IVehicleTypeService vehicleTypesService;

    public VehicleTypesController(IVehicleTypeService vehicleTypesService) {
        this.vehicleTypesService = vehicleTypesService;
    }

    // GET all vehicleTypes
    @GetMapping
    public ResponseEntity<ApiResponse<List<VehicleType>>> getAllVehicleTypes() {
        List<VehicleType> vehicleTypes = vehicleTypesService.findAll();
        return ResponseEntity.ok(new ApiResponse<>(true, "Lista de tipos de vehículos", vehicleTypes));
    }

    // GET vehicleType by ID
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<VehicleType>> getVehicleTypesById(@PathVariable Long id) {
        VehicleType vehicleType = vehicleTypesService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Tipo de vehículo encontrado", vehicleType));
    }

    // CREATE a new vehicleType
    @PostMapping
    public ResponseEntity<ApiResponse<VehicleType>> createVehicleTypes(@RequestBody VehicleType vehicleTypes) {
        VehicleType newVehicleType = vehicleTypesService.save(vehicleTypes);
        return ResponseEntity.ok(new ApiResponse<>(true, "Tipo de vehículo creado", newVehicleType));
    }

    // UPDATE an existing vehicleType
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<VehicleType>> updateVehicleTypes(@PathVariable Long id, @RequestBody VehicleType vehicleTypes) {
        VehicleType updatedVehicleType = vehicleTypesService.update(vehicleTypes, id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Tipo de vehículo actualizado", updatedVehicleType));
    }

    // DELETE a vehicleType
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteVehicleTypes(@PathVariable Long id) {
        vehicleTypesService.deleteById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Tipo de vehículo eliminado", null));
    }
}
