package com.tca.APP07;

public class ServiceA {
  private ServiceB serviceB;
  
  public void setServiceB(ServiceB serviceB) {
	this.serviceB = serviceB;
}

  public void display() {
	  System.out.println("service a method");
	  serviceB.show();
  }
  
}
