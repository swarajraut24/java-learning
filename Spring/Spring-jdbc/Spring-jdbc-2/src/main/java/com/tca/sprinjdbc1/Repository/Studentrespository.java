package com.tca.sprinjdbc1.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class Studentrespository {

    @Autowired
    SimpleJdbcCall jdbcCall;

    public Map<String,Object> getgrade(int rno){
        Map<String,Object>map=jdbcCall.execute(rno);
        return  map;
    }
}
