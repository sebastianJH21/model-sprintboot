package com.app.records.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.records.domain.IRecordRepository;
import com.app.records.domain.Record;

@Component
public class RecordDatasource {

    private final IRecordRepository recordsRepository;

    public RecordDatasource(IRecordRepository recordsRepository) {
        this.recordsRepository = recordsRepository;
    }

    public List<Record> findAll() {
        return recordsRepository.findAll();
    }
    public Optional<Record> findById(Long id) {
        return recordsRepository.findById(id);
    }

    public Record save(Record record) {
        return recordsRepository.save(record);
    }

    public Optional<Record> update(Record record, Long id) {
        return recordsRepository.findById(id).map(existingRecord -> {
            existingRecord.setParkingTypeId(record.getParkingTypeId());
            existingRecord.setParkingSpotId(record.getParkingSpotId());
            existingRecord.setVehicleTypeId(record.getVehicleTypeId());
            existingRecord.setPlate(record.getPlate());
            existingRecord.setEntryDate(record.getEntryDate());
            existingRecord.setExitDate(record.getExitDate());
            existingRecord.setIsStatusU(record.getIsStatusU());
            return recordsRepository.save(existingRecord);
        });
    }

    public boolean deleteById(Long id) {
        if (recordsRepository.existsById(id)) {
            recordsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
