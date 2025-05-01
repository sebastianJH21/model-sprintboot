package com.app.records.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.records.domain.IRecordRepository;
import com.app.records.domain.IRecordService;
import com.app.records.domain.Record;

@Service
public class RecordService implements IRecordService {

    private final IRecordRepository recordRepository;

    public RecordService(IRecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public List<Record> findAll() {
        return recordRepository.findAll();
    }

    @Override
    public Record findById(Long id) {
        return recordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record not found with ID: " + id));
    }

    @Override
    @Transactional
    public Record save(Record record) {
        return recordRepository.save(record);
    }

    @Override
    @Transactional
    public Record update(Record record, Long id) {
        Record existingRecord = findById(id);

        existingRecord.setUserId(record.getUserId());
        existingRecord.setParkingTypeId(record.getParkingTypeId());
        existingRecord.setParkingSpotId(record.getParkingSpotId());
        existingRecord.setVehicleTypeId(record.getVehicleTypeId());
        existingRecord.setPlate(record.getPlate());
        existingRecord.setEntryDate(record.getEntryDate());
        existingRecord.setEntryTime(record.getEntryTime());
        existingRecord.setExitDate(record.getExitDate());
        existingRecord.setExitTime(record.getExitTime());
        existingRecord.setIsStatusU(record.getIsStatusU());

        return recordRepository.save(existingRecord);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Record record = findById(id);
        recordRepository.delete(record);
    }
}
