/*
 * Name:Golf
 * Date: 29-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that displays golf scores
 */
package edu.hdsb.gwss.sevw.ics3u.u6;

import edu.hdsb.gwss.sevw.ics3u.Libraries.ArrayTools;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Scanner input = new Scanner(System.in);

        //variables to initialize
        int golfScores[]=new int [18];

        //Loop to ask/get
        for (int i = 0; i < 18; i++) {
            System.out.println("Please enter Score for hole " + (i+1) + " :");
            golfScores[i] = input.nextInt();
        }

        //Loop to print
        for (int i = 0; i < 18; i++) {
            System.out.println("Hole " + (i+1) + " : " + golfScores[i]);
        }
        System.out.println("Average: "+ArrayTools.calculateAverage(golfScores));
        System.out.println("Top score"+ArrayTools.calculateMax(golfScores));
        System.out.println("lowest score"+ArrayTools.calculateMin(golfScores));
        System.out.println("Total: "+ArrayTools.calculateTotal(golfScores));

}}
