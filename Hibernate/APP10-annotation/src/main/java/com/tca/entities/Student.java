package com.tca.entities;

import org.hibernate.annotations.Check;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
  
	@Id
	@Column(name="tca_rno")
	private Integer roll;
	
	@Column(name="tca_name",nullable=false,length=50,unique=true)
	private String name;
	
	@Column(name="tca_per")
	@Check(constraints="tca_per >=0 AND tca_per<=100")
	private Double per;
 
  
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
