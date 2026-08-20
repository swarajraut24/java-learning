package com.tca;

 
import java.util.List;
import java.util.Scanner;

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
            
            SelectionQuery<Student> query=session.createSelectionQuery("from Student ORDER BY roll",Student.class);
          
             query.setMaxResults(3);
             
             int pagenumber=1;
             
             Scanner sc=new Scanner(System.in);
             
             for(int i=0;i<=9;i=i+3) {
            	 
                      query.setFirstResult(i);
                      
                      List<Student> Sl=query.getResultList();
                      
                      System.out.println("Page no:"+pagenumber);
                      
                  
                      
                      for(Student s:Sl) {
                    		 System.out.println("rollno:"+s.getRoll());
                         	 System.out.println("Name:"+s.getName());
                         	 System.out.println("Per:"+s.getPer());
                         	 System.out.println("City:"+s.getCity());
                         	 System.out.println("------------------");
                      
             }
                      pagenumber++;
                      
                      System.out.print("Press any key to continue....");
                      sc.next();
                      
             }
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


 