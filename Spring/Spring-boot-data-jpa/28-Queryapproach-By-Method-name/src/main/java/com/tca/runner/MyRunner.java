package com.tca.runner;

import com.tca.Enums.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Component
public class MyRunner implements ApplicationRunner {

    public static void printStudents(List<Student> list){
        if(list.isEmpty()) System.out.println("No single record found.");
        for (Student student : list){
            System.out.println("Roll Number : "+ student.getStudentId());
            System.out.println("Name        : "+ student.getName());
            System.out.println("Percentage  : "+ student.getPer());
            System.out.println("Gender      : "+student.getGender());
            System.out.println("DATE        : "+student.getDate());
            System.out.println("=".repeat(30));
        }
    }


    @Autowired
    StudentService studentService;
    @Override
    public void run(ApplicationArguments args) throws Exception {

     List<Student>student=studentService.fetchByGender(Gender.MALE);


     // find by  genderwise
//     List<Student> student1=studentService.fetchByDate(LocalDate.of(2026,8,31));
//
//     if(student1.isEmpty()){
//         System.out.println("No student found for gender");
//     }
//else {
//         System.out.println("gender wise list of student");
//         MyRunner.printStudents(student1);
//     }

//find by birthdate
//        List<Student> student1=studentService.fetchByDate(LocalDate.of(2026,8,31));
//
//     if(student1.isEmpty()){
//         System.out.println("No student found for birthdate");
//     }
//else {
//         System.out.println("birthdate wise list of student");
//         MyRunner.printStudents(student1);
//     }

        //find by greater than
//
//        List<Student> st=studentService.fetchBydategreater(LocalDate.of(2026,8,24));
//
//        if(st.isEmpty()){
//            System.out.println("No student found greated than  birthdate");
//        }
//        else {
//            System.out.println("greater than birthdate wise list of student");
//            MyRunner.printStudents(st);
//        }



        List<Student> st1=studentService.fetchByPerBetween(60.0,70.0);

        if(st1.isEmpty()){
            System.out.println("No student found with given percenetage");
        }
        else {
            System.out.println("no of student having percentage ");
            MyRunner.printStudents(st1);
        }

    }



}
