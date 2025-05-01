package com.app.records.domain;

import java.util.List;

public interface IRecordService {
    
    List<Record> findAll();

    Record findById(Long id);

    Record save(Record record);

    Record update(Record record, Long id);

    void deleteById(Long id);
}
