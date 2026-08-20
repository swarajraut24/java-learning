package com.tca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tca.bean2.A;

@SpringBootApplication
public class App17WelcomeAppApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context=	SpringApplication.run(App17WelcomeAppApplication.class, args);
	
	A a = context.getBean(A.class);
	a.methodA();
	
    
	}

}
