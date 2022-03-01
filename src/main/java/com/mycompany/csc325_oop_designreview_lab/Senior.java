/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

import com.mycompany.csc325_oop_designreview_lab.Student;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soblab
 */
class Senior extends Student {
     public Senior(String name, short age, int numCredits){
        super(name, age, numCredits);
        if(numCredits < 85)
             try {
                 throw new Exception();
        } catch (Exception ex) {
                 System.out.println("Invalid number of credits for Senior");
        }
    }
     
     
     @Override
    public String toString(){
        return "The name of this Senior is: " + this.getName() 
                + "\nThe student's age is: " + this.getAge() 
                + "\nThe student has " + this.getNumCredits() + " credits completed"
                + "\nThe student has a gpa of: " + this.getGpa()
                + "\n-----------------------------------------------";
    }
}
