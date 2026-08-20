package com.tca.APP03_constructor_refer_injection;

public class Customer {
  private int customerid;
  private String customername;
  Address adress;
  
 
  public void setCustomerid(int customerid) {
	this.customerid = customerid;
}

  public void setCustomername(String customername) {
	this.customername = customername;
  }

  public void setAdress(Address adress) {
	this.adress = adress;
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
