package com.tca.sprinjdbc1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;

@Configuration
public class Myconfig {

    @Bean
    public SimpleJdbcCall getJdbcCall(DataSource source){
        return  new SimpleJdbcCall(source).withFunctionName("getgrade");
    }
}
