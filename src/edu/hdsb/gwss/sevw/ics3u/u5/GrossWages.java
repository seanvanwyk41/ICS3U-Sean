/*
 * Name: GrossWages
 * Date: 23-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that calculates income
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //object initalisation
    Scanner input=new Scanner (System.in);
    
    //Variables
    int hours;
    double dollars;
    
    //get ask
    System.out.println("Please enter hourly wage in dollars");
    dollars=input.nextDouble();
    System.out.println("Please enter amout of hours worked");
    hours=input.nextInt();
    
    calculateMoney(dollars,hours);
    }
    
    public static void calculateMoney(double dollars, int hours){
    //objects
        NumberFormat moneyForm= NumberFormat.getCurrencyInstance();
    //variables
    double money=0.0;
      
        if (hours<=40){
            money=hours*dollars;
        }
        else if (hours>40){
        money=dollars*40+1.5*(dollars)*(hours-40);
        }
        System.out.println((moneyForm.format(money)));
    }
}
