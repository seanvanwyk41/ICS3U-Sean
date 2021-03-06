/*
 * Name:ArrayTools
 * Date: 30-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A library containing methods with tools that make array calculation easier
 */
package edu.hdsb.gwss.sevw.ics3u.Libraries;

import java.util.Arrays;

/**
 *
 * @author Sean
 */
public class ArrayTools {

    public static double calculateAverage(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double average = sum / data.length;
        return average;
    }

    public static int calculateMax(int[] data) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[index] < data[i]) {
                index = i;
            } else {
            }
        }
        int max = data[index];
        return max;
    }

    public static int calculateMaxIndex(int[] data, int x) {
        int index = 0;
        for (int i = 0; i < x; i++) {
            if (data[index] < data[i]) {
                index = i;
            } else {
            }
        }
        return index;
    }

    public static int calculateMin(int[] data) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[index] > data[i]) {
                index = i;
            } else {
            }
        }
        int min = data[index];
        return min;
    }

    public static int calculateMinIndex(int[] data) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[index] > data[i]) {
                index = i;
            } else {
            }
        }
        return index;
    }

    public static int calculateTotal(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;

    }

    public static void populateArray(int[] x, int start, int finish) {
        for (int i = x.length - 1; i > 0; i--) {
            x[i] = (int) (Math.random() * finish) + start;
        }
    }

    public static void swap(int[] x, int firstIndex, int secondIndex) {
        int tmp;

        tmp = x[firstIndex];
        x[firstIndex] = x[secondIndex];
        x[secondIndex] = tmp;
    }

    //Sorts a array using the selection sort method
    public static void selectionSort(int[] x, String order) {
        if ("down".equals(order.toLowerCase())) {
            for (int i = 0, tmp = 0; i < x.length; i++) {
                for (int i2 = 0; i2 < x.length - i; i2++) {
                    tmp = ArrayTools.calculateMaxIndex(x, x.length - i);
                }

                ArrayTools.swap(x, tmp, x.length - 1 - i);
            }
        } else if ("up".equals(order.toLowerCase())) {
            for (int i = 0, tmp = 0; i < x.length; i++) {
                for (int i2 = 0; i2 < x.length - i; i2++) {
                    tmp = ArrayTools.calculateMaxIndex(x, x.length - i);
                }
                ArrayTools.swap(x, tmp, x.length - 1 - i);
            }

        }
    }

    //Displays all values in an array
    public static void displayArray(int[] x) {
        for (int i = (x.length - 1); i >= 0; i--) {
            System.out.println("" + x[i]);
        }
    }

    //Bubble sorts in either asending or desending order
    public static void bubbleSort(int[] x, String order) {
        if ("down".equals(order.toLowerCase())) {
            for (int i = 0; i < x.length - 1; i++) {
                for (int i2 = 0; i2 < x.length - 1 - i; i2++) {
                    if (x[i2] > x[i2 + 1]) {
                        ArrayTools.swap(x, i2, i2 + 1);
                    }
                }
            }
        } else if ("up".equals(order.toLowerCase())) {
            for (int i = 0; i < x.length - 1; i++) {
                for (int i2 = 0; i2 < x.length - 1 - i; i2++) {
                    if (x[i2] > x[i2 + 1]) {
                        ArrayTools.swap(x, i2, i2 + 1);

                    }
                }
            }
        }
    }

    //Linear Search
    public static int linearSearch(int[] x, int search) {
        //initialize
        int y = -1;

        for (int i = 0; y == -1; i++) {
            if (x[i] == search) {
                y = i;
            }
        }

        return y;
    }
    
    public static int linearSearch(String[] x, String search) {
        //initialize
        int y = -1;

        for (int i = 0; y == -1 && i<x.length; i++) {
            if (x[i].equals(search)) {
                y = i;
            }
        }

        return y;
    }

    //binary Search
    public static int[] binarySearch(int[] x, int search) {
        //initialize
        int[] y = new int[2];
        int midIndex;
        int lowIndex;
        int highIndex;
        int startIndex = 0;
        int endIndex = 0;
        boolean loopStop = false;

        //sort
        ArrayTools.selectionSort(x, "down");

        // search
        lowIndex = 0;
        highIndex = x.length - 1;
        while (!loopStop && lowIndex < highIndex) {
            midIndex = (lowIndex + highIndex) / 2;
            if (x[midIndex] > search) {
                highIndex = midIndex - 1;
            } else if (x[midIndex] < search) {
                lowIndex = midIndex + 1;
            } else if (x[midIndex] == search) {
                endIndex = midIndex + 1;
                startIndex = midIndex;
                while(!loopStop){
                    if (endIndex + 1 == search) {
                        endIndex++;
                    } else if (startIndex - 1 == search) {
                        startIndex--;
                    } else {
                       loopStop=true;
                    }
                }

            }}
            if (lowIndex > highIndex) {
                System.out.println("No Mathces");
            }
            y[0] = startIndex;
            y[1] = endIndex;
            return y;
        }

    public static String subIndexString(int[] x, int start, int end) {
        String out = "";
        for (int i = 0; i < end - start; i++) {
            out = out + " " + (x[start]);
        }
        return out;
    }
}

//XIX,V,I,XIV,         ,V.,W.,
//XV/V/MMXV
