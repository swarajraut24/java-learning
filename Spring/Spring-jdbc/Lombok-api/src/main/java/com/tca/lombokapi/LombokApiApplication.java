package com.tca.lombokapi;

import com.tca.lombokapi.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApiApplication {

    public static void main(String[] args) {


//        SpringApplication.run(LombokApiApplication.class, args);

        Student ob1=new Student(101,"aaa",89.54);
        Student ob2=new Student(101,"aaa",89.54);

        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());


    }

}
