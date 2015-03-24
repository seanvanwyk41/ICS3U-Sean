/*
* Name: BMI
* Date: 13-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to determin BMI
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Hardware initialisation
    Scanner input = new Scanner(System.in);
    
    // User input
    System.out.println("Metric(0) or Imperial(1)");
    int units = input.nextInt();
    System.out.println("Input weight in kilograms(metric) or pounds (Imperial)");
    int weigh = input.nextInt();
    System.out.println("Input hight in meters(metric) or in inches(Imperial)");
    int hight = input.nextInt();
    
    //switch logic
    switch(units) {
        case 0:
          int weight=weigh;
          int bmi = weight/(hight*hight);
    if (bmi < 16){
        System.out.println("You are starving BMI:"+bmi);
    }
    else if ((bmi >= 16)&&(bmi<19.5)){
        System.out.println("You are underweight BMI:"+bmi);
        }
     else if ((bmi >= 19.5)&&(bmi<25)){
        System.out.println("You are ideal BMI:"+bmi);
        }
     else if ((bmi >= 25)&&(bmi<30)){
        System.out.println("You are overweight BMI:"+bmi);
     }
         else if ((bmi >= 30)&&(bmi<40)){
        System.out.println("You are Obese BMI:"+bmi);
        }
    else{
         System.out.println("you are morbidly Obese BMI:"+bmi);
        }
          break;
        case 1:
          int weight2=weigh*703;
          int bmi2 = weight2/(hight*hight);
    if (bmi2 < 16){
        System.out.println("You are starving BMI:"+bmi2);
    }
    else if ((bmi2 >= 16)&&(bmi2<19.5)){
        System.out.println("You are underweight BMI:"+bmi2);
        }
    else if ((bmi2 >= 19.5)&&(bmi2<25)){
        System.out.println("You are ideal BMI:"+bmi2);
        }
    else if ((bmi2 >= 25)&&(bmi2<30)){
        System.out.println("You are overweight BMI:"+bmi2);
     }
    else if ((bmi2 >= 30)&&(bmi2<40)){
        System.out.println("You are Obese BMI:"+bmi2);
        }
    else{
         System.out.println("you are morbidly Obese BMI:"+bmi2);
        }
          break;
        default:
          System.out.println("Incorrect Unit Type");
          break;
    }
    
        
    
}}
