package com.example.jpa_study.service;

import com.example.jpa_study.dto.HouseDTO;
import com.example.jpa_study.dto.UserDTO;
import com.example.jpa_study.entity.House;
import com.example.jpa_study.entity.User;
import com.example.jpa_study.repository.HouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HouseUpdateServiceImpl implements HouseUpdateService {

    private final HouseRepository houseRepository;


    @Override
    public Long registerHouse(HouseDTO dto){
        House houseEntity = dtoToHouseEntity(dto);

        houseRepository.save(houseEntity);
        return houseEntity.getId();
    }
}
