package org.garcia.workshopsitemongo.resources;


import org.garcia.workshopsitemongo.Services.UserServices;
import org.garcia.workshopsitemongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<User> findAll() {
        List<User> users = userServices.findAll();
        users.addAll(Arrays.asList());
        return users;
    }
}
