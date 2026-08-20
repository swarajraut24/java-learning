package com.tca.sprinjdbc1;

import com.tca.sprinjdbc1.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class Jdbctemplate1 {

    @Autowired
    JdbcTemplate jt;

     public void savestudent(Student ob) {
         String sql = "Insert into Student values(?,?,?,?)";
         int no_of_affectedrows = jt.update(sql, ob.getRno(), ob.getName(), ob.getPer(), ob.getCity());

         if (no_of_affectedrows >0 ) {
             System.out.println("data inserted succesfully!!");
         }
         else {
             System.out.println("data is not inserted");
         }

     }

     public void deletestudent(int trno,Student ob){
         String sql="delete from Student where rno=?";
         int no_of_affectedrows=jt.update(sql,trno);

         if (no_of_affectedrows >0 ) {
             System.out.println("data deleted succesfully!!");
         }
         else {
             System.out.println("data is not deleted");
         }
    }


    public Map<String, Object> findByid(int trno){

         String sql="select * from Student where rno=?";
         return jt.queryForMap(sql,trno);
    }

    public List<Map<String, Object>> findByAll(){
         String sql="select * from Student";
         return jt.queryForList(sql);
    }

    public Map<String, Object> findBycity(String tcity){

        String sql="select * from Student where city=?";
        return jt.queryForMap(sql, tcity);
    }

}
