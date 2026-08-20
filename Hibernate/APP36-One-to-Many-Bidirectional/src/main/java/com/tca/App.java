package com.tca;

 
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tca.entities.Department;
import com.tca.entities.Employee;
 
 

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
       
          /*
             
            Department d=new Department();
          
             
             Employee e=new Employee();
             e.setDept(d);
             e.setEid(101);
             e.setEname("AAA");
             e.setEsalary(10000.0);
             
            Employee e1=new Employee();
            e1.setDept(d);
            e1.setEid(102);
            e1.setEname("BBB");
            e1.setEsalary(20000.0);
            
           List<Employee> l1=new ArrayList<>();
           l1.add(e);
           l1.add(e1);
           
           
            d.setDid(111);
            d.setDname("AAA");
            d.setEmps(l1);
            
            session.persist(d);
            
            */
            
            
            //trying to save one deprtment and one employee
            
   /*    Department d=new Department();
            d.setDid(222);
            d.setDname("Arts");
            
            session.persist(d);
            
            Employee e=new Employee();
            e.setEid(103);
            e.setEname("CCC");
            e.setEsalary(12000.0);
            
            session.persist(e);
            */
            
            
             //trying to assign dept 222 to emp 102
           
         /*   Department d =session.get(Department.class,222);
            Employee e=session.get(Employee.class,103);
            
            
            e.setDept(d);
            
            session.merge(e);
*/
                  
            //fetch department with their employees
//            
//            Department d=session.get(Department.class,111);
//            
//            System.out.println("Department id: "+d.getDid());
//            
//            System.out.println("Department name: "+d.getDname());
//            
//            System.out.println("--------------------------------");
//            
//            List<Employee> l1=new ArrayList<>();
//            
//            l1=d.getEmps();
//            
//            for(Employee s:l1) {
//            	System.out.println("Eid: "+s.getEid());
//            	System.out.println("Ename: "+s.getEname());
//            	System.out.println("Esalary: "+s.getEsalary());
//           
         //   }
            
            
            //fetching employees with its department
//            
//            Employee  e=session.get(Employee.class,103);
//            
//            Department d=e.getDept();
//            
//            System.out.println("Eid: "+e.getEid());
//         	System.out.println("Ename: "+e.getEname());
//       	   System.out.println("Esalary: "+e.getEsalary());
//       	   System.out.println("Did: "+d.getDid());
//       	System.out.println("Dname: "+d.getDname());
            
            
            
            //delete  arts department associcted with employee
            
           /*
            * 
            Department d= session.get(Department.class,222);
             
            
            session.remove(d);
            */
                       
            //update department  id 111 too 77 this is wrong because we cannot update primary key
            
     Department d= session.get(Department.class,111);
             
      d.setDid(777);
            
            session.merge(d);
            txn.commit();
            
      	   System.out.println("Done...");
     	   
    
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


 