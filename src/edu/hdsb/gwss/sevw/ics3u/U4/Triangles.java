/*
 * Name: Triangles
* Date: 13-03-2015 (DD-MM-YYYY)
* Version: v1.1
* Author: Sean van Wyk
 * Description: Program to check whether a triange is possible and is right angled 
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Triangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Hardware initialisation
    Scanner input = new Scanner(System.in);
    
    //Constant
    int tmp =1;
    
    //Variable input
    System.out.println("Insert the length of side 1:  ");
    int x = input.nextInt();
    System.out.println("Insert the length of side 2:  ");
    int y = input.nextInt();
    System.out.println("Insert the length of side 3:  ");
    int z = input.nextInt();
    
    //Variable swap
    if (x>y){
        tmp=x;
        x=y;
        y=tmp;}
    else if (y>z){
        tmp=y;
        y=z;
        z=tmp;
    }
    
    // variable logic
    double a = Math.pow(x,2);
    double b = Math.pow(y,2);
    double c = Math.pow(z,2);
    
    //If statement logic
    if((x+y>z)){
    System.out.println("These side lengths make a triangle.");
        if((a+b==c)){
        System.out.println("This is a right angle triangle.");
        }
        else{
        System.out.println("This is not a right angle triangle");
        }
    }
    else{
            
    System.out.println("These side lengths do not make a triangle.");}
    }}