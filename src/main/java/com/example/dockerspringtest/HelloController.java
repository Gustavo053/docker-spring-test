package com.example.dockerspringtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello! This application are running in a docker container";
    }
}
