package com.user.service.UserServices.controllers;

import com.user.service.UserServices.entities.User;
import com.user.service.UserServices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService;

    //create

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);

    }
        @GetMapping("/{userId}")
        //single user get
        public ResponseEntity<User> getSingleUser(@PathVariable("userId") String userId){
            User user = userService.getUser(userId);
            return ResponseEntity.ok(user);
        }

        //all user get

        @GetMapping
        public ResponseEntity<List<User>> getAllUser() {
            List<User> allUser = userService.getAllUser();
            return ResponseEntity.ok(allUser);
        }
    }

