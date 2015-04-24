/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class NumbersToWords2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        String in;
        char digitOne;
        char digitTwo;
        char digitThree;
        //ask Get
        System.out.println("Please in put number to translate to words");
        in = input.next();

        //splitting the string into chars
        if (in.length() == 3) {
            digitOne = in.charAt(2);
            digitTwo = in.charAt(1);
            digitThree = in.charAt(0);
            if (digitTwo == '1') {
                hundreds(digitThree);
                teens(digitOne);
            } else {
                hundreds(digitThree);
                tens(digitTwo);
                ones(digitOne);
            }
        }
        else if (in.length() == 2) {
            digitOne = in.charAt(2);
            digitTwo = in.charAt(1);
            if (digitTwo == '1') {
                teens(digitOne);
            } else {
                tens(digitTwo);
                ones(digitOne);
            }
        } else if (in.length() == 1) {
            digitOne = in.charAt(0);
            if (digitOne == 0) {
                System.out.println("Zero");
            } else {

                ones(digitOne);
            }
        } else {
            System.out.println("Invalid Number of digits");
        }
    }

    public static void hundreds(char x) {
        switch (x) {
            case '1':
                System.out.print(" One Hundred");
                break;
            case '2':
                System.out.print(" Two Hundred");
                break;
            case '3':
                System.out.print(" Three Hundred");
                break;
            case '4':
                System.out.print(" Four Hundred");
                break;
            case '5':
                System.out.print(" Five Hundred");
                break;
            case '6':
                System.out.print(" Six Hundred");
                break;
            case '7':
                System.out.print(" Seven Hundred.");
                break;
            case '8':
                System.out.print(" Eight Hundred.");
                break;
            case '9':
                System.out.print(" Nine hundred.");
                break;
            case '0':
                break;
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
