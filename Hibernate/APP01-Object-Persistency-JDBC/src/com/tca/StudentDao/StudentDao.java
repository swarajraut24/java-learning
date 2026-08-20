package com.tca.StudentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tca.MyConfig.MyConfig;
import com.tca.entities.Student;

public class StudentDao{
   
	 public  boolean save(Student ob)  throws ClassNotFoundException,SQLException{
		 
		 
		 Connection con =null;
		 PreparedStatement ps=null;
		 
	
		 
			 
		
		 try {
			 Class.forName(MyConfig.DB_DRIVER);
			 
			 con=DriverManager.getConnection(MyConfig.DB_URL,MyConfig.DB_USER,MyConfig.DB_PWD);
			 ps=con.prepareStatement("insert into student values(?,?,?)");
			 
			 ps.setInt(1, ob.getRno());
			 ps.setString(2, ob.getName());
			 ps.setDouble(3,ob.getPer());
			 
			int status= ps.executeUpdate();
			 
			if(status==1) {
				return true;
			}
			else
			 return false;
		 }
			finally {
				con.close();
			}
	 
 
}
	 
	 public List<Student> fetchAllStudents() throws ClassNotFoundException,SQLException{
		 
		 List<Student> L=new ArrayList<>();
		 Connection con =null;
		  PreparedStatement ps=null;
		 
		 try {
		 
		  
		  Class.forName(MyConfig.DB_DRIVER);
			 
			 con=DriverManager.getConnection(MyConfig.DB_URL,MyConfig.DB_USER,MyConfig.DB_PWD);
			 ps=con.prepareStatement("select * from student ");
			 ResultSet rs=ps.executeQuery();
			 
			 while(rs.next()) {
				  
				 
				 L.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			 }
			 
		 }
		 finally {
			 con.close();
		 }
		 return L;
	 }
}
