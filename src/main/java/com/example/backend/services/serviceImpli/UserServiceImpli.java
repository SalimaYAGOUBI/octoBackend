package com.example.backend.services.serviceImpli;

import com.example.backend.daos.UserDao;
import com.example.backend.entities.User;
import com.example.backend.repositories.UserRepository;
import com.example.backend.services.UserService;
import com.example.backend.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpli implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDao> getAllUsers() {
        List<UserDao> userDaos = new ArrayList<>();
        List<User> users = userRepository.findAll();
        if (users != null) {
            userDaos = ObjectMapperUtils.mapAll(users, UserDao.class);
        }
        return userDaos;
    }
}
