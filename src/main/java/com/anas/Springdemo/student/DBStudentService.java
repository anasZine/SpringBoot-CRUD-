package com.anas.Springdemo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("db")

public class DBStudentService implements studentService{

    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public student save(student s) {
        return repository.save(s);
    }

    @Override
    public List<student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public student update(student s) {
        return repository.save(s);
    }

    @Override
    public void delete(String email) {
        repository.findByEmail(email);

    }
}
