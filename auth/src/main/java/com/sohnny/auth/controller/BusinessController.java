package com.sohnny.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @RequestMapping("/")
    public String j() {
        return "j";
    }
}
