package com.tca.APP03_constructor_refer_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class App {
  public static void main(String args[]) {
	   
	  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	  

  	 
  	Student st=(Student)context.getBean("std");
  	
  	System.out.println("rno:"+st.getRno());
  	System.out.println("name:"+st.getName());
  	System.out.println("per:"+st.getPer());
  	
  	System.out.println("passportno: "+st.getPassportno());
	  
  }
  
  
  
}
