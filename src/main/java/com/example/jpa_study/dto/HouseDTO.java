package com.example.jpa_study.dto;

import com.example.jpa_study.entity.House;
import com.example.jpa_study.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class HouseDTO {




    private String houseName;

    private String sex;

    private int roomCount;

    private Long deposit;

    private Long monthly;

    public House toEntity(){
        return House.builder()
                .houseName(houseName)
                .sex(sex)
                .roomCount(roomCount)
                .deposit(deposit)
                .monthly(monthly)
                .build();
    }
}
