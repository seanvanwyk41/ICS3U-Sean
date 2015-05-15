/*
  * Name:SelectionSort
 * Date: 05-05-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that searches an array using the linera search method
 */
package edu.hdsb.gwss.sevw.ics3u.u6;

import edu.hdsb.gwss.sevw.ics3u.Libraries.ArrayTools;

/**
 *
 * @author Sean
 */
public class Linear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //array and variable initilization and population
        int compare = 0;
        int swap = 0;
        int search=1;
        int matchingItems=0;
        int[] x = new int[10];
        ArrayTools.populateArray(x, 1, 10);
        
        ArrayTools.bubbleSort(x, "up");
        ArrayTools.displayArray(x);
        
        for (int i=0;search<=x[i];i++){
            if (search==x[i]){
                matchingItems++;
                System.out.println("There is a matching item at index of " +(x.length-i-1));}}
        System.out.println("Thre are a total of "+matchingItems+" matching items");
    
    
}}
