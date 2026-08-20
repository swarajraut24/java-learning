package com.tca.entities;

public class login {

	 String name;
	 String password;
	 
	@Override
	
	  
	public String toString() {
		return "login [name=" + name + ", password=" + password + "]";
	}

	public login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getPassword() {
		 return password;
	 }

	 public void setPassword(String password) {
		 this.password = password;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
