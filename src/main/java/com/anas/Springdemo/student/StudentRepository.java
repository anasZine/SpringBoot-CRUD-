package com.anas.Springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student,Integer > {
    student findByEmail(String email);
    void deleteByEmail(String email);
}
