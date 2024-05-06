package com.example.jpa_study.repository;

import com.example.jpa_study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<User, Long> {
}
