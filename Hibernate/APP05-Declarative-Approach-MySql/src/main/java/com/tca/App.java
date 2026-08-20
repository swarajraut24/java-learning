package com.tca;

 
import java.io.FileInputStream;
import java.util.Properties;

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
    		
    		// configuration.configure();  // it always try to find hibernate.cfg file
    		  
    		Properties p = new Properties();
    		p.load(new FileInputStream("src/main/resource/hibernate.properties"));
    		
    		configuration =new Configuration();
    		
    		configuration.setProperties(p);
    		configuration.addResource("Student.hbm.xml");
    		
    		
    		sf=configuration.buildSessionFactory();
    		session =sf.openSession();
    		
    		txn=session.beginTransaction();
    		
    		Student s=new Student();
    		s.setRoll(101);
    		s.setName("AAA");
    		s.setPer(60);
    		
    		session.save(s);
    		txn.commit();
    		
    		System.out.println("record inserted succesfullly");
    		
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
