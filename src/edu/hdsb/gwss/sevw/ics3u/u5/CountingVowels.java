/*
 * Name: CountingVowels
 * Date: 14-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that counts the vowels in a string
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Object Import
        Scanner input = new Scanner(System.in);

        //variables
        String check;
        int num = 0;

        //ask get
        System.out.println("Please Enter String to check");
        check = input.nextLine();

        //lowering all letters
        check = check.toLowerCase();

        //Loop
        for (int loop = check.length() - 1; loop >= 0; loop--) {
            char character = check.charAt(loop);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                num++;
            }
        }

        //Out Put
        System.out.println("There are " + num + " vowels in that string.");

    }
}
