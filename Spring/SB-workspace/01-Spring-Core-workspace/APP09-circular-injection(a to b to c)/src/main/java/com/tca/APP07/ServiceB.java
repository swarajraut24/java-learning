package com.tca.APP07;

public class ServiceB {
	
	private ServiceC serviceC;
	
	  public ServiceB(ServiceC serviceC) {
		  this.serviceC=serviceC;
	  }
	  
	  public void show() {
		  System.out.println("service b method");
		  serviceC.see();
	  }
	  
}
