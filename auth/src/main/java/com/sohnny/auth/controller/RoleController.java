package com.sohnny.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by feng on 2024/12/4
 */
@RestController
@RequestMapping("/role")
@Slf4j
public class RoleController {
    @GetMapping("")
    public String role() {
        return "role";
    }
}
