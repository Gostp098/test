package com.example.crud.controller;

import com.example.crud.entity.user;
import com.example.crud.service.userService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class userController {
    private userService UserService;
    @GetMapping("/user")
    public List<user> getUsers()
    {
        return UserService.getUsers();
    }

}
