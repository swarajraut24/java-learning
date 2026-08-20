package com.tca.APP08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class App {
  public static void main(String args[]) {
	   
	  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	  
      ServiceB aob=(ServiceB) context.getBean("sb");
      
       aob.show();
  	 
	  
  }
  
  
}
