package com.example._2identitypkgeneration.runner;


import com.example._2identitypkgeneration.Enums.Gender;
import com.example._2identitypkgeneration.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.example._2identitypkgeneration.service.StudentService;

import java.time.LocalDate;
import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {
    public static void printStudents(List<Student> list) {
        if (list.isEmpty()) System.out.println("No single record found.");
        for (Student student : list) {
            System.out.println("Roll Number : " + student.getStudentId());
            System.out.println("Name        : " + student.getName());
            System.out.println("Percentage  : " + student.getPer());
            System.out.println("Gender      : " + student.getGender());
            System.out.println("DATE        : " + student.getDate());
            System.out.println("=".repeat(30));
        }
    }


    @Autowired
    StudentService studentService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

         Student st= new Student();
         st.setName("ccc");
         st.setPer(80.0);
         st.setGender(Gender.MALE);
         st.setDate(LocalDate.now());

        Student returnstudent= studentService.savestudent(st);
        System.out.println("primary key:"+returnstudent.getStudentId());

    }
}