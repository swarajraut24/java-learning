package com.tca;

 
import java.util.Scanner;

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
    		
//     		txn=session.beginTransaction();
//    		
//     		Student s=new Student();
//     		
//     		s.setRoll(102);
//     		s.setName("aaa");
//     		s.setPer(-90);
//     		
//	      	session.persist(s);
    	 
    		//case 1:-
    		
//        Student m1=session.get(Student.class, 102);
//        Student m2=session.get(Student.class, 102);
//        
//        System.out.println(m1.hashCode());
//		 System.out.println(m2.hashCode());
    		
		 
		 //case 2:-
    		
//    		
//		 
//		 Session session1=sf.openSession();
//		 Session session2=sf.openSession();
//		 
//		 Student c1=session1.get(Student.class, 102);
//	        Student c2=session2.get(Student.class, 102);
//	        
//	        System.out.println(c1.hashCode());
//			 System.out.println(c2.hashCode());
    		
    		
 //case 3:-	 problem in caching
    		
//    		  Student m1=session.get(Student.class, 102);
//           
//               System.out.println(m1);
//               
//               System.out.println("press a key...");
//               Scanner sc = new Scanner(System.in);
//               sc.next();
//               
//               
//               session.refresh(m1);
//               
//               Student m2=session.get(Student.class, 102);
//               
//               System.out.println(m2);
     		
  	
    	//case evict:-
               
//               txn=session.beginTransaction();
//                 
//               
//               
//               Student s=new Student();
//               s.setName("nnn");
//               s.setPer(99);
//               s.setRoll(110);
//               
//               session.evict(s);
//               txn.commit();
               
        		
       //case merge:-
//               Transaction transaction= session.beginTransaction();
//             
//               Student student=session.get(Student.class,101);
//               
//               System.out.println(student);
//                 
//               session.evict(student);
//               
//               student=(Student) session.merge(student);
//               
//               System.out.println(student);
//               
//               student.setPer(90.00);
//               
//               transaction.commit();
//               
//    		   System.out.println("record inserted succesfullly:");
//    		   
    		   
      //case remove:-
    		   
        		Transaction transaction= session.beginTransaction();
                
                Student student=session.get(Student.class,101);
                
                System.out.println(student);
                  
                session.evict(student);
              
                session.remove(student);
 
                transaction.commit();
                
     		   System.out.println("record inserted succesfullly:");
     		   
    		   
    
    	}
    	catch(Exception e) {
    		if(txn!=null) {
    		txn.rollback();
    		
    		}
//    		e.printStackTrace();
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
