
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{

    
	// ToDo 1: Make this class a child of Human - DONE
	
	// ToDo 2: Fix the resulting errors - DONE
	
	// ToDo 3: Add a field for GPA and create setter and getter - DONE
	
	// ToDo 4: Add comments to your code - DONE
    
    
    //instance variable gpa established
    private double gpa;
    
    protected int numCredits;
    
    public Student(String name, short age, int numCredits){
        super(name, age);
        this.numCredits = numCredits;
        gpa = 0;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }
    
    
    
    //getter method for gpa
    public double getGpa() {
        return gpa;
    }
    
    //setter method for gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    //getter for address field
    @Override
    public String getAddress() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.address;
    }
    
    //setter for address field
    @Override
    public void setAddress(String address) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.address = address;
    }
}