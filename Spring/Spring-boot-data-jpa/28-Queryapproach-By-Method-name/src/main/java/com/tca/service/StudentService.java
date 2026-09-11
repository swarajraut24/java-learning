package com.tca.service;

import com.tca.Enums.Gender;
import com.tca.entity.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface StudentService {


    public Optional<Student> fetchById(Integer id);

    public Iterable<Student> findAllStudent();

   public  List<Student> fetchByGender(Gender gender);

   public  List<Student> fetchByDate(LocalDate d);

   public  List<Student> fetchBydategreater(LocalDate d);

   public  List<Student> fetchByPerBetween(double start, double end);

}
