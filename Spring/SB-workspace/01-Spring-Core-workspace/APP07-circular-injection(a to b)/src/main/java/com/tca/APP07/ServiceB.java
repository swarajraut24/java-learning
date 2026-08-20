package com.tca.APP07;

public class ServiceB {
	
	private ServiceA serviceA;
	
	  public ServiceB(ServiceA serviceA) {
		  this.serviceA=serviceA;
	  }
	  
	  public void show() {
		  System.out.println("service b method");
	  }
	  
}
