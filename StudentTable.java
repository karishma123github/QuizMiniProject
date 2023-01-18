package com.mcq_pproject.karishma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentTable {
	
	static void studentList() {
	
	Connectiondatabase connect =new  Connectiondatabase();
	
	Connection con;
	PreparedStatement st;
	try {
		Scanner sc=new Scanner(System.in);
		con=connect.getInputConnection();
	
	String sql="select * from student_Information";
	st=con.prepareStatement("select * from student_Information");
    st.execute(sql);
    
    ResultSet rs=st.executeQuery();
  	 
    int score=0 ;
	for(int i=1;i<=10;i++) {

    while(rs.next()) {
		
		System.out.println("   Student Id       :  "+rs.getInt(1)); // to print Quize no	
		System.out.println("   Student Name     :  "+rs.getString(2));
		System.out.println("   Student Last Name  :  "+rs.getString(3));
		System.out.println("   Student Score       :  "+rs.getInt(4));
    }
       
	}
	System.out.println("    THANK YOU     \n");
	con.close();
	st.close();
	}catch (Exception e) {
		System.out.println(e);
	}
}

}	

	

