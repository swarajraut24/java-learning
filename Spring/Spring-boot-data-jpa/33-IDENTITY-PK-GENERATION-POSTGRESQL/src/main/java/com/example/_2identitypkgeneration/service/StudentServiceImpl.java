package com.example._2identitypkgeneration.service;


import com.example._2identitypkgeneration.Repository.StudentRepository;
import com.example._2identitypkgeneration.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

@Autowired
StudentRepository repo;

    @Override
    public Student savestudent(Student s) {
        return repo.save(s);
    }
}
