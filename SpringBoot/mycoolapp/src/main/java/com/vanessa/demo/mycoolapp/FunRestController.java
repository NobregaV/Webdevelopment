package com.vanessa.demo.mycoolapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
//    espose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is " + LocalDateTime.now();

      @Value("${coach.name}")
              private String coachName;

      @Value("${team.name}")
              private String teamName;
    }

@PostMapping
}
