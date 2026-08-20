package com.tca.sprinjdbc1;

import com.tca.sprinjdbc1.Model.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.tca.sprinjdbc1.Jdbctemplate1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@SpringBootApplication
public class SprinJdbc1Application {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context =
                SpringApplication.run(SprinJdbc1Application.class, args);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Enter user choice by city/id or ALL:");
//        String choice = br.readLine();


//        Student ob= new Student("ccc",50.0,"goa",103);

        Jdbctemplate1 ob1 = context.getBean(Jdbctemplate1.class);


        List<Map<String, Object>> l1=ob1.findByAll();

        for (Map<String, Object> map : l1) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }
            System.out.println("------------------------");
        }

//        if (Objects.equals(choice, "id")) {
//
//            int id;
//            System.out.println("Enter rno:");
//            id = Integer.parseInt(br.readLine());
//
//            Map<String, Object> map = ob1.findByid(id);
//
//            map.forEach((key, value) -> {
//                System.out.println(key + " : " + value);
//            });
//        }
//
//        if (Objects.equals(choice, "city")) {
//
//            String name;
//            System.out.println("Enter city name:");
//            name = br.readLine();
//
//            Map<String, Object> map = ob1.findBycity(name);
//
//            map.forEach((key, value) -> {
//                System.out.println(key + " : " + value);
//            });
//        }
//
//        if (Objects.equals(choice, "ALL")) {
//
//            List<Map<String, Object>> l1=ob1.findByAll();
//
//            for (Map<String, Object> map : l1) {
//                for (Map.Entry<String, Object> entry : map.entrySet()) {
//                    System.out.println(entry.getKey() + " : " + entry.getValue());
//
//                }
//                System.out.println("------------------------");
//            }
//
//        }
//
//
   }
}
