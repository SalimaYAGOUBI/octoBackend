package com.example.backend.controllers;

import com.example.backend.daos.UserDao;
import com.example.backend.dtos.UserDto;
import com.example.backend.services.UserService;
import com.example.backend.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers(){
        List<UserDto> userDtos = new ArrayList<>();
        List<UserDao> userDaos = userService.getAllUsers();
        if (userDaos != null) {
            userDtos = ObjectMapperUtils.mapAll(userDaos, UserDto.class);
        }
        return userDtos;
    }



}
