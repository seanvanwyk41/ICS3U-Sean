/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.sevw.ics3u.u6;

import edu.hdsb.gwss.sevw.ics3u.Libraries.ArrayTools;

/**
 *
 * @author Sean
 */
public class ArrayToolsTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//variables
        int[] x = new int[8];
        int[] y = new int[8];
        System.out.println("Testing ArrayTools");
        System.out.println();
        System.out.println("-------");

        //Test 1 Populate Random array
        System.out.println("Test #1");
        System.out.println("//Populate Array");
        System.out.println("PopulateArray(x[],1,10)");
        ArrayTools.populateArray(x, 1, 10);
        for (int i = 0; i < x.length; i++) {
            assert (x[i] <= 10 && x[i] >= 1);
            System.out.print("" + x[i]);
        }
        System.out.println("");
        System.out.println("maximum!>10");
        System.out.println("minimum!<1");
        System.out.println();
        System.out.println("-------");

        //Test 2 Minimum
        System.out.println("Test #2");
        System.out.println("//Minimum");
        y = x;
        int minimum = ArrayTools.calculateMin(y);
        for (int i = 0; i < y.length; i++) {
            assert (minimum <= x[i]);
        }
        System.out.println(minimum);
        System.out.println("-------");

        //Test 3 Maximum
        System.out.println("Test #3");
        System.out.println("//Maximum");
        y = x;
        int maximum = ArrayTools.calculateMax(y);
        for (int i = 0; i < y.length; i++) {
            assert (y[maximum] <= y[i]);
        }
        System.out.println(maximum);
        System.out.println("-------");

        //Test 4 Maximum Index
        System.out.println("Test #4");
        System.out.println("//MaxIndex");
        y = x;
        int index = ArrayTools.calculateMaxIndex(y, y.length);
        for (int i = 0; i < y.length; i++) {
            assert (y[index] >= y[i]);
        }
        System.out.println(index);
        System.out.println("-------");

        //Test 5 Min Index
        System.out.println("Test #5");
        System.out.println("//MinIndex");
        y = x;
        index = ArrayTools.calculateMinIndex(y);
        for (int i = 0; i < y.length; i++) {
            assert (y[index] <= y[i]);
        }
        System.out.println(index);
        System.out.println("-------");

        //Test 6 Calculate Average
        System.out.println("Test #7");
        System.out.println("//Calculate Average");
        y = x;
        double average = ArrayTools.calculateAverage(y);
        for (int i = 0; i < y.length; i++) {
            assert (average <= ArrayTools.calculateMax(y) && average >= ArrayTools.calculateMin(y));
        }
        System.out.println(average);
        System.out.println("-------");
        System.out.println("Test #6");
        System.out.println("//Section Search");
        System.out.println("down");
        y = x;
        ArrayTools.selectionSort(y, "down");
        for (int i = y.length; i > 0; i--) {
            assert (y[i] < y[i - 1]);
        }
        System.out.println("up");
        y = x;
        ArrayTools.selectionSort(y, "up");
        for (int i = 0; i < y.length - 1; i++) {
            assert (y[i] < y[i + 1]);
        }
        System.out.println("-------");
        //Test 7 Calculate Total
        System.out.println("Test #7");
        System.out.println("//Calculate Total");
        y = x;
        int total = ArrayTools.calculateTotal(y);
        int sum = 0;
        for (int i = 0; i < y.length; i++) {
            sum = sum + y[i];
        }
        assert (sum == total);

        //Test 8 bubble sort
        System.out.println("total" + total);
        System.out.println("-------");
        System.out.println("Test #8");
        System.out.println("//Bubble Sort");
        y = x;
        ArrayTools.bubbleSort(y, "down");
        for (int i = y.length; i > 0; i--) {
            assert (y[i] < y[i - 1]);
        }
        System.out.println("up");
        y = x;
        ArrayTools.bubbleSort(y, "up");
        for (int i = 0; i < y.length - 1; i++) {
            assert (y[i] < y[i + 1]);
        }
        System.out.println("-------");

        //Test 9 Swap
         System.out.println("Test #9");
         System.out.println("//Swap");
         y=x;
         ArrayTools.swap(y, 0,1);
         assert(x[1]==y[0]&& x[0]==y[1]);
         System.out.println("-------");
         System.out.println("Test #10");
         

         System.out.println("//Linear Search");
         //Test 11 Binary search
         y[0]=11;
         index=ArrayTools.linearSearch(y,11);
         assert(index==0);
         
         
         System.out.println("--------");
         System.out.println("Test #11");
         y=x;
         int z[];
         for(int i=0;i<y.length;i++){
         z=ArrayTools.binarySearch(y, y[i]);
         assert(z[0]==i);}
         System.out.println("//Binary Search");
    }

}
//XIX,V,I,XIV,         ,V.,W.,
//XV/V/MMXV