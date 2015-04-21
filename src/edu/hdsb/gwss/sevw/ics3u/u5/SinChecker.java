/*
 * Name: SinChecker
 * Date: 20-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that validates a sin number
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class SinChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object Import
        Scanner input = new Scanner(System.in);

        //varibles
        String sin;
        double testFinal = 0.0;

        //get/ask
        System.out.println("Please insert your 9 digit sin number.");
        sin = input.next();

        //validation Checking Logic
        if (sin.length() != 9) {
            System.out.println("Invalid Number: Number too long: "+sin.length());
        }
        for (int i = 0; i < 8; i++) {
            if ((i % 2) == 1) {
                testFinal = testFinal + ((Integer.parseInt("" + sin.charAt(i)) * 2) % 10) + ((Integer.parseInt("" + sin.charAt(i)) * 2) / 10);
            } else {
                testFinal = testFinal + Integer.parseInt("" + sin.charAt(i));
            }
        }
        testFinal =(int) (10 * (Math.ceil( testFinal/10)) - (testFinal));

        //Validation 
        for (int i = 1; i < 7; i += 2) {
            if ((Integer.parseInt("" + sin.charAt(i)) * 2) % 10 != Integer.parseInt("" + sin.charAt(i + 2))) {
                System.out.println("Invalid Number: Loop Error Start int of "+i);
            }

        }
        if (Integer.parseInt("" + sin.charAt(8)) != testFinal) {
            System.out.println("Invalid Number:invalid 9th digit");
        } else {
            System.out.println("Number is valid");
        }
    }

}
