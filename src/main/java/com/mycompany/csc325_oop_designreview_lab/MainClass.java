/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error - DONE
		
		// ToDo 6: Fix the constructor of Student class - DONE
                
                // Todo 7: Create two classes for Freshman and Senior  - DONE
                
                // ToDo 8: The senior class should have a minimum of 85 credits  -DONE
		
		// ToDo 9: Add a toString method for Freshman class - DONE
		
                // ToDo 10: Add a toString method for Senior class - DONE
                
		Student std1= new Freshman("James", (short)20, 12); // name, age, credits
                
                Student std2 = new Senior("John", (short)30, 90);
		
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output. - DONE
                
                
                Scanner theScan = new Scanner(System.in);
                   
                System.out.println("Insert gpa for student 1");
                std1.setGpa(theScan.nextDouble());
                System.out.println("Insert gpa for student 2");
                std2.setGpa(theScan.nextDouble());
                
		System.out.println(std1);
                
                System.out.println(std2);
		
		// ToDo 12: add comments and explain your code - DONE
		
		// ToDo 13: submit using a pull request.
	}

}