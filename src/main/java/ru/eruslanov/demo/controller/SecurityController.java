package ru.eruslanov.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.eruslanov.demo.service.UserService;

import java.security.Principal;

@Controller
public class SecurityController {
    private final UserService userService;

    public SecurityController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/main")
    public String openStartPage(Model model, Principal principal) {
        model.addAttribute("authUser", userService.getUserByName(principal.getName()));
        return "main";
    }

    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/main")
    public String redirectToMainPage() {
        return "redirect:/main";
    }
}
