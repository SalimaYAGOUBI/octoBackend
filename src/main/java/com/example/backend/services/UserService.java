package com.example.backend.services;

import com.example.backend.daos.UserDao;

import java.util.List;

public interface UserService {

    List<UserDao> getAllUsers();


}
