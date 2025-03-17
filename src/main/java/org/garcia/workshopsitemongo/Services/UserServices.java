package org.garcia.workshopsitemongo.Services;

import org.garcia.workshopsitemongo.domain.User;
import org.garcia.workshopsitemongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

public List<User> findAll() {
    return userRepository.findAll();
    }
}
