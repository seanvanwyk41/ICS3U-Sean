/*
 * Name:BubbleSort
 * Date: 05-05-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that sorts an array into assending order using the bubble/rock method
 */
package edu.hdsb.gwss.sevw.ics3u.u6;

import edu.hdsb.gwss.sevw.ics3u.Libraries.ArrayTools;

/**
 *
 * @author Sean
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates and populates array
        int compare=0;
        int swap=0;
        int[] x = new int[18];
        ArrayTools.populateArray(x, 1, 100);
        
        //Prints the array values to the console
        for (int i = x.length-1; i >= 0; i--) {
            System.out.println("" + x[i]);
        }
        System.out.println("");
        
        //sorting Code
        for (int i = 0; i < (x.length - 1); i++) {
            for (int i2 =0; i2 <(x.length-1-i); i2++) {
                if (x[i2+1] > x[i2]) {
                    ArrayTools.swap(x, i2+1, i2);
                swap++;
                }
                compare++;
            }
        }
        
        //Final Out out
        for (int i = (x.length-1); i >= 0; i--) {
            System.out.println("" + x[i]);
        }
        System.out.println("Compares: "+compare);
                System.out.println("Swaps: "+swap);
    }}
