package com.sohnny.auth.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/j")
public class J {
    @RequestMapping("/")
    public String j() {
        return "j";
    }
}
