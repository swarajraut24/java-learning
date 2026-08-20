package com.project.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	public static Connection getconnection() {
		  
		Connection con =null;
		
		  final String DB_URL="jdbc:postgresql://localhost:5432/project";
	        final String DB_USER="postgres";
	        final String DB_PWD="root";
	        final String DB_DRIVER="org.postgresql.Driver";
	        
	     try {
	    	  Class.forName(DB_DRIVER);
	    	con=DriverManager.getConnection("DB_URL","DB_USER","DB_PWD");
	     }
	     catch(Exception e) {
	    	 e.printStackTrace();
	     }
	     
	     return con;

	}

}
