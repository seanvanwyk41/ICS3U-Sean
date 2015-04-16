package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/*
 * Name: WordSquare
 * Date: 14-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that prints a string such that it will fit on a LED Screen
 */
/**
 *
 * @author Sean
 */
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object Import
        Scanner input = new Scanner(System.in);

        // Variables
        String out;

        //ask get
        System.out.println("Please Enter String to output");
        out = input.nextLine();
        System.out.println();

        //Output Loop
        for (int start = 0; start <= out.length() - 1; start++) {
            System.out.println(out.substring(start, out.length()) + out.substring(0, start));
            System.out.println();
        }

    }
}
