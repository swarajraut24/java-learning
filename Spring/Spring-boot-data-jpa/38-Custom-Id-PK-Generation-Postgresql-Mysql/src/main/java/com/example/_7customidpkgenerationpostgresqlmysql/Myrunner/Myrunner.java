package com.example._7customidpkgenerationpostgresqlmysql.Myrunner;

import com.example._7customidpkgenerationpostgresqlmysql.Entity.Student;
import com.example._7customidpkgenerationpostgresqlmysql.StudentService.StudentService;
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
        Student st=new Student();
        st.setName("AAA");
        st.setPer(89.54);
        st.setBirthDate(LocalDate.now());

        Student s=service.savestudent(st);

        System.out.println(s);
    }
}
