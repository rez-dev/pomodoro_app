package com.example.pomodoro.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
