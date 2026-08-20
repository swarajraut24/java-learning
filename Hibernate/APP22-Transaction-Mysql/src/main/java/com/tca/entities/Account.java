 package com.tca.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	
	@Id
   @Column(name="accno")
   private Integer accNo;
	
  @Column(name="acctype")
  private String acctype;
	
   @Column(name="accholdername")
   private String accHolderName;
   
   @Column(name="balance")
   private Float balance;

   @Override
public String toString() {
	return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
}

   public Integer getAccNo() {
	return accNo;
   }

   public void setAccNo(Integer accNo) {
	this.accNo = accNo;
   }

   public String getAccHolderName() {
	return accHolderName;
   }

   public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
   }

   public Float getBalance() {
	return balance;
   }

   public void setBalance(Float balance) {
	this.balance = balance;
   }
   
   
}
