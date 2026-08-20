package com.tca;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.config.AppConfig;
import com.tca.model.Student;
import com.tca.service.Studentservice;

 
public class App {
    public static void main(String[] args) {
         
    	 ApplicationContext  context=new  AnnotationConfigApplicationContext(AppConfig.class);
    	
    	 Studentservice s= context.getBean(Studentservice.class);
    	 
//    	 Student st=s.getByid("SB-1");
//    	 
//    	 if(st==null) {
//    		 System.out.println("Student not found");
//    	 }
//    	 
//    	 else {
//    		 System.out.println("Student id:"+st);
//    	 }
//    	 
    	 
    	 Map<String,Student> hm=s.getByfull();
    	 
    	 Set<Entry<String,Student>> entryset=hm.entrySet();
    	 
    	 for(Entry<String,Student> et:entryset)
    	 {
    		 System.out.println("Student Id:"+et.getKey());
    		 System.out.println("Student data:"+et.getValue());
    	 }
    }
}
