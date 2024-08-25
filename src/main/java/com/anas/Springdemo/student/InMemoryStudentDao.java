package com.anas.Springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {


    private final List<student> STUDENTS=new ArrayList<>();

    public student save(student s) {
         STUDENTS.add(s);
        return s;
    }

    public List<student> findAllStudents() {
        return STUDENTS;
    }

    public student findByEmail(String email) {
        return STUDENTS.stream().filter(s->email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public student update(student s) {
        var studentIndex= IntStream.range(0,STUDENTS.size())
                .filter(index->STUDENTS.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1){
            STUDENTS.set(studentIndex,s);
            return s;
        }
        return null;
    }


    public void delete(String email) {
        var student=findByEmail(email);
        if(student!=null){
            STUDENTS.remove(student);
        }

    }
}
