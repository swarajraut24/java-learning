package com.tca;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tca.entities.Student;
import com.tca.entities.StudentCompositeKey;

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
    		
//           StudentCompositeKey sk=new StudentCompositeKey();
//           sk.setFname("sachin");
//           sk.setLname("dhane");
//    		
//           
//           Student s=new Student();
//           s.setId(sk);
//           s.setCity("pune");
//           
//           session.persist(s);
    		
    		
    		//how to fetch student data
    		
    		StudentCompositeKey sk=new StudentCompositeKey();
    		sk.setFname("sachin");
    		sk.setLname("dhane");
    		
    		Student s=session.get(Student.class, sk);
    		
    		
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
