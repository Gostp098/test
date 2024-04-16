package com.example.crud.service;

import com.example.crud.entity.user;
import com.example.crud.repository.userRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class userService {
    private userRepository UserRepository;
    public List<user> getUsers() {
       return UserRepository.findAll() ;
    }
}
