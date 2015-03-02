/*
* Name:Payroll
* Date:  26-02-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description: A Simple demonstration of different file type
 */
package edu.hdsb.gwss.sevw.ics3u.u3;

/**
 *
 * @author Sean
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long   hoursWorked = 40;    
    double payRate     = 10.0, taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate));  // TODO code application logic here
    }
    
}
