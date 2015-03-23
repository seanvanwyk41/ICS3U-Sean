/*
* Name: Y2K problem detecter
* Date: 13-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to calculate a Persons age based on a two digit number
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Y2K_Problem_Detecter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Set up scanners
    Scanner input = new Scanner(System.in);
    int current =Calendar.getInstance().get(Calendar.YEAR);
    
    // Get birth year from user
    System.out.println("Insert Year of birth");
    int birth= input.nextInt();
    
    //Logic for detrmining age
    if((current-(birth+1900))>=100){
    int birthyr= birth + 2000;
    int age= current-birthyr;
    System.out.println("age:" +age);
    }
    else{
    int birthyr = birth + 1900;
    int age= current-birthyr;
    System.out.println("age:" +age);
    }
   
    }
    
    
    
}
