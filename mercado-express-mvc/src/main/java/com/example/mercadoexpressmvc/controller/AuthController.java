package com.example.mercadoexpressmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/")
    public String home() {
        return "redirect:/produtos";
    }

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }
}
