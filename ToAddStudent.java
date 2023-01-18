package com.mcq_pproject.karishma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.ConnectionImpl;

public class ToAddStudent {
	Connectiondatabase connect =new  Connectiondatabase();	
	Scanner sc=new Scanner(System.in);
    	int id;
	 public int insertdata() {
		
			
		Connection con;
		PreparedStatement st;
	
		try {
			
			con=connect.getInputConnection();
	
		String sql="insert into student_information(Student_Id,Student_Name,Student_LastName)"+"values(?,?,?)";
		st=con.prepareStatement(sql);
		
		System.out.println("Proceed To Add the Student data into Student List ");		
		System.out.println("Enter the Student Id");
		int id=sc.nextInt();
	    st.setInt(1,id);
	    
	    System.out.println("Enter the Student Name");
	    st.setString(2,sc.next());
	    
	    System.out.println("Enter the Student Last Name");
	    st.setString(3, sc.next());
	  
	   int i=st.executeUpdate();
		System.out.println("You Enter Your Information successfully ");
	
		con.close();
		st.close();

		}catch (Exception e) {
			System.out.println("This Student Id Alredy exist");
			System.out.println("*****pls login again with vallid Id****************");
			
		} 
		return id;
	}
	
		  }
			
			
         


