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
public class User extends BaseTimeEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        @Column(name = "user_name",length = 10)
        private String name;

        @Column(name = "user_age", nullable = false)
        private int age;

        @Column(name = "user_password", nullable = false)
        private String password;

        
        @Builder //빌더 패턴
        public User(String name, Integer age,String password){
            this.name = name;
            this.age = age;
            this.password = password;
        }


}
