/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

import com.mycompany.csc325_oop_designreview_lab.Student;

/**
 *
 * @author Suleman Ali
 */
public class Freshman extends Student {

    /**
     *
     * @param name
     * @param age
     * @param numCredits
     */
    public Freshman(String name, short age, int numCredits) {
        super(name, age, numCredits);
    }

    /**
     * toString for Freshman class
     *
     * @return
     */
    @Override
    public String toString() {
        return "The name of this Freshman is: " + this.getName()
                + "\nThe student's age is: " + this.getAge()
                + "\nThe student has " + this.getNumCredits() + " credits completed"
                + "\nThe student has a gpa of: " + this.getGpa()
                + "\n-----------------------------------------------";
    }
}
