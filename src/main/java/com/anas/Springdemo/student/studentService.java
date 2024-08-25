package com.anas.Springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface studentService {
   student save(student s);

 List<student> findAllStudents() ;

 student findByEmail(String email);

 student update(student s);

 void  delete(String email);
}
