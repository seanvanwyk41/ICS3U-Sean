/*
 * Name: Compass
 * Date: 14-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that will explain compass bearings 
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hardware initializing
        Scanner input = new Scanner(System.in);

        //variable intialization
        String bearing;
        char dir1;
        char dir2;
        String angle;
        String dirOut1=" ";
        String dirOut2=" ";

        //ask/get
        System.out.println("Please enter bearing:");
        bearing = input.next();
        bearing = bearing.toUpperCase();

        //Seperating Directions
        dir1 = bearing.charAt(0);
        dir2 = bearing.charAt(bearing.length()-1);
        angle = bearing.substring(1, (bearing.length() - 1));

        //If statement
        switch (dir1) {
            case 'N':
                dirOut1 = "NORTH";
                break;
            case 'E':
                dirOut1 = "EAST";
                break;
            case 'S':
                dirOut1 = "SOUTH";
                break;
            case 'W':
                dirOut1 = "WEST";
                break;
        }
        switch (dir2) {
            case 'N':
                dirOut2 = "NORTH";
                break;
            case 'E':
                dirOut2 = "EAST";
                break;
            case 'S':
                dirOut2 = "SOUTH";
                break;
            case 'W':
                dirOut2 = "WEST";
                break;
        }
        System.out.println("Start facing "+dirOut1+". Turn "+angle+" degrees towards the "+dirOut2+".");
    }

}
