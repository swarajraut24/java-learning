package com.tca.service;

import com.tca.Enums.Gender;
import com.tca.entity.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface StudentService {

    public  List<Student> fetchAllStudent();
    public List<Student> fetchpercentagerangeusingjpql(Double start,Double end);
    public  List<Object[]> fetchgendernameperscalarprojectionjpql(Double per,Gender gender);
    public  List<Object[]> fetchgendernameperscalarprojectionsql(Double per,Gender gender);
    public void  deleteperandgender(Double per,Gender gender);
    public void updatename(String name,Double per);
}
