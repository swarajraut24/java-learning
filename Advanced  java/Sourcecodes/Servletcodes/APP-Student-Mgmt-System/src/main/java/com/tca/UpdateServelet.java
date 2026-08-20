package com.tca;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tca.entities.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/update")
public class UpdateServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* purpose:-
		 * when first  time made a request show all student data
		 * 
		 * 
		 */
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		 Connection con=null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		 
		 final String DB_URL="jdbc:postgresql://localhost:5432/ajdb20";
		 final String DB_USER ="postgres";
		 final String DB_PWD="root";
		 final String DB_DRIVER="org.postgresql.Driver";
		 
		 String qry="";
	
		    
		 String sbtn=request.getParameter("sbtn");
		 String srno=request.getParameter("srno");
		 
		 if(sbtn==null || srno.isEmpty() || sbtn.equals("Refresh")) {
		 qry="select * from student ORDER BY rno";
		 }
		 else if(sbtn.equals("Search")) {
			 
		 qry="select * from student where rno="+srno;
		 }
		 
		 
		 try {
			 Class.forName(DB_DRIVER);
			 con=DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
			 
			 ps=con.prepareStatement(qry);
			 rs=ps.executeQuery();
			 
			 List<Student> L=new  ArrayList<>();
	
			 while(rs.next()) {
				 int rno=rs.getInt("rno");
				 String name=rs.getString("name");
				 Double per=rs.getDouble("per");
				 
				 L.add(new Student(rno,name,per));
				 
			 }
			 
			   /*Redirecting message to the view layer*/
		        request.setAttribute("students",L);
		        RequestDispatcher rd=request.getRequestDispatcher("./UpdateStudent.jsp");
				rd.forward(request, response);
				 out.close();
				 
			 
//			 out.println("Student information"+"<br>");
//			 
//			 for(Student s:L) {
//				 out.println(s+"<br>");
//			 out.println(s.getRno()+"---"+s.getName()+"---"+s.getPer()+"<br>");
//			 }
//			 
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 try {
				 rs.close();
				con.close();
			 } catch (SQLException e) {
				e.printStackTrace();
			 }
		 }
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		/* Purpose :
		 *update student based on roll number modify name o
		 *rollnumber is sent from javascript
		*/
		
		Connection con=null;
		PreparedStatement ps=null;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		 final String DB_URL="jdbc:postgresql://localhost:5432/ajdb20";
		 final String DB_USER ="postgres";
		 final String DB_PWD="root";
		 final String DB_DRIVER="org.postgresql.Driver";
		 
		 String  trno=request.getParameter("trno");
		 String  tname=request.getParameter("tname");
		 String  tper=request.getParameter("tper");
		 
		 String qry="update  student set name='"+tname+"',per="+tper+"where rno="+trno;
		 
		
		try {
			 Class.forName(DB_DRIVER);
			 con=DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
			 
			 ps=con.prepareStatement(qry);
			 ps.executeUpdate();
			 out.println("success");
		} 
		catch(Exception e) {
			e.printStackTrace();
			out.println("failed");
		}
		finally {
			 try {
				con.close();
			 } catch (SQLException e) {
				e.printStackTrace();
			 }
		}
	}

}

