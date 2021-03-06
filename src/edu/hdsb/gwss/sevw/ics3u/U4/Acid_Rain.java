/*
* Name: Acid Rain
* Date: 13-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to determin safe PH levels in rivers
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Acid_Rain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Hardware input
    Scanner input = new Scanner(System.in);
    
    //print title
    System.out.println("Acid Rain"); 
    System.out.println("Acid rain is a an environmental problem.  This");
    System.out.println("program determines if the pH level in water is safe ");
    System.out.println("for fish.");
    
    //User input
     System.out.println("Enter a pH level:");
     int pH=input.nextInt();
     
     //if statement logic
     if (pH >= 6.5 && pH <= 7.5){
         System.out.println("NEAUTRAL-FISH IN STREAMS,RIVERS AND LAKES WILL SURVIVE");}
     else if (pH < 6.5){
          System.out.println("TOO ACIDIC-FISH IN STREAMS,RIVERS AND LAKES WILL NOT SURVIVE");}
     else{ 
          System.out.println("TOO ALKALINE-FISH IN STREAMS,RIVERS AND LAKES WILL NOT SURVIVE");}
     }
    }