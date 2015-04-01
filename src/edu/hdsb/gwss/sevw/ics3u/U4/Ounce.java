/*
* Name: Ounce
* Date: 01-04-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: to print an ounce calculation table
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Ounce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //objects
    Scanner input = new Scanner(System.in);   
    
    // Variables
    int numLoops;
    int ounce;
    double grams;
    
    //constants
    numLoops=15;
    
    
    //print loop
    System.out.format("%-18s %10s","Number of ounce.","Number of grams.");
    System.out.println();
       do{
            ounce= Math.abs(numLoops-16);
            grams=ounce*28.34;
            System.out.format("%-18s %10s",ounce,grams);
            numLoops= numLoops-1;
            System.out.println();
       }while(0<numLoops);
    

    
}}
