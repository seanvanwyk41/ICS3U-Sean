package edu.hdsb.gwss.sevw.ics3u.U4;

/*
 * Name: Fibonacci
* Date: 01-04-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to determing the first 20 integers in the fibonacci sequence
 */

/**
 *
 * @author Sean
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    // Intro
        System.out.println("This program outfuts the first 20 numbers in the fibonachi sequence.");
     //variables   
        int startA = 1;
        int  startB= 0;
        int numLoops = 3 ;
        int print;
        
        //Out
        System.out.println("1 :"+startA+",");
        System.out.println("2 :"+startB+",");
        
        //loop
        while (numLoops <= 20) {
            
            //math
            print=startA+startB;
            startA=startB;
            startB=print;
            System.out.println(numLoops+":  "+print+",");
            numLoops=numLoops+1;
    }
    
}}
