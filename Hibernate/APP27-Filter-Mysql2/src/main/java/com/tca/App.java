package com.tca;

 
import java.util.List;
import java.util.Scanner;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.SelectionQuery;

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
 
    		sf=configuration.buildSessionFactory();
            session =sf.openSession();  
 
            txn=session.beginTransaction(); 
            
           //filter 1 by city also check enttity class
            
//            Filter filter1=session.enableFilter("cityFilter");
//            filter1.setParameter("cityParam","POONA");
            
            //filter 2  per greater than 70
//            
//            Filter filter2=session.enableFilter("perFilter");
//            filter2.setParameter("perParam",70.0);
            
            //filter 3 percentage range
//            
//            Filter filter3=session.enableFilter("perrangeFilter");
//            filter3.setParameter("minper", 60.0);
//            filter3.setParameter("maxper", 100.0);
            
            // Combine multiple filters
              
              Filter f1=session.enableFilter("cityFilter");
              f1.setParameter("cityParam","POONA");
              
              Filter f2=session.enableFilter("perFilter");
              f2.setParameter("perParam",70.0);
            
            SelectionQuery<Student> query=session.createSelectionQuery("from Student",Student.class);
                    
                      List<Student> Sl=query.getResultList();
                  
                      
                      for(Student s:Sl) {
                    		 System.out.println("rollno:"+s.getRoll());
                         	 System.out.println("Name:"+s.getName());   
                         	 System.out.println("Per:"+s.getPer());
                         	 System.out.println("City:"+s.getCity());
                         	 System.out.println("------------------");
                      
             }
                   
                     session.disableFilter("cityParam"); 
                   
                      session.disableFilter("perParam"); 
                      
                   //   session.disableFilter("perrangeFilter"); 
             
      	   System.out.println("Done...");
     	   
           txn.commit();
    
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


 