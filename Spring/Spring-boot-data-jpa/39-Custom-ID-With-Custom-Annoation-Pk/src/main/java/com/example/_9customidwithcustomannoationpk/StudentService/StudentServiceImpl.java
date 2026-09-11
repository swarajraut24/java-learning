package com.example._9customidwithcustomannoationpk.StudentService;

import com.example._9customidwithcustomannoationpk.Entity.Student;
import com.example._9customidwithcustomannoationpk.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository repo;

    @Override
    public Student savestudent(Student st) {
        return repo.save(st);
    }
}
