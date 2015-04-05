/*
* Name: compoundIntrest
* Date: 01-04-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to determin compound interest generated
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.text.NumberFormat;
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
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    // Variables
    double start;
    double rate ;
    int time ;
    double cash;
    double cashInvested;
    int startTime;
    double intrest = 0;
    int year;
    
    
    // Get ask
    System.out.println("Enter monthly investments amount.");
    start=input.nextInt();
    System.out.println("Enter yearly intrest rate as a decimal.");
    rate=input.nextDouble();
    System.out.println("Enter number of years.");
    time=input.nextInt();
    
    //calculation
    cash=12*start;
    startTime= time;
    
    //validation
    if((time<=50) && (rate<=1) && (start <= 1000000000)){
        //Loop
        System.out.format("%24s %24s %24s %24s","Years invested","Money invested so far","Total intrest earned","Total in account");
        System.out.println();
        while(time>0){
            
            //math
            year=Math.abs(time-startTime-1);
            cashInvested=(12*start)*year;
            cash= cashInvested+intrest+(cash*rate);
            intrest=cash-cashInvested;
            time=time-1;
            
            //out
            System.out.format("%24s %24s %24s %24s",year,money.format(cashInvested),money.format(intrest),money.format(cash));
            System.out.println(); 
    }
        
    }
    else{
    System.out.println("In valid numbers please try again");}
    
}}
