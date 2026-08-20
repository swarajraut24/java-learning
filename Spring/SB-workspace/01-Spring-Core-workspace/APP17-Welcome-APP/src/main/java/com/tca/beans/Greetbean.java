package com.tca.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greetbean {
	
	WelcomeBean wb;
	
	public Greetbean() {
		 System.out.println("greet bean is created");
		}
	
//	@Autowired
//	public Greetbean(WelcomeBean wb) {
//	 this.wb=wb;
//	 System.out.println("greet bean is created using constructor injection");
//	}
	
	@Autowired
	public void setwb(WelcomeBean wb) {
		this.wb=wb;
	}
	
	 
  
	public void greet() {
		wb.printmessage();
	} 
}
