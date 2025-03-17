package org.garcia.workshopsitemongo.resources;


import org.garcia.workshopsitemongo.DTO.UserDTO;
import org.garcia.workshopsitemongo.Services.UserServices;
import org.garcia.workshopsitemongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<UserDTO> findAll() {
        List<User> users = userServices.findAll();
        List<UserDTO> listDto = users.stream().map(user -> new UserDTO(user)).collect(Collectors.toList());
        return listDto;
    }
}
