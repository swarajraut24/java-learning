package com.tca.service;

import com.tca.Enums.Gender;
import com.tca.Repository.StudentRepository;
import com.tca.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Optional<Student> fetchById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Student> findAllStudent() {
        return null;
    }

    @Override
    public List<Student> fetchByGender(Gender gender) {
        return studentRepository.findByGender(gender);
    }

    @Override
    public List<Student> fetchByDate(LocalDate d) {
        return studentRepository.findByDate(d);
    }

    @Override
    public List<Student> fetchBydategreater(LocalDate d) {
        return  studentRepository.findByDateGreaterThan(d);
    }

    @Override
    public List<Student> fetchByPerBetween(double start, double end) {
        return studentRepository.findByPerBetween(start,end);
    }
}
