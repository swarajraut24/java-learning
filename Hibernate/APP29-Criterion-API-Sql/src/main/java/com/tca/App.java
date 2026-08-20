package com.tca;

 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.tca.entities.Student;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.Root;

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
           
            
            //to print all records order by descending
            
//            CriteriaBuilder cb=session.getCriteriaBuilder();
//            CriteriaQuery<Student>cq=cb.createQuery(Student.class);
//            Root<Student> root=cq.from(Student.class);
//            
//            cq.select(root).orderBy(cb.desc(root.get("per")));
//            
//            
//            Query<Student>query=session.createQuery(cq);
//            List<Student> student=query.getResultList();
//            
//            
//          for(Student m:student) {
//          	System.out.println("roll no:"+m.getRoll());
//          	System.out.println("Per:"+m.getPer());
//          	System.out.println("Name:"+m.getName());
//          	System.out.println("City:"+m.getCity());
//          	System.out.println("---------------------");
//          	
//          }
            
            
            //where with multiple conditions(AND)
            
            //select * from student where per>=70 and per<=90
//            
//            CriteriaBuilder cb=session.getCriteriaBuilder();
//            CriteriaQuery<Student> cq=cb.createQuery(Student.class);
//            Root<Student> root=cq.from(Student.class);
//            
//            Predicate p1=cb.ge(root.get("per"),70.0);  //per>=70
//            Predicate p2=cb.le(root.get("per"), 90.0);   //per<=90
//            
//            cq.select(root).where(cb.and(p1,p2));
//            		
//            Query<Student>query=session.createQuery(cq);
//            List<Student> student=query.getResultList();
//          
//          
//        for(Student m:student) {
//        	System.out.println("roll no:"+m.getRoll());
//        	System.out.println("Per:"+m.getPer());
//        	System.out.println("Name:"+m.getName());
//        	System.out.println("City:"+m.getCity());
//        	System.out.println("---------------------");
//        	
//        }
          
         
            //Specific columns-scalar query
            
//            
//            
//            CriteriaBuilder cb=session.getCriteriaBuilder();
//            
//            CriteriaQuery<Object[]> cq=cb.createQuery(Object[].class);
//            
//            Root<Student> root=cq.from(Student.class);
//            
//            Predicate p1=cb.ge(root.get("per"),70.0);
//            Predicate p2=cb.le(root.get("per"),90.0);
//            
//            cq.multiselect(
//            		root.get("name"),
//            		root.get("per")         		
//             		).where(cb.and(p1,p2));
//            
//            		
//             Query<Object[]> query = session.createQuery(cq);
//             List<Object[]> sl=query.getResultList();
//             
//             for(Object[] ob:sl) {
//            	 for(int i=0;i<ob.length;i++) {
//            		 System.out.print(ob[i]+" ");
//            	 }
//            	 System.out.println("");
//             }
//             
             
             
             //Select count(*) from student
             
          /* 
             CriteriaBuilder cb=session.getCriteriaBuilder();
             CriteriaQuery cq=cb.createQuery(Long.class);
             Root<Student> root=cq.from(Student.class);
            
              cq.select(cb.count(root));
              
              Query<Long> query=session.createQuery(cq);
              
               Long sl=query.getSingleResult();
              
              System.out.println("total no of record:"+sl);
              
              
              */
            
            
            //Select Max(*) from student
         /*    
            CriteriaBuilder cb=session.getCriteriaBuilder();
            CriteriaQuery cq=cb.createQuery(Double.class);
            Root<Student> root=cq.from(Student.class);
           
             cq.select(cb.max(root.get("per")));
             
             Query<Double> query=session.createQuery(cq);
             
              Double sl=query.getSingleResult();
             
             System.out.println("toppers record:"+sl);
             
             */
            
             
            //Select * from student like "P%"
               
                
          /*  CriteriaBuilder cb=session.getCriteriaBuilder();
          CriteriaQuery<Student>cq=cb.createQuery(Student.class);
          Root<Student> root=cq.from(Student.class);
          
          cq.select(root).where(cb.like(root.get("city"),"P%"));
          
          
          Query<Student>query=session.createQuery(cq);
          List<Student> student=query.getResultList();
          
          
        for(Student m:student) {
        	System.out.println("roll no:"+m.getRoll());
        	System.out.println("Per:"+m.getPer());
        	System.out.println("Name:"+m.getName());
        	System.out.println("City:"+m.getCity());
        	System.out.println("---------------------");
        	
        }
          
          */
            
            //Select scity ,count(*) from student group by scity having count(*)>1;
                 
//            
//            CriteriaBuilder cb=session.getCriteriaBuilder();
//          
//          CriteriaQuery<Object[]> cq=cb.createQuery(Object[].class);
//          
//          Root<Student> root=cq.from(Student.class);
//          
//          Predicate p=cb.gt(cb.count(root),1);
//    
//          cq.multiselect(
//          		root.get("city"),
//          		 cb.count(root)         		
//           		).groupBy(root.get("city")).having(p);
//          
//          		
//           Query<Object[]> query = session.createQuery(cq);
//           List<Object[]> sl=query.getResultList();
//           
//           for(Object[] ob:sl) {
//          	 for(int i=0;i<ob.length;i++) {
//          		 System.out.print(ob[i]+" ");
//          	 }
//          	 System.out.println("");
//           }
//          
            
            
            //dml queries:-
            
            //update student
            
      /*      
          CriteriaBuilder cb=session.getCriteriaBuilder();
          CriteriaUpdate<Student>cq=cb.createCriteriaUpdate(Student.class);
          Root<Student> root=cq.from(Student.class);  //update from student
          
          cq.set(root.get("city"),"PUNE").where(cb.equal(root.get("city"),"POONA"));
          
          
          Query<Student>query=session.createQuery(cq);
         
           int count=query.executeUpdate();
           
           System.out.println(count);
           
        */
            
            
            //delete student
            
            CriteriaBuilder cb=session.getCriteriaBuilder();
            CriteriaDelete<Student>cq=cb.createCriteriaDelete(Student.class);
            Root<Student> root=cq.from(Student.class);  //delete from student
            
            cq.where(cb.equal(root.get("city"),"SATARA"));
            
            MutationQuery query=session.createMutationQuery(cq);
           
             int count=query.executeUpdate();
             
             System.out.println(count);
              
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


 