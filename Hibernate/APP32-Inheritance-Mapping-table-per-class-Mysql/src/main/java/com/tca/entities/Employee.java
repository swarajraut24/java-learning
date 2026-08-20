package com.tca.entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="Employee")

public class Employee {
@Id
  private Integer eid;
  private  String ename;
  public Integer getEid() {
	return eid;
  }
  public void setEid(Integer eid) {
	this.eid = eid;
  }
  public String getEname() {
	return ename;
  }
  public void setEname(String ename) {
	this.ename = ename;
  }
  
}
