package com.tca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name="student")
public class Student {
  
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="student_table_gen")
	@TableGenerator(name="student_table_gen",
	                pkColumnName="gen_name",
	                pkColumnValue="student_id",
	                valueColumnName="gen_value",
	                initialValue=101,
	                allocationSize=1
	                )
	private Integer roll;
 
	private String name;
	
	private Double per;
	
//	@Transient
//	private Integer age;
   
//  
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", per=" + per + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
}
