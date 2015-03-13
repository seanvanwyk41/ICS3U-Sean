/*
* Name: Bob's Bolts
* Date: 13-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to calculate price of a list of items bought at bob's bolts
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class bobsBolts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Setup for scanners and formatting
    Scanner input = new Scanner(System.in);
     NumberFormat money = NumberFormat.getCurrencyInstance(); 
     
     //Money Constants
     final double boltPrce=0.05;
     final double nutPrce=0.03;
     final double washrPrce=0.01;
     
     //get number of bolts
     System.out.println("Insert number of bolts");
     int boltz= input.nextInt();
     
     //get number of nuts
     System.out.println("Insert number of nuts");
     int nutz= input.nextInt();
     
     //get number of Washers
     System.out.println("Insert number of washers");
     int washrs= input.nextInt();
     
     // Statements for number of items ordered
     System.out.println("Number of bots   : "+boltz);
     System.out.println("Number of Nuts   : "+nutz);
     System.out.println("Number of Washers: "+washrs);
     System.out.println("");
     
     // logic to check if # of washers is correct
     if(washrs<(2*boltz)){
     System.out.println("Check the Order  : too few washers");
     }
     
      //logic to check if # of nuts is correct
     if(nutz<boltz){
     System.out.println("Check the Order  : too few nuts");
     }
     
     //Logic for cost of Items
     double totl=(boltPrce*boltz)+(nutPrce*nutz)+(washrPrce*washrs);
      System.out.println("Total           : "+totl);
    }
    
}
