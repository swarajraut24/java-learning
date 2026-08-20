package com.tca.APP03_constructor_refer_injection;

public class Customer {
  private int customerid;
  private String customername;
  Address adress;
  
  public Customer(int customerid,String customername,Address adress) {
	  this.customerid=customerid;
	  this.customername=customername;
	  this.adress=adress;
	  
  }
  public int getCustomerid() {
	  return customerid;
  }
  
  public String getCustomername() {
	  return customername;
  }
  
  public Address getAdress() {
	  return adress;
  }
}
