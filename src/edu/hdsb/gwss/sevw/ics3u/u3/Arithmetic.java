/*
* Name: Arithmetic
* Date: 27-02-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Simple Program To calculate simple math
 */
package edu.hdsb.gwss.sevw.ics3u.u3;

/**
 *
 * @author Sean
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a =5;
    int b = 6;
    int sum = a+b;
    int pro = (a*b);
    int diff=a-b;
    int mod= a%b;
    
    System.out.println("The sum is. " +sum);
    System.out.println("The product is. " +pro);
    System.out.println("The difference is. " +diff);
    System.out.println("The mod is. "+ mod);
    }
    
}
