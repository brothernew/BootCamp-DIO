package com.pedrada.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/Hello")
    public String helloMessage(){
        return "Olá, Thiago Pedrada!";
    }
}
