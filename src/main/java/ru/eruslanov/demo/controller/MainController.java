package ru.eruslanov.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.eruslanov.demo.service.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/main")
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getShowMainPage(Model model, Principal principal) {
        model.addAttribute("authUser", userService.getUserByUsername(principal.getName()));
        return "main";
    }
}
