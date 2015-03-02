/*
 Name: Digit Calculator
* Date: 2-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Calculates the amount of tens hunderd thousands and ones
 */
package edu.hdsb.gwss.sevw.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class DigitCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Integer to process");
        int num= input.nextInt();
        int thousands= (num)/1000;
        int hundreds= (num%1000)/100;
        int tens= (num%100)/10;
        int ones= num%10;
        System.out.println("Thousands"+thousands);
        System.out.println("Hundreds "+hundreds);
        System.out.println("Tens     "+tens);
        System.out.println("Ones     "+ones);
    }
    
}
