package com.example.jpa_study.service;

import com.example.jpa_study.dto.UserDTO;
import com.example.jpa_study.entity.User;

public interface UserUpdateService {

    Long register(UserDTO dto);
    default User dtoToEntity(UserDTO dto){
        User entity = User.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .build();
        return entity;
    }
}
