package com.example.jpa_study.controller;

import com.example.jpa_study.dto.UserDTO;
import com.example.jpa_study.entity.User;
import com.example.jpa_study.repository.UserRepository;
import com.example.jpa_study.service.UserUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/users/{id}")
    public void update(@PathVariable Long id, @RequestBody User requestUser) {
        User user = userRepository.findById(id).orElseThrow(() -> {
            // IllegalArgumentException 예외 처리
            throw new IllegalArgumentException("해당하는 아이디가 없습니다 id : " + id);
        });

       // user.setPassword(requestUser.getPassword());

        userRepository.save(user);
    }

}
