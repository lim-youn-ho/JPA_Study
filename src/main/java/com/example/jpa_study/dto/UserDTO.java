package com.example.jpa_study.dto;


import com.example.jpa_study.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;



@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private String name;
    private int age;

    public User toEntity(){
        return User.builder()
                .name(name)
                .age(age)
                .build();
    }

}
