package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    // ToDo 1: Make this class a child of Human - DONE
    // ToDo 2: Fix the resulting errors - DONE
    // ToDo 3: Add a field for GPA and create setter and getter - DONE
    // ToDo 4: Add comments to your code - DONE
    private double gpa;

    protected int numCredits;

    /**
     * constructor for student object, GPA is set to zero to prevent exceptions
     * from getter method
     *
     * @param name
     * @param age
     * @param numCredits
     */
    public Student(String name, short age, int numCredits) {
        super(name, age);
        this.numCredits = numCredits;
        gpa = 0;
    }

    /**
     *
     * @return number of credits students earned
     */
    public int getNumCredits() {
        return numCredits;
    }

    /**
     * sets number of credits students have earned
     *
     * @param numCredits
     */
    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    /**
     *
     * @return student GPA
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * sets GPA
     *
     * @param gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     *
     * @return returns address field
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * sets address field
     *
     * @param address
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}
