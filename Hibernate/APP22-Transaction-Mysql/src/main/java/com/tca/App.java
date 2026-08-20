 package com.tca;

 
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tca.entities.Account;
 

public class App {
    public static void main(String[] args) {
         
    	Configuration configuration =null;
    	SessionFactory sf=null;
    	Session session =null;
    	Transaction txn=null;
    	
    	
    	Integer senderAccNo=101;
    	Integer receiverAccNo=102;
    	Float amount= 500.0f;
    	
    	try {
    		configuration =new Configuration();
    		configuration.configure();
 
    		
    		sf=configuration.buildSessionFactory();
    		session =sf.openSession();  
    		
    		txn=session.beginTransaction();
    		
    		
    		//validating account number and user
    		
    		 Account senderOb=session.get(Account.class,senderAccNo,LockMode.PESSIMISTIC_WRITE);
    		 
    		 if(senderOb==null) {
    			  System.out.println("Invalid senders's account number:"+senderOb);
    		 }
    		 
    		 
    	
    	    Account receiverOb=session.get(Account.class,receiverAccNo,LockMode.PESSIMISTIC_WRITE);
    	       
    	     if(receiverOb==null) {
			  System.out.println("Ivalid receivers account number:"+receiverOb);
		     }
    	 
    	     
    		 System.out.println("Press key to continue....");
    		 
    	      System.in.read();
    		
    	     //debit
    	     
    	      senderOb.setBalance(senderOb.getBalance()-amount);
    	      session.update(senderOb);
    		
    		 //credit
    	      
    	      receiverOb.setBalance(receiverOb.getBalance()+amount);
    		  session.update(receiverOb);
    		
             System.out.println("Transaction completed  succesfully");
    		  
    		  txn.commit();
    		
    		  System.out.println("Press key to continue....");
    		  System.in.read();
    		
    	}
    	catch(Exception e) {
    		if(txn!=null) {
    		txn.rollback();	System.out.println(" failed to transfer record succesfullly:");
    		
    		}
    		e.printStackTrace();
    	}
    	
    	finally {
    		if(session !=null) {
    			session.close();
    		}
    		if(sf!=null) {
    			sf.close();
    		}
    	}
    }
}
