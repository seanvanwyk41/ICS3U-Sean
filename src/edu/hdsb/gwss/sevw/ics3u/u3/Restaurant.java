/*
 Name: Restaurant
* Date: 2-03-2015 (DD-MM-YYYY)
* Version: v1
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
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter list cost of meal. Round to the nearest dollar.");
    double food= input.nextInt();
    double tip=0.10*food;
    double tax=0.13*food;
    double total=food+tip+tax;
    System.out.println("Food Cost $" + food);
    System.out.println("Tax Cost $" + tax);
    System.out.println("Tip Cost $" + tip);
    System.out.println("Total Cost $" + total);
    }
    
}
