package com.user.service.UserServices.services.impl;

import com.user.service.UserServices.ResourceNotFoundException;
import com.user.service.UserServices.entities.User;
import com.user.service.UserServices.repositories.UserRepository;
import com.user.service.UserServices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
        //ddgvv
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user with given id is not found on!!: "+userId));
    }

    ;
    public void  test (){

    }
}
