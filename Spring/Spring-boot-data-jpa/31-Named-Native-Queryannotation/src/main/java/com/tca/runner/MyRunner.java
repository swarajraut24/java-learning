package com.tca.runner;

import com.tca.DTO.StudentDto;
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
//      List<Student> ob=studentService.fetchAllstudent(75.0,Gender.MALE);
////      MyRunner.printStudents(ob);
//
//        studentService.fetchUpdatename(90.60,"xxx");

//        List<Object[]> students=studentService.fetchgenderandname(80.0,Gender.FEMALE);
//
//        for(Object[] data:students){
//            System.out.println(data[0]+":"+data[1]);
//
//        }


//        List<Object[]> students=studentService.fetchgendercount();
//
//        for(Object[] data:students){
//            System.out.println(data[0]+":"+data[1]);
//
//        }
//

        List<StudentDto> st = studentService.fetchbygender(Gender.FEMALE);

        for(StudentDto ob:st){
            System.out.println(ob);
        }

    }
}