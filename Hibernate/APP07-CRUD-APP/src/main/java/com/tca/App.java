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
    		
    		sf=configuration.buildSessionFactory();
    		session =sf.openSession();  
    		
    		txn=session.beginTransaction();
    		
    		Student s=new Student();
    		s.setRoll(105);
    		s.setName("A5A");
    		s.setPer(60);
    		 
//    		
//    		//---save()---
//    	  Integer saverno=(Integer)session.save(s);	
//    		
//    	  
//    	   //---persist()-- 
//         session.persist(s);
//    		
//    		
//    		// ------get()----
//    		Student so=(Student) session.get(Student.class,105); // if we write here 109 it shows null pointer exveption
//    		
//    		//--load()--
//    		Student sl=(Student) session.load(Student.class, 109);  // in database there is no 109 primary key so it say object not found 
//    		
    		
    		
    		//update:-
    		
    		//case 1:-
    		
    		Student sm=new Student();       //if we try to update data by using this method it will change only name present in the database 
    		 
    		sm.setRoll(101);
    		sm.setName("vvv");               //because here we create separate object and only modify name and other field remain null
    		session.update(sm);
    		
    		//case 2:-
    		
//    		Student st= (Student)session.get(Student.class,101);
//    		st.setName("DDD");
//    		st.setPer(232);                                            //if we remove session.update() then also it update value in database
//    		                                                   //because st contain data which presnet at the hibernate cache memory if we update the 
//    		session.update(st);
//    		                                             //st data and commit transaction then it also change the data present in the database
// 
    		
    		//saveorupdate()--:-
    		
//    		Student su=new Student();
//    		su.setRoll(109);
//    		su.setName("mmm");          //if record is not present in the database by using saveorupdate() method we can insert new data into database
//     		su.setPer(99);                //if record is already present in the database then it only the  update record
    		
    		
    		
    		
//    	
//     		 session.saveOrUpdate(su);
     		 
     		 
     		 // -------delete---- 
     		 
     		 // case 1:-
     		 
     		 Student sd=(Student)session.get(Student.class,105);
     		 if(sd==null) {
     			 System.out.println("record is not found");
     		 }
     		 else {
     			 session.delete(sd);
     		 }
     		 
     		 //case 2:-
     		 
     		 Student sk=new Student();
     		 sk.setRoll(109);
     		 session.delete(sk);
     		 
    		txn.commit();
    	
    	 
    		
    		System.out.println("record inserted succesfullly:");
//    		
//    		System.out.println("roll number:"+so.getRoll());
//    		System.out.println("Name:"+so.getName());
//    		System.out.println("Percenetage:"+so.getPer());
    		
    		System.out.println(" ");
    		
//    		System.out.println("roll number:"+sl.getRoll());
//    		System.out.println("Name:"+sl.getName());
//    		System.out.println("Percenetage:"+sl.getPer());
    		
    		
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
