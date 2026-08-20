package com.tca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name="EXE")
@PrimaryKeyJoinColumn(name="eid")
public class Executive extends Employee {
	

  private String role;

  public String getRole() {
	return role;
  }

  public void setRole(String role) {
	this.role = role;
  }
  
}
