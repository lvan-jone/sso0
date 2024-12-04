package com.sohnny.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by feng on 2024/12/4
 */
@Slf4j
@RestController
@RequestMapping
public class LoginController {
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String login() {
        return "login";
    }
}
