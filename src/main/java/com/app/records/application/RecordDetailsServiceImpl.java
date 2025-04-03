package com.app.records.application;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.records.domain.IRecordsRepository;
import com.app.records.domain.Records;

@Service
public class RecordDetailsServiceImpl implements UserDetailsService {

    private final IRecordsRepository recordRepository;

    public RecordDetailsServiceImpl(IRecordsRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userIde) throws UsernameNotFoundException {
        Records record = recordRepository.findById(Long.parseLong(userIde))
                .orElseThrow(() -> new UsernameNotFoundException("Record not found with ID: " + userIde));

        return new org.springframework.security.core.userdetails.User(
                record.getUserIde(),
                "", // No hay campo de contraseña en Records, se deja vacío
                new ArrayList<>()
        );
    }
}