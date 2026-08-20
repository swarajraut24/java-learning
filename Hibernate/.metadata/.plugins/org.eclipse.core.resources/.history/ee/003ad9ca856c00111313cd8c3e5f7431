package com.tca;

 
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tca.entities.Course;
import com.tca.entities.Student;
import com.tca.entities.StudentCourse;
 
 

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
        
            // i want to assign course -111 to student 101
            
/*             Student s1=new Student();
             s1.setRno(101);
             s1.setName("AAA");
            
             Course c1=new Course();
             c1.setCid(111);
             c1.setCname("Core java");
             
             StudentCourse sc=new StudentCourse();
             sc.setId(1);
             sc.setStudent(s1);
             sc.setCourse(c1);
             sc.setRegdate(LocalDate.now());
             
             session.persist(s1);
             session.persist(c1);
             session.persist(sc);
            
            */
            
            //  i want to assign course 222 to 101
            
         /*    Student s=session.get(Student.class,101);
            
            Course c= new Course();
            
            c.setCid(222);
            c.setCname("Advance java");
            
            StudentCourse sc=new StudentCourse();
            sc.setId(2);
            sc.setCourse(c);
            sc.setStudent(s);
            sc.setRegdate(LocalDate.of(2025, 5, 10));
            
            session.persist(sc);
            
            */
            
            
            // student 102 has taken admission but dont have any course yet
          
            /*
            Student s= new Student();
            s.setRno(102);
            s.setName("BBB");
            session.persist(s);
            
            */
            
            // launching course 333 hibernate but not have admission yet
            
         /*    Course c= new Course();
            c.setCid(333);
            c.setCname("hibernate");
             session.persist(c);
          */
            
            //Student 102 has taken admission for course 111 core java
            
          /*
             Student s=session.get(Student.class, 102);
           
            Course c=session.get(Course.class,111);
            
            StudentCourse sc=new StudentCourse();
            sc.setId(3);
            sc.setStudent(s);
            sc.setCourse(c);
            sc.setRegdate(LocalDate.now());
            
            session.persist(sc);
            
            */
            
            // Student 103 has taken admission for course-333 hibernate
            
           /*    Student s= new Student();
               s.setRno(103);
               s.setName("CCC");
               
               StudentCourse sc=new StudentCourse();
               sc.setStudent(s);
               sc.setCourse(session.get(Course.class, 333));
               sc.setId(4);
               sc.setRegdate(LocalDate.now());
               
               session.persist(sc);
               
               */
            
            // i want see courses joined by student 101
           
            /*
            Student s=session.get(Student.class,101);
            
            System.out.println("Student roll number:"+s.getRno());
            System.out.println("Student Name:"+s.getName());
            
            List<StudentCourse> L=s.getRegs();
            
            for(StudentCourse sc:L) {
            	
            	Course c= sc.getCourse();
            	
            	System.out.println("Course id:"+c.getCid());
            	System.out.println("Course Name:"+c.getCname());
            	System.out.println("Registration date"+sc.getRegdate());
            	System.out.println("-----------------------------------");
            }
               
               */
            
            // Find student-Course information whose registration take place on 19th june 2026
            
            LocalDate d=LocalDate.of(2026, 6, 19);
            String hql= "from StudentCourse sc where sc.regdate=:udate";
            
            Query<StudentCourse> query= session.createQuery(hql,StudentCourse.class);
            
            query.setParameter("udate",d);
            
            List<StudentCourse> l=query.getResultList();
            
            for(StudentCourse sc:l) {
            	Student s=sc.getStudent();
            	Course C=sc.getCourse();
            	
            	System.out.println("Student: "+s.getName()+" has regirstered for "+C.getCname() +" on Date:"+sc.getRegdate());
            	System.out.println("--------------------------------------------------------------------------------------");
            	
            }
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


 