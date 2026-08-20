package com.tca.sprinjdbc1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class myrunner implements ApplicationRunner {

    @Autowired
    JdbcTemplate jt;

    @Override
    public void run(ApplicationArguments args) throws Exception {

     jt.execute("DROP  table if exists student");

     System.out.println("Table is dropped");

     jt.execute("Create table student(rno int primary key ,name varchar(13),per double,city varchar(23))");

     System.out.println("table is created");

        jt.update("INSERT into student values (101,'aaa',87.32,'Barshi')");
        jt.update("INSERT into student values (102,'bbb',67.8,'Pune')");
        jt.update("INSERT into student values (103,'ccc',56.4,'Solapur')");
        jt.update("INSERT into student values (104,'ddd',32.0,'Goa')");

        System.out.println("*************Table is intialized********************");
    }
}
