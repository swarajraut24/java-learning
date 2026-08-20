package com.tca.sprinjdbc1.Repository;

import com.tca.sprinjdbc1.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class jdbctemplate {
    @Autowired
    JdbcTemplate jt;

    public void save (Student ob){

        String sql="insert into student values (?,?,?)";
        int status=jt.update(sql,ob.getRno(),ob.getName(),ob.getPer());
        if(status==1){
            System.out.println("data inserted succesfully");
        }
    }
}
