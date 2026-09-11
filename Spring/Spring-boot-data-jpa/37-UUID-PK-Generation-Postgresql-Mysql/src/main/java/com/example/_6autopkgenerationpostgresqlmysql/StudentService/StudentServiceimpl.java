package com.example._6autopkgenerationpostgresqlmysql.StudentService;

import com.example._6autopkgenerationpostgresqlmysql.Entity.Student;
import com.example._6autopkgenerationpostgresqlmysql.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentservice")
public class StudentServiceimpl implements StudentService{
    @Autowired
    StudentRepository repo;


    @Override
    public Student savestudent(Student st) {
        return repo.save(st);
    }
}
