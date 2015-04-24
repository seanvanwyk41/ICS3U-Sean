/*
 * Name: StandardTime
 * Date: 23-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that converts time formats from standard to traditional
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object Import
        Scanner input = new Scanner(System.in);

        //variables
        String time;

        // Get Ask
        System.out.println("Please enter Time");
        time = input.nextLine();

        if (time.length()>5){
            convertToStandard(time);
        }
        else {
        convertToTraditional(time);}
    }

    public static void convertToTraditional(String time) {
        //Variable Intialising
        int hour;
        int minute;
        String beforeOrAfterNoon = "";

        //Seperating Hour from string
        hour = Integer.parseInt("" + time.charAt(0) + "" + time.charAt(1));
        minute = Integer.parseInt("" + time.charAt(3) + "" + time.charAt(4));

        if (hour == 12) {
            beforeOrAfterNoon = "PM";
        } else if (hour == 0) {
            hour = 12;
            beforeOrAfterNoon = "AM";
        } else if (hour > 12) {
            hour = hour - 12;
            beforeOrAfterNoon = "PM";
        } else if (hour < 12) {
            beforeOrAfterNoon = "AM";
        }

        System.out.println("The time is " + hour + ":" + minute + " " + beforeOrAfterNoon + " in traditional Time");

    }

    public static void convertToStandard(String time) {
        //Variable Intialising
        String hourOut;
        int hour;
        int minute;
        String beforeOrAfterNoon;

        //Seperating Hour from string
        hour = Integer.parseInt(""+time.charAt(0) + "" + time.charAt(1));
        minute = Integer.parseInt("" + time.charAt(3) + "" + time.charAt(4));
        beforeOrAfterNoon = time.substring(time.length()-2, time.length());
        if ("PM".equals(beforeOrAfterNoon) && hour == 12) {
            hourOut = "" + hour;
        } else if (hour == 12 && "AM".equals(beforeOrAfterNoon)) {
            hourOut ="00";}
        else if ("PM".equals(beforeOrAfterNoon)) {
            hourOut = "" + (hour + 12);}
        else{
        hourOut=""+hour;}
        System.out.println("The time is " + hourOut + ":" + minute + " in Standard Time");

    
}}
