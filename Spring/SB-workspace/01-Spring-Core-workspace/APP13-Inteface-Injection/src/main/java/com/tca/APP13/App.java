package com.tca.APP13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App {
    public static void main(String[] args) {
         
    	ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
    	
    	ServiceA ob= context.getBean(ServiceA.class);
    	
    	ob.serviceamethod();
    	
    	context.close();
    	
    			
    }
}
