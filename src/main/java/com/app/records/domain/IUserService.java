package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Records> findAll();

    Records findById(Long id);

    Records save(Records user);

    Records update(Records user, Long id);

    void deleteById(Long id);
}
