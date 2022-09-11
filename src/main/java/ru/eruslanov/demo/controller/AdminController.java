package ru.eruslanov.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/main")
    public String startPage() {
        return "main";
    }
}