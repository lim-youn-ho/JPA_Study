package com.example.jpa_study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Table(name = "user_table")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "user_name",length = 10)
    private String name;

    @Column(name = "user_age")
    private int age;

}
