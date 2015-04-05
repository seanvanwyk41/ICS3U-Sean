/*
* Name: Lab_Animals
* Date: 04-04-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Determine when animals will out grow their food supply
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Lab_Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objects
        Scanner input = new Scanner(System.in);
        
        //Variable initialising
        int pop;
        int food;
        int foodAdd;
        int foodEnd;
        int popEnd;
        int hour = 1;
        
        
        //get ask
        System.out.println("Enter the Initial Population.");
        pop=input.nextInt();
        System.out.println("Enter Initial Food Supply.");
        food=input.nextInt();
        System.out.println("Enter Food to Add Each Hour.");
        foodAdd=input.nextInt();
        
        
        //Header
        System.out.format("%24s %24s %24s %24s %24s","Hour","Animals as start","Food at start","Food at end","Animals at end");
        System.out.println();
        
        //loop
        while(food>pop){
            //calculation
            food=food-pop;
            foodEnd=food+foodAdd;
            popEnd=2*pop;
            hour=hour+1;
            System.out.format("%24s %24s %24s %24s %24s",hour,pop,food,foodEnd,popEnd);
            System.out.println();
            pop=popEnd;
            food=foodEnd;
        }
        System.out.println("The population will exceed the food supply in "+hour+ " hours.");
    }
    
}
