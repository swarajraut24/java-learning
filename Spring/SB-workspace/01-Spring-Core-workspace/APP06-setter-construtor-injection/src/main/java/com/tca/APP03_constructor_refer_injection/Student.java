package com.tca.APP03_constructor_refer_injection;

public class Student {
  
	private int rno ;
	private String name;
	private int per;
	
	private String passportno;
	
	public Student(int rno,String name,int per) {
		 this.rno=rno;
		 this.name=name;
		 this.per=per;
}
	
	public String getPassportno() {
		return passportno;
	}

	public void setPassportno(String passportno) {
		this.passportno = passportno;
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