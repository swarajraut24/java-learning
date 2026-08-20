package com.tca.APP10;

public class ServiceA {
    
	private ServiceB serviceB;
	
	public ServiceA() {
		
	}
	
	public void setServiceB(ServiceB serviceB) {
		this.serviceB=serviceB;
		System.out.println("###setter injection ####");
	}
	
	public ServiceA(ServiceB serviceB) {
		this.serviceB=serviceB;
		System.out.println("***constructor injection***");
	}
}
