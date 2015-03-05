/*
 Name: Restaurant
* Date: 2-03-2015 (DD-MM-YYYY)
* Version: v1.1
* Author: Sean van Wyk
 * Description: Takes the input from the usuer of the price of the meal then calculates tip and tax and total cost
 */
package edu.hdsb.gwss.sevw.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //OBJECTS
        Scanner input = new Scanner(System.in);
    //CONSTANTS
        final double tip=0.10;
        final double tax=0.13;
    //VARIABLES
        System.out.println("Please enter list cost of meal. Round to the nearest dollar.");
        double food=input.nextInt();
    //LOGIC
        double tipCost=food*tip;
        double taxCost=food*tax;
        double total=food+tipCost+taxCost;
    //OUTPUT
        System.out.println("Food Cost $" + food);
        System.out.println("Tax Cost $" + taxCost);
        System.out.println("Tip Cost $" + tipCost);
        System.out.println("Total Cost $" + total);
    }
    
}
