package ru.eruslanov.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eruslanov.demo.model.User;
import ru.eruslanov.demo.service.UserService;

import java.security.Principal;

@RestController
@RequestMapping("api/v1/user")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<User> showInfoCurrentUser(Principal principal) {
        return new ResponseEntity<>(userService.getUserByName(principal.getName()), HttpStatus.OK); // 200
    }
}