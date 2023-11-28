package com.naisacul.challengebackendpicpay.controllers;

import com.naisacul.challengebackendpicpay.domain.user.User;
import com.naisacul.challengebackendpicpay.dtos.UserDTO;
import com.naisacul.challengebackendpicpay.services.UserService;
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

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO){

        User newUser = userService.createUser(userDTO);

        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> users =  this.userService.getAllUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
