package com.mcq_pproject.karishma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Scanner;

public class Quizeresult  {
	
	
	  Scanner sc=new Scanner(System.in);
	  Connection con=null;
	  PreparedStatement pstmt=null;

	  PreparedStatement psr=null;
	
	  public  void   toInsertQuestionTakeTest(){
       
   	try {
   	    Connectiondatabase connect=new Connectiondatabase();
 	   
  		ToAddStudent s=new ToAddStudent();
   	    s.insertdata();
 
   	  con= connect.getInputConnection();
  	  String sql=("select * from Quize order by rand()");
   	
      pstmt=con.prepareStatement(sql);
	  ResultSet rs=pstmt.executeQuery();

      int score=0 ;
	  for(int i=1;i<=10;i++) {
		 
      while(rs.next()) {
    		       	
    	System.out.println("           Question No "+i+"\n"); 
		System.out.println(" Quize No = "+i+rs.getInt(1)  +"  Question   "+rs.getString(2));
		System.out.println("   "+rs.getString(3));
        System.out.println("   "+rs.getString(4) );
        System.out.println("   "+rs.getString(5) );
        System.out.println("   "+rs.getString(6) );
      
        System.out.println("Give the answer ");   	  
        String ans=sc.next();
      
        if( ans.equalsIgnoreCase(rs.getString(7))) {
        	System.out.println("right answer");
        	score=score+1;
        		
        }else {
        	
        	System.out.println("sorry... wrong  answer");
        }   
           
    	  System.out.println("-----------------*----------------");
          
      }       
      } 
	 	
	  if(score>=8) {
    		  System.out.println(" Class = A ");
    	  } else if(score==6 ||score ==7) {
    		  System.out.println(" Class = B");
    	  }else if(score==5) {
    		  System.out.println(" Class = C");
    	  }else {
    		  System.out.println(" Class = Fail");
    	  }
			
	     psr=con.prepareStatement( "update student_information set Student_Score=? ");
    	 psr.setInt(1, score);
	
	   
	   int r = psr.executeUpdate();
	   System.out.println("Record is inserted >>> " + r);
	   System.out.println("You got  "+score+"/10\n");
	 
	      System.out.println("------------------------***------------------------------");
      
    	  System.out.println(" Press for Ahead of HOME page \n");
          System.out.println("********************************END**********************************\n");
        
          rs.close();
          psr.close();
          con.close();
	   	  pstmt.close();
	  

   	  }catch (Exception e) {
   		  System.out.println(e);
   	  }
   	  
	  }  
			
	  
}  
