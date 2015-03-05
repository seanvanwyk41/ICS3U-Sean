/*
 Name: Arithmetic
* Date: 27-02-2015 (DD-MM-YYYY)
* Version: v1.1
* Author: Sean van Wyk
 * Description: Simple Program To calculate the dimentions of a rectange
 */
package edu.hdsb.gwss.sevw.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //OBJECTS
        Scanner input = new Scanner(System.in);
    //VARIABLES
        System.out.println("What is the width of the rectangle?");
        int w=input.nextInt();
        System.out.println("What is the length of the rectangle?");
        int l=input.nextInt();
    //LOGIC
        int p= 2*(w+l);
        int a= w*l;
    //OUTPUT
        System.out.println("The Width is.     "+w);
        System.out.println("The Length is.    "+l);
        System.out.println("The Perimeter is. "+p);
        System.out.println("The Aerea is.     "+a);
     
    }
    
}
