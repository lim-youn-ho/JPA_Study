package com.example.jpa_study.controller;

import com.example.jpa_study.dto.UserDTO;
import com.example.jpa_study.repository.UserRepository;
import com.example.jpa_study.service.UserUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BaseController {

    private final UserRepository userRepository;
    @Autowired
    private UserUpdateService service;
    @PostMapping("/users/save")
    public void personSave(@RequestBody UserDTO user) {
        service.register(user);

    }

}
