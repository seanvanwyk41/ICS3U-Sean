/*
 * Name: ReduceFraction
 * Date: 23-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that reduces a fraction
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object Import
        Scanner input = new Scanner(System.in);

        //variables
        String fract;
        String out;

        //get ask
        System.out.println("Please enter fraction to reduce");
        fract = input.next();

        //calling function
        out = reduce(fract);
        if ("1".equals(out.substring(out.indexOf("/") + 1))) {
            System.out.println("" + out.substring(0, out.indexOf("/")));
        } else {
            System.out.println(out);
        }

    }

    public static String reduce(String fract) {
        //variables 
        String out;
        int numer;
        int denom;
        int smallest;
        boolean loop = true;

        //Spliting variables
        numer = Integer.parseInt("" + fract.substring(0, fract.indexOf("/")));
        denom = Integer.parseInt("" + fract.substring(fract.indexOf("/") + 1));

        //determining smallest absolute value
        if (Math.abs(numer) < Math.abs(denom)) {
            smallest = numer;
        } else {
            smallest = denom;
        }

        for (; loop; smallest--) {
            if (numer % smallest == 0 && denom % smallest == 0) {
                denom = denom / smallest;
                numer = numer / smallest;
                loop = false;
            } else {
            }
        }
        out = (String) (numer + "/" + denom);
        return out;

    }

}
