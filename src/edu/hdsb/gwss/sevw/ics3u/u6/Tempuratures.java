/*
 * Name:Golf
 * Date: 1-05-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that records and displays tempuratures
 */
package edu.hdsb.gwss.sevw.ics3u.u6;

import edu.hdsb.gwss.sevw.ics3u.Libraries.ArrayTools;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Tempuratures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objects
        Scanner input = new Scanner(System.in);

        //variables
        int maximumTempuratures[] = new int[7];
        String[] days
                = {"Monday", "Tuesday", "Wedsnesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //get ask
        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter predicted maximum tempurature for " + days[i]);
            maximumTempuratures[i] = input.nextInt();
        }

        //Out out
        for (int i = 0; i < 7; i++) {
            System.out.println("The maximum for " + days[i] + " is " + maximumTempuratures[i]);
            System.out.println("The maximum for the week is:"+(ArrayTools.calculateMax( maximumTempuratures )));
            System.out.println("The average for the week is:"+(ArrayTools.calculateAverage(maximumTempuratures )));
            System.out.println("The mimimum for the week is:"+(ArrayTools.calculateMin( maximumTempuratures )));
        }
    }
}