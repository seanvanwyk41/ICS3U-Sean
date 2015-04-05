/*
 * Name: CloserToTwo
* Date: 01-04-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to determing when java will round a integer to 2
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

/**
 *
 * @author Sean
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables to intialise
        double denom = 1;
        double start = 0;
        double prints = 0;

        //loop
        while (prints < 2) {

            //math
            prints = prints + 1.0 / denom;
            System.out.println(start+ "+ 1/" + denom + "=" + prints);
            denom = denom * 2;
            start = prints;
        }
    }

}
