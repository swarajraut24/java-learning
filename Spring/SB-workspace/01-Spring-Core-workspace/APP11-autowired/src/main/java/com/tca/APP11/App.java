package com.tca.APP11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App {
    public static void main(String[] args) {
         

    	ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	
    	 ReportManager rt=(ReportManager)context.getBean("ReportManager");
    	 
    	 rt.report();

    }
}
