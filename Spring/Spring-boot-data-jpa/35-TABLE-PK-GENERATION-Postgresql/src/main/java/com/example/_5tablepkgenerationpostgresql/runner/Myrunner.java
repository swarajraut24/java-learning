package com.example._5tablepkgenerationpostgresql.runner;

import com.example._5tablepkgenerationpostgresql.Entity.Student;
import com.example._5tablepkgenerationpostgresql.Gender.Gender;
import com.example._5tablepkgenerationpostgresql.Service.StudentService;
import com.example._5tablepkgenerationpostgresql.Service.StudentServiceimpl;
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
          Student st= new Student();
        st.setName("AAA");
        st.setPer(80.45);
        st.setGender(Gender.MALE);
        st.setBirthDate(LocalDate.now());

         Student s=service.savestudent(st);

         System.out.println(s);

    }
}
