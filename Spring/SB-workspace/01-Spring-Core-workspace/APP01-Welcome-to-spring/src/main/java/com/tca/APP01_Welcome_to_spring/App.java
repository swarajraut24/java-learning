package com.tca.APP01_Welcome_to_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tca.APP01_Welcome_to_spring.Welcomespring;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	//step 1 creating and starting container
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	
    	// step 2 get the reference of bean class in ob
    	
    	Object ob=context.getBean("wc");
    	
    	Welcomespring wb=(Welcomespring)ob;
    	
    	
    	//step3 call bean method /buisness logic
    	
    	String s=wb.getMessage();
    	
    	
    	System.out.println(s);
    	 
    	
    }
}


 
