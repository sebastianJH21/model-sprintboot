package com.app.records.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.records.domain.IRecordsService;
import com.app.records.domain.Records;

@RestController
@RequestMapping("/api/records")
public class RecordsController {

    private final IRecordsService recordService;

    public RecordsController(IRecordsService recordService) {
        this.recordService = recordService;
    }

    // get all records
    @GetMapping
    public ResponseEntity<List<Records>> getAllRecords() {
        List<Records> records = recordService.findAll();
        return ResponseEntity.ok(records);
    }

    // Get record by id
    @GetMapping("/{id}")
    public ResponseEntity<Records> getRecordById(@PathVariable Long id) {
        Records record = recordService.findById(id);
        return ResponseEntity.ok(record);
    }

    // create record
    @PostMapping
    public ResponseEntity<Records> createRecord(@RequestBody Records record) {
        Records newRecord = recordService.save(record);
        return ResponseEntity.ok(newRecord);
    }

    // update record
    @PutMapping("/{id}")
    public ResponseEntity<Records> updateRecord(@PathVariable Long id, @RequestBody Records record) {
        Records updatedRecord = recordService.update(record, id);
        return ResponseEntity.ok(updatedRecord);
    }

    // delete record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecord(@PathVariable Long id) {
        recordService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
