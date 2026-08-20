package com.tca;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
 

 @Component
 @PropertySource("email.properties")
 @PropertySource("admin.properties")

public class App {
	 

 	@Value("${admin.id}")
 	int id;
 	
 	@Value("${admin.port}")
 	int port;
 	
 	@Value("${admin.user}")
 	String user;
 	
 	@Value("${admin.password}")
 	int password;
 	
 	
 	
 	public void display() {
 		System.out.println(id);
 		System.out.println(port);
 		System.out.println(user);
 		System.out.println(password);
 	}
 	
    public static void main(String[] args) {
         

        ApplicationContext context =
                new AnnotationConfigApplicationContext(App.class);

        App a = context.getBean(App.class);
        
        a.display();
        
   
   
    }
}
