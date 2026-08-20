package com.tca.APP08;

public class ServiceA {
  private ServiceB serviceB;
  
  public ServiceA(ServiceB serviceB) {
	  this.serviceB=serviceB;
  }

  public void display() {
	  System.out.println("service a method");
	 
  }
  
}
