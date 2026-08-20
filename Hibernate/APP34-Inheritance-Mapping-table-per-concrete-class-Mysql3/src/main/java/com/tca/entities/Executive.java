package com.tca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="EXE2")
 
public class Executive extends Person {
	
  
 
  private String role;
  private Double bonus;
  
  
  
  public Double getBonus() {
	return bonus;
}

  public void setBonus(Double bonus) {
	this.bonus = bonus;
  }

  public String getRole() {
	return role;
  }

  public void setRole(String role) {
	this.role = role;
  }
  
}
