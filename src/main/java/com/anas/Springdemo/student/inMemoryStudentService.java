package com.anas.Springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service("im")
public class inMemoryStudentService implements studentService {

    private  final InMemoryStudentDao dao;

    public inMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public student save(student s) {
        return dao.save(s);
    }

    @Override
    public List<student> findAllStudents() {
        return dao.findAllStudents();
}

    @Override
    public student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public student update(student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}
