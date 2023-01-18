package com.mcq_pproject.karishma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connectiondatabase  {
		
		static Connection con=null;
		//Statement stmt=null;
		public static Connection getInputConnection() {
			
		
	try {
		
		//to load class drive
		//String sql= 
		Class.forName("com.mysql.jdbc.Driver");
		
		// establish the connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","root");
		//stmt=con.createStatement();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	return con;
	
	
}
		
		
		}
