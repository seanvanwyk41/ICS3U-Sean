/*
* Name: NumbersToWords
 * Date: 22-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description: a program that prints a number frim 0-99 in words.  
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class NumbersToWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        String in;
        char digitOne;
        char digitTwo;
        //ask Get
        System.out.println("Please in put number to translate to words");
        in = input.next();

        //splitting the string into chars
        if (in.length() == 2) {
            digitOne = in.charAt(1);
            digitTwo = in.charAt(0);
            if (digitOne == 0) {
                System.out.println("Zero");
            } else if (digitTwo == '1') {
                teens(digitOne);
            } else {
                tens(digitTwo);
                ones(digitOne);
            }
        } else if (in.length() == 1) {
            digitOne = in.charAt(0);
            ones(digitOne);
        } else {
            System.out.println("Invalid Number of digits");
        }
    }

    public static void ones(char x) {
        switch (x) {
            case '1':
                System.out.print(" One.");
                break;
            case '2':
                System.out.print(" Two.");
                break;
            case '3':
                System.out.print(" Three.");
                break;
            case '4':
                System.out.print(" Four.");
                break;
            case '5':
                System.out.print(" Five.");
                break;
            case '6':
                System.out.print(" Six.");
                break;
            case '7':
                System.out.print(" Seven.");
                break;
            case '8':
                System.out.print(" Eight.");
                break;
            case '9':
                System.out.print(" Nine.");
                break;
            case '0':
                break;

        }
    }

    public static void teens(char x) {
        switch (x) {
            case '1':
                System.out.print(" Eleven.");
                break;
            case '2':
                System.out.print(" Twelve.");
                break;
            case '3':
                System.out.print(" Thirteen.");
                break;
            case '4':
                System.out.print(" Fourteen.");
                break;
            case '5':
                System.out.print(" Fifteen.");
                break;
            case '6':
                System.out.print(" Sixteen.");
                break;
            case '7':
                System.out.print(" Seventeen.");
                break;
            case '8':
                System.out.print(" Eighteen.");
                break;
            case '9':
                System.out.print(" Nineteen.");
                break;
            case '0':
                System.out.print(" Ten.");
                break;
        }
    }

    public static void tens(char x) {
        switch (x) {
            case '2':
                System.out.print(" Twenty");
                break;
            case '3':
                System.out.print(" Thirty");
                break;
            case '4':
                System.out.print(" Fourty");
                break;
            case '5':
                System.out.print(" Fifty");
                break;
            case '6':
                System.out.print(" Sixty");
                break;
            case '7':
                System.out.print(" Seventy");
                break;
            case '8':
                System.out.print(" Eighty");
                break;
            case '9':
                System.out.print(" Ninety");
                break;
            case '0':
                break;

        }
    }
}
