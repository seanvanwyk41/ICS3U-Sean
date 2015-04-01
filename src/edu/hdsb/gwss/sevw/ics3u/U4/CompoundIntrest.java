/*
* Name: compoundIntrest
* Date: 01-04-2015 (DD-MM-YYYY)
* Version: v0.1
* Author: Sean van Wyk
 * Description: Program to determin safe PH levels in rivers
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class CompoundIntrest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here  //objects
    Scanner input = new Scanner(System.in);   
    
    // Variables
    int start;
    int rate ;
    int time ;
    int numLoops;
    
    // Get ask
     System.out.println("Enter monthly investments number.");
    start=input.nextInt();
    System.out.println("Enter yearly intrest rate as a decimal.");
    rate=input.nextInt();
    System.out.println("Enter number of years.");
    time=input.nextInt();
    
    //Number of Loops
    numLoops= time;
    
    //validation
    if((time<=15) && (rate<=1) && (start <= 1000000000)){
        
    }
    else{
    System.out.println("In valid numbers please try again");}
}}
