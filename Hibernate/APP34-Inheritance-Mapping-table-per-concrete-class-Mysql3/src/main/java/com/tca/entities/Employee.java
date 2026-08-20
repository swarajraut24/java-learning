package com.tca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name="EMP2")
 
public class Employee extends Person {
 
  private Double salary;

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}
 
  
}
