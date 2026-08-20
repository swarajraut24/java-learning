package com.tca;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

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
   
             //query-1
          /*  
            Query<Student> query=session.createNamedQuery("GET_ALL_STUDENTS",Student.class);
            
             List<Student> sl=query.getResultList();
             
             for(Student s:sl) {
            	 System.out.println("roll number:"+s.getRoll());
            	 System.out.println("Name:"+s.getName());
            	 System.out.println("City:"+s.getCity());
            	 System.out.println("Percenatage:"+s.getPer());
            	 System.out.println("-------------------------");
            	 
             }
             
             */
            
            
            //query-2
            
         /*   
            Query<Student> query=session.createNamedQuery("GET_INFO_CITYWISE",Student.class);
            
            query.setParameter("tca","MUMBAI");
            
            List<Student> sl=query.getResultList();
            
            for(Student s:sl) {
           	 System.out.println("roll number:"+s.getRoll());
           	 System.out.println("Name:"+s.getName());
           	 System.out.println("City:"+s.getCity());
           	 System.out.println("Percenatage:"+s.getPer());
           	 System.out.println("-------------------------");
           	 
            }
            
            */
            
            
            //query-3
            
           //update student set city='PUNE' where city='POONA';
  /*          
       MutationQuery query=session.createNamedMutationQuery("UPDATE_CITY");
       query.setParameter("oldcity","MUMBAI");

        query.setParameter("newcity","PUNE");

        int updatedcount= query.executeUpdate();
            
         System.out.println("modified city:"+updatedcount);


*/
            
            
        //delete from student
            
            MutationQuery query=session.createNamedMutationQuery("remove_info");
            
            query.setParameter("temp_city","PANJI");
            
            int noofcount=query.executeUpdate();
            
            
            System.out.println("delted city:"+noofcount);
            
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


 