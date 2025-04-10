package com.app.parking_types.application;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.parking_types.domain.IUserRepository;
import com.app.parking_types.domain.User;

@Service
public class ParkingTypesDetailsServiceImpl implements ParkingTypesDetailsService {

    private final IParkingTypesRepository parkingTypesRepository;

    public ParkingTypesDetailsServiceImpl(IParkingTypesRepository parkingTypesRepository) {
        this.parkingTypesRepository = parkingTypesRepository;
    }
} 