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
       // Test code to save data
//        Student student = new Student(103,"Akanksha",99.90, Gender.FEMALE, LocalDate.now());
//        student = studentService.saveStudent(student);
//        System.out.println(student);

        // Test code to update data
//
//        Student student = new Student(101,"Pravin",89.3,Gender.MALE,LocalDate.of(2026,8,24));
//        student.setPer(66.60);
//        student.setName("Prasad");
//        student = studentService.updateStudent(student);
//
//        System.out.println("Update Student's data is ==>"+student);
//        System.out.println("\n=============================================");
//
//        Student student1 = new Student(102,"Pravin",90.60,Gender.MALE,LocalDate.of(2026,8,24));
//        student1 = studentService.saveOrUpdateStudent(student1);
//        System.out.println("\n=============================================\n");
//        System.out.println("Update Student's data is ==>"+student1);
//        System.out.println("\n=============================================");





        // Test code for FETCH DATA
//
//
//        Optional<Student> student = studentService.fetchById(102);
//
//        if(student.isPresent()){
//            Student student1 = student.get();
//            System.out.println("Roll Number : "+ student1.getStudentId());
//            System.out.println("Name        : "+ student1.getName());
//            System.out.println("Percentage  : "+ student1.getPer());
//            System.out.println("Gender      : "+student1.getGender());
//            System.out.println("DATE        : "+student1.getDate());
//            System.out.println("-".repeat(30));
//        }
//        else {
//            System.out.println("\n=========================\n");
//            System.out.println("Record not found ");
//            System.out.println("\n=========================\n");
//        }

       // Code for fetch all data
//
//        List<Student> studentList = studentService.findAllStudent();
//        MyRunner.printStudents(studentList);

        // To delete data from database

//        if(studentService.deleteById(103)){
//
//            System.out.println("=".repeat(20));
//            System.out.println("Recored Deleted successfully");
//            System.out.println("=".repeat(20));
//        }
//        else {
//            System.out.println("=".repeat(20));
//            System.out.println("No Record found ");
//            System.out.println("=".repeat(20));
//        }

      //   To save all student by List

//        Student student3 = new Student(103,"Akanksha",90.60,Gender.FEMALE,LocalDate.now());
//        Student student4 = new Student(104,"Avishkar",80.0,Gender.MALE,LocalDate.now());
//        Student student5 = new Student(105,"Pooja",95.0,Gender.FEMALE, LocalDate.now());
//        Student student6 = new Student(106,"Kaushal",85.0,Gender.MALE,LocalDate.now());
//        Student student7 = new Student(107, "Rahul", 78.5, Gender.MALE, LocalDate.now());
//        Student student8 = new Student(108, "Priya", 91.0, Gender.FEMALE, LocalDate.now());
//        Student student9 = new Student(109, "Amit", 82.5, Gender.MALE, LocalDate.now());
//        Student student10 = new Student(110, "Sneha", 88.0, Gender.FEMALE, LocalDate.now());

//
//        List<Student> students = new ArrayList<>();
//
//
//        students.add(student3);
//        students.add(student4);
//        students.add(student5);
//        students.add(student6);
//        students.add(student7);
//        students.add(student8);
//        students.add(student9);
//        students.add(student10);
//
//        students = studentService.saveAllStudent(students);


    }



}
