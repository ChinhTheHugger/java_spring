package com.example.test_java_spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotaion.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
    
}
