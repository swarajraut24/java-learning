package com.tca.APP03_constructor_refer_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String args[]) {
	   
	  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	  
	  Customer ct=(Customer)context.getBean("crt");
	  
	  System.out.println("Customer id: "+ct.getCustomerid());
	  System.out.println("customer name: "+ct.getCustomername());
	  System.out.println("customer city: "+ct.getAdress().getCity());
	  System.out.println("customer pincode: "+ct.getAdress().getPincode());
	  
  }
  
  
  
}
