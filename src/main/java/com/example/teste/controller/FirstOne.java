package com.example.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FirstOne")
public class FirstOne {
    @GetMapping

    public String oi(){
        return "oi";
    }

}
