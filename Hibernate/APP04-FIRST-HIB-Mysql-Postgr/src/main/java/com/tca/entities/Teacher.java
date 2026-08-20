package com.tca.entities;

public class Teacher {
	
	private int tno;
	private String name;
	private double salary;
	
     public Teacher() {
    	 
     }

	 public Teacher(int tno, String name, double salary) {
		super();
		this.tno = tno;
		this.name = name;
		this.salary = salary;
	}

	 @Override
	public String toString() {
		return "Teacher [tno=" + tno + ", name=" + name + ", salary=" + salary + "]";
	}

	 public int getTno() {
		 return tno;
	 }

	 public void setTno(int tno) {
		 this.tno = tno;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public double getSalary() {
		 return salary;
	 }

	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
}
