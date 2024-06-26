package com.example.jpa_study.service;

import com.example.jpa_study.dto.UserDTO;
import com.example.jpa_study.entity.User;
import com.example.jpa_study.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserUpdateServiceImpl implements UserUpdateService{
    private final UserRepository userRepository;
    //dtoToEntity 는 UserUpdateService 에서 상속
    //controller에서 UserUpdateService.register 사용
    @Override
    public Long register(UserDTO dto){
        User entity = dtoToEntity(dto);

        userRepository.save(entity);
        return entity.getId();
    }
}
