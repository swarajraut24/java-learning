package com.tca.entities;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//filter 1
@FilterDef(name="cityFilter",
           parameters=@ParamDef(name="cityParam",type=String.class))

@Filter(name="cityFilter",condition="scity=:cityParam")


//filter 2
@FilterDef(name="perFilter",
           parameters=@ParamDef(name="perParam",type=Double.class))

@Filter(name="perFilter",condition="sper>=:perParam")


//filter 3

@FilterDef(name="perrangeFilter",
           parameters= {
        		   @ParamDef(name="minper",type=Double.class),
        		   @ParamDef(name="maxper",type=Double.class)
           }
		 )
@Filter(name="perrangeFilter",condition="sper>=:minper and sper<=:maxper")
             
@Entity
@Table(name="student")
public class Student {
  
	@Id
	@Column(name="srno")
	 private Integer roll;
	
 
	@Column(name="sname")
	private String name;
	
	
	@Column(name="sper")
	private Double per;
	
	
	@Column(name="scity")
	private String city;
	
	public Student() {
		
	}
	
	public Student(Integer roll, String name, Double per, String city) {
		super();
		this.roll = roll;
		this.name = name;
		this.per = per;
		this.city = city;
	}
	
	
 


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", per=" + per + ", city=" + city + "]";
	}


	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
