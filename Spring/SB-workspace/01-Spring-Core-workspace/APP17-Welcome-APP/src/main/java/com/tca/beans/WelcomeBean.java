package com.tca.beans;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean {
   
	public WelcomeBean() {
		System.out.println("Welcome bean is created");
	}
	public void printmessage() {
		System.out.println("welcome bean");
	}
}
