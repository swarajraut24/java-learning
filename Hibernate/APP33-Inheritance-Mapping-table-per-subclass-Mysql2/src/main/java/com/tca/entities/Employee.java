package com.tca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name="EMP")
@Inheritance(strategy=InheritanceType.JOINED)
 

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
