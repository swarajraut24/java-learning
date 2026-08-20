package com.tca;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

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
            
            //print all student record
//            
//            NativeQuery<Student> student=session.createNativeQuery("select * from student",Student.class);
//            
//            List<Student> sl=student.getResultList();
//            
//            for(Student m:sl) {
//            	System.out.println("roll no:"+m.getRoll());
//            	System.out.println("Per:"+m.getPer());
//            	System.out.println("Name:"+m.getName());
//            	System.out.println("City:"+m.getCity());
//            	System.out.println("---------------------");
//            	
//            }
            
            
            //to print selected or specific coulumn
            
//            NativeQuery<Object[]> st=session.createNativeQuery("select sper,sname from student",Object[].class);
//            
//            List<Object[]> s=st.getResultList();
//            
//            for(Object[] sd:s) {
//            	
//            	for(int i=0;i<sd.length;i++) {
//            		
//            		System.out.print(sd[i]+" ");
//       
//            	}
//            	System.out.println("");
//            }
//     
            
            
            //  dMl :-insert ,delete,update
            
//            MutationQuery st=session.createNativeMutationQuery("update student set sper=sper+1 where scity='POONA' ");
//            
//           int noofrows= st.executeUpdate();
//           
//           System.out.println(noofrows);
            
            
            //ddl:- create,alter
            
            MutationQuery sm=session.createNativeMutationQuery("create table teacher(name varchar(23),salary int    )");
            sm.executeUpdate();
            
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


 