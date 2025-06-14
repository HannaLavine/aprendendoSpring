package com.example.teste;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/inicio")

    public String oi(){
        return "oi";
    }


}
