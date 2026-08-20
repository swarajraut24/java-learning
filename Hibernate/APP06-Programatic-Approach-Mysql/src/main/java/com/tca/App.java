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
    		
    		//programatic approach
    		
    		configuration =new Configuration();
    		
    		configuration.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
    		configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hfb04");
    		configuration.setProperty("hibernate.connection.username","root");
    		configuration.setProperty("hibernate.connection.password","root");
    		
    		
    		configuration.setProperty("hibernate_dialect","org.hibernate.dialect.MySQLDialect");
    		configuration.setProperty("hibernate.show_sql","true");
    		configuration.setProperty("hibernate.format_sql","true");
    		configuration.setProperty("hibernate.hbm2ddl.auto","none");
    		
    		
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
