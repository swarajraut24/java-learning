package com.tca.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="Employee")
public class Employee {

@Id
private Integer eid;
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

public Double getEsalary() {
	return esalary;
}

public void setEsalary(Double esalary) {
	this.esalary = esalary;
}

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}

private String ename;
private Double esalary;

@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
@JoinColumn(name="dept_id")
private Department dept;


}
