package com.tca;

import java.sql.SQLException;
import java.util.List;

import com.tca.StudentDao.StudentDao;
import com.tca.entities.Student;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
             //addstudent();
             fetchStudents();
          }
	
 
	
	public static void addstudent() {
        
        Student ob=new Student();
        ob.setRno(102);
        ob.setName("BBB");
        ob.setPer(100);
             
        
        StudentDao dao=new StudentDao();
        try {
        if(dao.save(ob)) {
      	  System.out.println("Student is register succesfully");
        }
        else {
      	  System.out.println("failed to save succesfully");
        }
        
        }
        catch(ClassNotFoundException ce) {
        	System.out.println("invalid database Driver");
      	  ce.printStackTrace();
        }
        catch(SQLException e) {
        	System.out.println("Unable to save student data");
      	  e.printStackTrace();
	}
        
	}
	
	public static void fetchStudents() throws ClassNotFoundException, SQLException {
		
		
		try {
			StudentDao dao=new StudentDao();
			List<Student> studentsList= dao.fetchAllStudents();
		if(studentsList.isEmpty()) {
			System.out.println("***NO DATA FOUND******");
		}
		else {
		System.out.println("information of student");
		
		
		for(Student ob: studentsList) {
			System.out.println("Rollno: "+ob.getRno());
			System.out.println("Name: "+ob.getName());
			System.out.println("Percentage: "+ob.getPer());
			System.out.println("------------------");
			
	}
		
		}
	
		}
		catch(ClassNotFoundException e) {
			System.out.println("unable to fetch data:failed to load driver");
			 e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("unable to fetch data");
			e.printStackTrace();
		}
	
	}
	 
   

}
