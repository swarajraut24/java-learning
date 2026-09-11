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

    public static void printscalarstudents(List<Object[]> students){
        if(students.isEmpty()) System.out.println("No single record found.");
        for (Object[] ob : students){

            System.out.println("Gender:"+ob[0]);
            System.out.println("Name:"+ob[1]);
            System.out.println("Per:"+ob[2]);

            System.out.println("=".repeat(30));
        }
    }

    @Autowired
    StudentService studentService;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        //to get all students
//
//        List<Student>students=studentService.fetchAllStudent();
//
//        MyRunner.printStudents(students);

        //findpercentageofrange
//        List<Student>students1=studentService.fetchpercentagerangeusingjpql(60.0,90.0);
//        MyRunner.printStudents(students1);


        //scalar projection with jpql
//        List<Object[]> student=studentService.fetchgendernameperscalarprojectionjpql(90.6,Gender.FEMALE);
//        MyRunner.printscalarstudents(student);

        //scalar projection with sql
//        List<Object[]> student=studentService.fetchgendernameperscalarprojectionsql(90.6,Gender.FEMALE);
//        MyRunner.printscalarstudents(student);

         //delete using @Modifyingg and @Transactional
//        studentService.deleteperandgender(70.0,Gender.MALE);


        //update using @Moddifyig and @transactional
        studentService.updatename("zzz",90.60);
    }



}
