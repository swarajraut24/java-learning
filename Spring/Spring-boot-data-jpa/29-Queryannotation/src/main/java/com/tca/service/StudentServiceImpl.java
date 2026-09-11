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
    StudentRepository repo;


    @Override
    public List<Student> fetchAllStudent() {
        return repo.findAllusingsql();
    }

    @Override
    public List<Student> fetchpercentagerangeusingjpql(Double start,Double end) {
//        return repo.findpercentagerangeusingjpql(start,end);
//        return repo.findpercentagerangeusingsql(start,end);
        return repo.findperrangeusingnamedparamter(start,end);
    }

    @Override
    public List<Object[]> fetchgendernameperscalarprojectionjpql(Double per,Gender gender) {
        return repo.findgendernameper(per,gender);
    }

    @Override
    public List<Object[]> fetchgendernameperscalarprojectionsql(Double per, Gender gender) {
        return repo.findgendernamepersql(per,gender);
    }

    @Override
    public void deleteperandgender(Double per, Gender gender) {
        repo.deleteByperandgender(per,gender);
    }

    @Override
    public void updatename(String name, Double per) {
        repo.updatebyname(name,per);
    }
}
