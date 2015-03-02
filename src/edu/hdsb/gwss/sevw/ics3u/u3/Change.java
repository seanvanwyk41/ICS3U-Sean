/*
 Name: Change
* Date: 2-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: simple change calculator
 */
package edu.hdsb.gwss.sevw.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter total change in cents.");
        int total=input.nextInt();
        int twenties= total/2000;
        int tens=(total%2000)/1000;
        int five=(total%1000)/500;
        int toonies=(total%500)/200;
        int loonies=(total%200)/100;
        int quarters=(total%100)/25;
        int dimes=(total%25)/10;
        int nickels=(total%10)/5;
        int pennies=(total%5)/1;
        System.out.println("Twenties. " + twenties);
        System.out.println("Tens.     " + tens);
        System.out.println("Fives.    " + five);
        System.out.println("Toonies.  "+ toonies);
        System.out.println("Loonies.  " + loonies);
        System.out.println("Quarters. " + quarters);
        System.out.println("Dimes.    " + dimes);
        System.out.println("Nickels.  " + nickels);
        System.out.println("Pennies.  " + pennies);
        
        
    }
    
}
