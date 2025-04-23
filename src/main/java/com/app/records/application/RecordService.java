package com.app.records.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.records.domain.IRecordsRepository;
import com.app.records.domain.IRecordsService;
import com.app.records.domain.Records;

@Service
public class RecordService implements IRecordsService {

    private final IRecordsRepository recordRepository;

    public RecordService(IRecordsRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public List<Records> findAll() {
        return recordRepository.findAll();
    }

    @Override
    public Records findById(Long id) {
        return recordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record not found with ID: " + id));
    }

    @Override
    @Transactional
    public Records save(Records record) {
        return recordRepository.save(record);
    }

    @Override
    @Transactional
    public Records update(Records record, Long id) {
        Records existingRecord = findById(id);

        existingRecord.setUserIde(record.getUserIde());
        existingRecord.setParkingTypeId(record.getParkingTypeId());
        existingRecord.setParkingSpotId(record.getParkingSpotId());
        existingRecord.setVehicleTypeId(record.getVehicleTypeId());
        existingRecord.setPlate(record.getPlate());
        existingRecord.setEntryDate(record.getEntryDate());
        existingRecord.setEntryTime(record.getEntryTime());
        existingRecord.setExitDate(record.getExitDate());
        existingRecord.setExitTime(record.getExitTime());
        existingRecord.setStatusU(record.isStatusU());

        return recordRepository.save(existingRecord);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Records record = findById(id);
        recordRepository.delete(record);
    }
}
