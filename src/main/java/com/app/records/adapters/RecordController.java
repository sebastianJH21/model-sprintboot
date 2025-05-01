package com.app.records.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.records.domain.IRecordService;
import com.app.records.domain.Record;

@RestController
@RequestMapping("/api/records")
public class RecordController {

    private final IRecordService recordService;

    public RecordController(IRecordService recordService) {
        this.recordService = recordService;
    }

    // get all records
    @GetMapping
    public ResponseEntity<List<Record>> getAllRecords() {
        List<Record> records = recordService.findAll();
        return ResponseEntity.ok(records);
    }

    // Get record by id
    @GetMapping("/{id}")
    public ResponseEntity<Record> getRecordById(@PathVariable Long id) {
        Record record = recordService.findById(id);
        return ResponseEntity.ok(record);
    }

    // create record
    @PostMapping
    public ResponseEntity<Record> createRecord(@RequestBody Record record) {
        Record newRecord = recordService.save(record);
        return ResponseEntity.ok(newRecord);
    }

    // update record
    @PutMapping("/{id}")
    public ResponseEntity<Record> updateRecord(@PathVariable Long id, @RequestBody Record record) {
        Record updatedRecord = recordService.update(record, id);
        return ResponseEntity.ok(updatedRecord);
    }

    // delete record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecord(@PathVariable Long id) {
        recordService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
