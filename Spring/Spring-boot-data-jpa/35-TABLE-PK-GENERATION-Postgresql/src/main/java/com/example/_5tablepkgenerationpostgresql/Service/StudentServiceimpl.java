package com.example._5tablepkgenerationpostgresql.Service;

import com.example._5tablepkgenerationpostgresql.Entity.Student;
import com.example._5tablepkgenerationpostgresql.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("studentservice")
public class StudentServiceimpl implements  StudentService{
    @Autowired
    StudentRepository repo;
    @Override
    public Student savestudent(Student s) {
        return repo.save(s);
    }
}
