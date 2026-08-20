package com.tca.APP07;

public class ServiceC {
   
	ServiceA serviceA;
	
	public ServiceC(ServiceA serviceA) {
		this.serviceA=serviceA;
	}
	
	public void see() {
		 System.out.println("service c method");
	}
}
