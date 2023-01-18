package com.mcq_pproject.karishma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Main {
	 
     public static  void main(String[] args)  {
    	 Scanner sc=new Scanner(System.in);
		boolean choice=true;
		System.out.println("*************WELCOME TO KARISHMA'S PROJECT**************\n\n");
	
	   while(choice) {
		System.out.println("Select your choice from below options :\n ");
		System.out.println("  Press 1 : Enter To Solve  the Quiz first ");
		System.out.println("  Press 2 : Enter Your Name  ");
		System.out.println("  press 3 : to show the student Infrmation list ");
		System.out.println("  press 4 : Enter in the perticular student Information");
		System.out.println("  Press 5 : Quite from the project\n");
		
		System.out.println("--------------*--------------\n");
		System.out.println("press the key");
	
	    int keys=sc.nextInt();
		
		switch(keys) {
		case 1:
			System.out.println("welcome to Quiz\n");
			 Quizeresult to =new Quizeresult();
			 to.toInsertQuestionTakeTest();
			
			break;
		case 2:
			System.out.println("Welcome to Student list Add the Student Name\n");
		    ToAddStudent q=new ToAddStudent();
       	     q.insertdata();
       	     System.out.println();
			break;
		case 3:
			System.out.println("Welcome student Information\n");
			StudentTable.studentList();
			break;
		case 4:
			System.out.println("Welcome  Perticular student Information result \n");
			ToPerticularStudent perticular=new ToPerticularStudent();
			perticular.toInsertQuestionTakeTest();
			break;
			
		case 5:
			System.out.println("Quite from the project\n");
			choice=false;
			   System.out.println("Thank you for visit project\n");
			    System.out.println("*****************************End*************************\n");
			break;
	    default :
	    	System.out.println(" Please Enter vallide Number  "+"\n");	    	
		}	
		 
		    
	
		}
		
		
	}
	
}	
	
		
		
		

		
	
			
		
		
	


        
        
        
	


