package com.tca.service;

import com.tca.DTO.StudentDto;
import com.tca.Enums.Gender;
import com.tca.Repository.StudentRepository;
import com.tca.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {



    @Autowired
    StudentRepository repo;

    @Override
    public List<Student> fetchAllstudent(Double per, Gender gender) {
        return repo.findAll(per,gender);
    }

    @Override
    public void fetchUpdatename(Double per, String name) {
         repo.updateName(per,name);
    }

    @Override
    public List<Object[]> fetchgenderandname(Double per, Gender gender) {
        return repo.findgenderandname(per,gender);
    }

    @Override
    public List<Object[]> fetchgendercount() {
        return repo.findgendercount();
    }

    @Override
    public List<StudentDto> fetchbygender(Gender gender) {
        List<Student>students=repo.findgender(gender);
        List<StudentDto> dtolist=new ArrayList<>();

        for(Student st:students){
            StudentDto ob=convertDto(st);
            dtolist.add(ob);
        }
        return  dtolist;
    }

    public StudentDto convertDto(Student students){
          StudentDto ob=new StudentDto();

         ob.setName(students.getName());
         ob.setPer(students.getPer());

          return ob;
    }



}
