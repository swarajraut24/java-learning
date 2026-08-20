package com.tca;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tca.entities.Student;

public class App {
    public static void main(String[] args) {
         
    	Configuration configuration =null;
    	SessionFactory sf=null;
    	Session session =null;
    	Transaction txn=null;
    	
    	
    	try {
    		configuration =new Configuration();
    		configuration.configure();
//    		configuration.addAnnotatedClass(Student.class);
    		
    		sf=configuration.buildSessionFactory();
    		session =sf.openSession();  
    		
    		txn=session.beginTransaction();
    		
    		Student s=new Student();
    		
    		s.setName("aaa");
    		s.setPer(-90);
    	 
 
     		 session.persist(s);
    		txn.commit();
    	
    	 
    		
    		System.out.println("record inserted succesfullly:");
 
    		
    		
    	}
    	catch(Exception e) {
    		if(txn!=null) {
    		txn.rollback();
    		
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
