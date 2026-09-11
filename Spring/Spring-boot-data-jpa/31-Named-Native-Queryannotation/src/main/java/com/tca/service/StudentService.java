package com.tca.service;

import com.tca.DTO.StudentDto;
import com.tca.Enums.Gender;
import com.tca.entity.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface StudentService {

    public List<Student> fetchAllstudent(Double per, Gender gender);
    public  void  fetchUpdatename(Double per,String name);
    public List<Object[]> fetchgenderandname(Double per,Gender gender);
    public List<Object[]> fetchgendercount();
    public List<StudentDto> fetchbygender(Gender gender);

 }