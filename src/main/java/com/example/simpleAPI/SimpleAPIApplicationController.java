package com.example.simpleAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAPIApplicationController {
    @GetMapping(value = "/welcome")
    public String hello() {

       return "Hello World";
    }
}
