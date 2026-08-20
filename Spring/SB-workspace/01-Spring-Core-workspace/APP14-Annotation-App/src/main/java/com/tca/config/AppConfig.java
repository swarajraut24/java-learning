package com.tca.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.tca.model.Student;

@Configuration
@ComponentScan("com.tca")
public class AppConfig {
   
	@Bean
	@Primary
	public Map<String,Student> Studentstore(){
		
		Student ob1= new Student("Sachin","newSangvi",60);
		
		Student ob2= new Student("Sourabh","Aundh",70);
		
	  Map<String ,Student> hm=new HashMap<>();
	  
	  hm.put("SB-1", ob1);
	  hm.put("SB-2", ob2);
	  
	  return hm;
	}
	
	
	@Bean
	public Map<String,Student> Studentstore1(){
		
		Student ob1= new Student("AAA","newSangvi",60);
		
		Student ob2= new Student("BBB","Aundh",70);
		
	  Map<String ,Student> hm=new HashMap<>();
	  
	  hm.put("SB-1", ob1);
	  hm.put("SB-2", ob2);
	  
	  return hm;
	}
	
	
}
