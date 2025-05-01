package com.app.vehicle_types.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.vehicle_types.domain.IVehicleTypeService;
import com.app.vehicle_types.domain.VehicleType;

@RestController
@RequestMapping("/api/vehicle_types")
public class VehicleTypesController {

    private final IVehicleTypeService vehicleTypesService;

    public VehicleTypesController(IVehicleTypeService vehicleTypesService) {
        this.vehicleTypesService = vehicleTypesService;
    }

    // all vehicleTypes
    @GetMapping
    public ResponseEntity<List<VehicleType>> getAllVehicleTypes() {
        List<VehicleType> vehicleTypes = vehicleTypesService.findAll();
        return ResponseEntity.ok(vehicleTypes);
    }

    // vehicleTypes by id
    @GetMapping("/{id}")
    public ResponseEntity<VehicleType> getVehicleTypesById(@PathVariable Long id) {
        VehicleType vehicleTypes = vehicleTypesService.findById(id);
        return ResponseEntity.ok(vehicleTypes);
    }

    // create vehicleTypes
    @PostMapping
    public ResponseEntity<VehicleType> createVehicleTypes(@RequestBody VehicleType vehicleTypes) {
        VehicleType newVehicleTypes = vehicleTypesService.save(vehicleTypes);
        return ResponseEntity.ok(newVehicleTypes);
    }

    // update vehicleTypes
    @PutMapping("/{id}")
    public ResponseEntity<VehicleType> updateVehicleTypes(@PathVariable Long id, @RequestBody VehicleType vehicleTypes) {
        VehicleType updatedVehicleTypes = vehicleTypesService.update(vehicleTypes, id);
        return ResponseEntity.ok(updatedVehicleTypes);
    }

    // delete vehicleTypes
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicleTypes(@PathVariable Long id) {
        vehicleTypesService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
