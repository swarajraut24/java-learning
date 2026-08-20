package com.tca;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tca.entities.Student;
import com.tca.entities.Teacher;

public class App {
    public static void main(String[] args) {
         
    	Configuration configuration =null;
    	SessionFactory sf=null;
    	Session session =null;
    	Transaction txn=null;
    	
    	
    	Configuration configuration2 =null;
    	SessionFactory sf2=null;
    	Session session2 =null;
    	Transaction txn2=null;
    	
    	
    	try {
    		configuration =new Configuration();
    		configuration.configure("mysql_hibernate.cfg.xml");
    		
    		configuration2 =new Configuration();
    		configuration2.configure("Postgres_hibernate.cfg.xml");
    		
    		sf=configuration.buildSessionFactory();
    		session =sf.openSession();
    		
    		sf2=configuration2.buildSessionFactory();
    		session2 =sf2.openSession();
    		
    		
    		txn=session.beginTransaction();
    	
    		txn2=session2.beginTransaction();
    		
    		Student s=new Student();
    		s.setRoll(103);
    		s.setName("AAA");
    		s.setPer(60);
    		
    		Teacher t=new Teacher();
    		t.setTno(102);
    		t.setName("AAA");
    		t.setSalary(60000);
    		
    		session.save(s);
    		session.save(t);
    		txn.commit();
    		
    		session2.save(s);  
    		session2.save(t);
    		txn2.commit();
    		
    		System.out.println("record inserted succesfullly");
    		
    	}
    	catch(Exception e) {
    		if(txn!=null) {
    		txn.rollback();
    		
    		}
    		if(txn2!=null) {
        		txn2.rollback();
        		
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
    		if(session2 !=null) {
    			session2.close();
    		}
    		if(sf2!=null) {
    			sf2.close();
    		}
    	}
    }
}
