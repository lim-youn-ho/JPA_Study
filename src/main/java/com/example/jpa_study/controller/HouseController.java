package com.example.jpa_study.controller;

import com.example.jpa_study.dto.HouseDTO;
import com.example.jpa_study.dto.UserDTO;
import com.example.jpa_study.entity.House;
import com.example.jpa_study.entity.User;
import com.example.jpa_study.repository.HouseRepository;
import com.example.jpa_study.repository.UserRepository;
import com.example.jpa_study.service.HouseUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class HouseController {

    private final HouseRepository houseRepository;
    @Autowired
    private final HouseUpdateService houseService;

    @PostMapping("/house/houseSave")
    public void houseSave(@RequestBody HouseDTO house) {
        houseService.registerHouse(house);

    }


    @PutMapping("/house/{id}")
    public void houseUpdate(@PathVariable Long id, @RequestBody House requestHouse) {
        House house = houseRepository.findById(id).orElseThrow(() -> {
            throw new IllegalArgumentException("해당하는 지점 아이디가 없습니다 id : " + id);
        });

        houseRepository.save(requestHouse);
    }

    @PostMapping("/house/houseDelete")
    public void houseDelete(@RequestBody HouseDTO house) {
        houseService.deleteHouse(house);

    }



}
