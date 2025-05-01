package com.app.users.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;
import com.app.users.domain.IUserRepository;
import com.app.users.domain.IUserService;
import com.app.users.domain.User;

@Service
public class UserService implements IUserService {

    private final IUserService userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return parkingTypesRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("parking type not found with ID: " + id));
    }

    @Override
    @Transactional
    public ParkingTypes save(ParkingTypes parkingType) {
        return parkingTypesRepository.save(parkingType);
    }

    @Override
    @Transactional
    public ParkingTypes update(ParkingTypes parkingType, Long id) {
        ParkingTypes existingParkingTypes = findById(id);
        existingParkingTypes.setParkingType(parkingType.getParkingType());
        return parkingTypesRepository.save(existingParkingTypes);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        ParkingTypes parkingType = findById(id);
        parkingTypesRepository.delete(parkingType);
    }
}
