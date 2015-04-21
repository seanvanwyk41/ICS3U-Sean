/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

/**
 *
 * @author Sean
 */
public class Method2 {
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     calculateLengthOfHyp(3.0,4.0);
     int x = 0;
     System.out.print(x);
     plusOne(x);
    System.out.print(x);
    }
    public static void calculateLengthOfHyp(double a, double b){
        double c=Math.sqrt(a*a+b*b);
        System.out.println((int)c);
    }
    public static int plusOne(int x){
    x++;
    return x;
    }
}
