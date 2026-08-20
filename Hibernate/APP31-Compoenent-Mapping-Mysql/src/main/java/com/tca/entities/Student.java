

package com.tca.entities;


import jakarta.persistence.Access;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
 
@Table(name="student")
public class Student {
  
	@Id
	 private Integer roll;
	private String name;	
	private Double per;
	private String city;
  
	
	@Embedded
	Address address;
	
	
	public Address getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public void setPer(Double per) {
		this.per = per;
	}

	public Student() {
		
	}
	
	public Student(Integer roll, String name, Double per) {
		super();
		this.roll = roll;
		this.name = name;
		this.per = per;
	 
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", per=" + per +",city="+city+"      ]";
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

