package com.example._6autopkgenerationpostgresqlmysql.Myrunner;

import com.example._6autopkgenerationpostgresqlmysql.Entity.Student;
import com.example._6autopkgenerationpostgresqlmysql.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Myrunner implements ApplicationRunner {

    @Autowired
    StudentService service;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Student s=new Student();
        s.setName("AAA");
        s.setPer(76.95);
        s.setBirthDate(LocalDate.now());
         Student st=service.savestudent(s);

         System.out.println(st);
    }
}
