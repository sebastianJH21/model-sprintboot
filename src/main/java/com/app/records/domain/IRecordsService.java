package com.app.records.domain;

import java.util.List;

public interface IRecordsService {
    
    List<Records> findAll();

    Records findById(Long id);

    Records save(Records user);

    Records update(Records user, Long id);

    void deleteById(Long id);
}
