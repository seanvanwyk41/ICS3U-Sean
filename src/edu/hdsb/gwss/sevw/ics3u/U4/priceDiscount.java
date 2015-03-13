/*
* Name: price Discount
* Date: 13-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to calculate price of the discount of products sold
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class priceDiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     NumberFormat money = NumberFormat.getCurrencyInstance(); 
     System.out.println("Insert Cost of item");
   
    double initialCost= input.nextDouble();
    if (initialCost > 10){
    double finalCost= 0.9*initialCost;
      System.out.println("Total Cost: " + (money.format(finalCost)));
    }
    else{
    double finalCost=initialCost;
      System.out.println("Total Cost: " + (money.format(finalCost)));
    }
    }
    
}
