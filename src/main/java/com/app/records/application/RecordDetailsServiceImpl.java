package com.app.records.application;

import org.springframework.stereotype.Service;
import com.app.records.domain.IRecordsRepository;
import com.app.records.domain.Records;
import java.util.Optional;

@Service
public class RecordDetailsServiceImpl {

    private final IRecordsRepository recordRepository;

    public RecordDetailsServiceImpl(IRecordsRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public Optional<Records> findRecordById(Long id) {
        return recordRepository.findById(id);
    }
}
