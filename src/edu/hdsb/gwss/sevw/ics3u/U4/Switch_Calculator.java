/*
* Name: Switch-Calculator
* Date: 23-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: simple calculator
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Switch_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Hardware input
    Scanner input = new Scanner(System.in);
    
    //Option Statement
    System.out.println("1. Addition"); 
    System.out.println("2. Subtraction");    
    System.out.println("3. Multiplication");    
    System.out.println("4. Division");   
    
    //Recive input For operation
    System.out.println("Insert operation to execute.");
    int Choice= input.nextInt();
    System.out.println("Choice:  "+Choice);
    
    //Recive input for integers to use in operation
    System.out.println("Insert first integer for calculation.");
    int x =input.nextInt();
    System.out.println("Insert secons integer for calculation.");
    int y =input.nextInt();
    
    //Switch logic operation
    switch(Choice){
        case 1:
            int z=x+y;
             System.out.println("Addition :"+x+" + "+y+" ="+z);
            break;
        case 2:
            int z1=x-y;
             System.out.println("Subtraction :"+x+" - "+y+" ="+z1);
            break;
        case 3:
            int z2=x*y;
            System.out.println("Multiplication :"+x+" x "+y+" ="+z2);
            break;
        case 4:
            double z3=x/y;
            int r=x%y;
            System.out.println("Division :"+x+" / "+y+" ="+z3+"  Remainder:"+r);
            break;
        default:
            System.out.println("Invalid Operation ");
    }
    }}
    

