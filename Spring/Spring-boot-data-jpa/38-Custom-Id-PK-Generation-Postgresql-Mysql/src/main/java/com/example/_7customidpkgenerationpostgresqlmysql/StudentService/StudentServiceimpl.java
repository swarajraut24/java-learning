package com.example._7customidpkgenerationpostgresqlmysql.StudentService;

import com.example._7customidpkgenerationpostgresqlmysql.Entity.Student;
import com.example._7customidpkgenerationpostgresqlmysql.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceimpl implements  StudentService{

    @Autowired
    StudentRepository repo;

    @Override
    public Student savestudent(Student st) {
        return repo.save(st);
    }
}
