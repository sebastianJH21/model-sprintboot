package com.app.records.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.records.domain.IRecordService;
import com.app.records.domain.Record;
import com.app.auth.infrastructure.dto.ApiResponse;

@RestController
@RequestMapping("/api/records")
public class RecordController {

    private final IRecordService recordService;

    public RecordController(IRecordService recordService) {
        this.recordService = recordService;
    }

// Obtener todos los Facturas
    @GetMapping
    public ResponseEntity<ApiResponse<List<Record>>> getAllRecords() {
        List<Record> records = recordService.findAll();
        return ResponseEntity.ok(new ApiResponse<>(true, "Lista de Facturas", records));
    }

    // Obtener un Factura por ID
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Record>> getRecordById(@PathVariable Long id) {
        Record record = recordService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Factura encontrado", record));
    }

    // Crear un nuevo Factura
    @PostMapping
    public ResponseEntity<ApiResponse<Record>> createRecord(@RequestBody Record record) {
        Record newRecord = recordService.save(record);
        return ResponseEntity.ok(new ApiResponse<>(true, "Factura creado", newRecord));
    }

    // Actualizar un Factura existente
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Record>> updateRecord(@PathVariable Long id, @RequestBody Record record) {
        Record updatedRecord = recordService.update(record, id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Factura actualizado", updatedRecord));
    }

    // Eliminar un Factura
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteRecord(@PathVariable Long id) {
        recordService.deleteById(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Factura eliminado", null));
    }
}
