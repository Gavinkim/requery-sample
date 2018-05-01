package com.example.requery.controller;

import com.example.requery.entity.User;
import com.example.requery.entity.UserEntity;
import com.example.requery.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author gavin on 2018. 5. 1.
 */
@RestController("/user")
public class UserController {

    @Autowired
    UserRepositoryImpl userRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User register(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    @GetMapping
    public User get(@RequestParam("id") int id) {
        return userRepository.findById(id);
    }


}
