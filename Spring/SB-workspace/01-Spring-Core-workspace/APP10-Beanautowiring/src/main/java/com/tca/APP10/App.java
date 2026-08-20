package com.tca.APP10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        
    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	
    	ServiceA serviceA=(ServiceA)context.getBean("serviceA");
    	
    	  
    	
    }
}
