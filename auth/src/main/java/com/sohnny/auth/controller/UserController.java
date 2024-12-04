package com.sohnny.auth.controller;

import com.sohnny.auth.entity.Users;
import com.sohnny.auth.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by feng on 2024/12/4
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("")
    public ResponseEntity<List<Users>> user() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Users> user(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userRepository.findById(id).orElse(null));
    }

    @PostMapping("/save")
    public ResponseEntity<Users> save(@RequestBody Users user) {
        if (user != null) {
            user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
            return ResponseEntity.ok(userRepository.save(user));
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/save1")
    public ResponseEntity<Users> save1() {
        log.info("user: ");
        return ResponseEntity.badRequest().build();
    }


}
