/*
 * Name:SelectionSort
 * Date: 05-05-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that sorts an array into desending order using the Selectrion Sort method
 */
package edu.hdsb.gwss.sevw.ics3u.u6;

import edu.hdsb.gwss.sevw.ics3u.Libraries.ArrayTools;

/**
 *
 * @author Sean
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array and variable initilization and population
        int compare = 0;
        int swap = 0;
        int[] x = new int[10];
        ArrayTools.populateArray(x, 1, 10);

        //Printing the numbers in the array to the consol   
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println("" + x[i]);
        }
        System.out.println("");

        //Sorting code
        for (int i = 0, tmp = 0; i < x.length; i++) {
            for (int i2 = 0; i2 < x.length - i; i2++) {
                tmp = ArrayTools.calculateMaxIndex(x, x.length - i);
                compare=compare+x.length-i;
            }
            ArrayTools.swap(x, tmp, x.length - 1 - i);
            swap++;
        }

        //Final Out out
        for (int i = (x.length - 1); i >= 0; i--) {
           System.out.println("" + x[i]);
         }
        System.out.println("Compares: " + compare);
        System.out.println("Swaps: " + swap);
    }

}
