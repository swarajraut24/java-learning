package com.tca.model;

public class Student {
   
	private String name;
	private String city;
	private Integer per;
	public Student(String name, String city, Integer per) {
		super();
		this.name = name;
		this.city = city;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", per=" + per + "]";
	}
	
	
}
