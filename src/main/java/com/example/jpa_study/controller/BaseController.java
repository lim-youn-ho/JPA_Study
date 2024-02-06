package com.example.jpa_study.controller;

import com.example.jpa_study.entity.User;
import com.example.jpa_study.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class BaseController {

    private final UserRepository userRepository;
    @PostMapping("/users/save")
    public void personSave(@RequestBody User user) {
        userRepository.save(user);

    }

}
