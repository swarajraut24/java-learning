package com.tca.APP13;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServiceA implements BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean {
    
	private String message;
	
	public ServiceA() {
		System.out.println("bean creation");
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setter injection"+message);
	}
     
	public void serviceamethod() {
		System.out.println("serviceA method");
	}
	
	public void myinit() {
		System.out.println("custom:intilization");
	}
	
	public void mydestroy()
	{
		System.out.println("custom:destroy");
	}
	
	
	@Override
	public void setBeanName(String name) {
		 System.out.println("id name:"+name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		 
		 
    	
    	ServiceA ob= applicationContext.getBean(ServiceA.class);
    	
		System.out.println("Context:spring container");
	}

	@Override
	public void destroy() throws Exception {
	 System.out.println("destroying bean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("Initialiazing Bean");
	}
	
	
	
	
}
