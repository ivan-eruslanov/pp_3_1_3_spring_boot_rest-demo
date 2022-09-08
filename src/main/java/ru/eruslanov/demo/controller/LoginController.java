package ru.eruslanov.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String getShowLoginPage() {
        return "login";
    }

    @PostMapping("/main")
    public String redirectToMainPage() {
        return "redirect:/main";
    }
}
