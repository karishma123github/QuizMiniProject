package com.mcq_pproject.karishma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ToPerticularStudent {
	
	Scanner sc=new Scanner(System.in);
  
	public  void  toInsertQuestionTakeTest(){
	  
	  boolean availableId=true;
		
	   Connection con=null;
	   PreparedStatement pstmt=null;
		
 
   	try {
   		System.out.println("Enter the id of student");
		   int id = sc.nextInt();
   	  Connectiondatabase connect=new Connectiondatabase();
   	  
   	  con= connect.getInputConnection();
  	  String sql=("select * from Student_Information order by rand()");
   	   
  	  pstmt=con.prepareStatement(sql);
	  ResultSet rs=pstmt.executeQuery(sql);
	 
   	while (rs.next()) {
	    if(rs.getInt(1)==id) {
	    	
		System.out.println("Id    : "+rs.getInt(1));
		System.out.println("Name  : "+rs.getString(2));
		System.out.println("Score : "+rs.getString(3));
		System.out.println("\n");
		availableId = true;
		break;
	    }	 
   	}
   	
	    if(availableId == false) {
   	   	System.out.println("Sorry !!!! Given Id is not register with us...\n");
	       
   	    pstmt.close();
   	    con.close();
   	
   	
	    }
   	}catch (Exception e) {
   		  System.out.println(e);
   	  }
   	
	}
   		}

