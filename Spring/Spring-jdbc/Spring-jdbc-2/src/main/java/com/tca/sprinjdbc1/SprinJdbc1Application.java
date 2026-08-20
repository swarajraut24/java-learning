package com.tca.sprinjdbc1;

import com.tca.sprinjdbc1.Model.Student;
import com.tca.sprinjdbc1.Repository.Studentrespository;
import com.tca.sprinjdbc1.Repository.jdbctemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

@SpringBootApplication
public class
SprinJdbc1Application {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context =
                SpringApplication.run(SprinJdbc1Application.class, args);


        Studentrespository repo=context.getBean(Studentrespository.class);
        Student ob=new Student(102,"bbb",70);

        jdbctemplate ob1=context.getBean(jdbctemplate.class);
        ob1.save(ob);


   }
}
