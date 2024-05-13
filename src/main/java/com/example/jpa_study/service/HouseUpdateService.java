package com.example.jpa_study.service;

import com.example.jpa_study.dto.HouseDTO;
import com.example.jpa_study.dto.UserDTO;
import com.example.jpa_study.entity.House;
import com.example.jpa_study.entity.User;

public interface HouseUpdateService {
    Long registerHouse(HouseDTO dto);

    Long deleteHouse(HouseDTO dto);


    default House dtoToHouseEntity(HouseDTO dto){
        House houseEntity = House.builder()
                .houseName(dto.getHouseName())
                .sex(dto.getSex())
                .roomCount(dto.getRoomCount())
                .deposit(dto.getDeposit())
                .monthly(dto.getMonthly())
                .build();
        return houseEntity;
    }
}

