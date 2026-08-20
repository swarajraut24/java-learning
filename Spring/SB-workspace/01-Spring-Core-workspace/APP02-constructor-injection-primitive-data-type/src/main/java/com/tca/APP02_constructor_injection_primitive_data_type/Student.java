package com.tca.APP02_constructor_injection_primitive_data_type;

public class Student {
  
	private int rno ;
	private String name;
	private int per;
	
	public Student(int rno,String name,int per) {
		 this.rno=rno;
		 this.name=name;
		 this.per=per;
}
	public int getRno() {
		return rno;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getPer() {
		return per;
	}
}