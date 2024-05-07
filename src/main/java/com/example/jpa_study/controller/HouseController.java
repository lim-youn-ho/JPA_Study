package com.example.jpa_study.controller;

import com.example.jpa_study.dto.HouseDTO;
import com.example.jpa_study.dto.UserDTO;
import com.example.jpa_study.entity.House;
import com.example.jpa_study.entity.User;
import com.example.jpa_study.repository.HouseRepository;
import com.example.jpa_study.service.HouseUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class HouseController {

    @Autowired
    private final HouseUpdateService houseService;

    @PostMapping("/house/houseSave")
    public void houseSave(@RequestBody HouseDTO house) {
        houseService.registerHouse(house);

    }



}
