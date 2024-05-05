package com.example.jpa_study.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "house_name",length = 10)
    private String houseName;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "room_count", nullable = false)
    private int roomCount;

    @Column(name = "deposit")
    private Long deposit;

    @Column(name = "monthly")
    private Long monthly;



    @Builder //빌더 패턴
    public House(Long id,String houseName, String sex,int roomCount,Long deposit,Long monthly){
        this.id = id;
        this.houseName = houseName;
        this.sex = sex;
        this.roomCount = roomCount;
        this.deposit = deposit;
        this.monthly = monthly;
    }
}
