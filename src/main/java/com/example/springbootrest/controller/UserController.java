package com.example.springbootrest.controller;


import com.example.springbootrest.entity.UserEntity;
import com.example.springbootrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public ResponseEntity creation(@RequestBody UserEntity user) {
        try {
            userRepository.save(user);
            return ResponseEntity.ok("User created");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
