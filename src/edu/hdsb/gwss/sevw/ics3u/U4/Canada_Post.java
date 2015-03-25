/*
* Name: Y2K problem detecter
* Date: 13-03-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: Program to calculate a Persons age based on a two digit number
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Canada_Post {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Hardware initialisation
    Scanner input = new Scanner(System.in);
     NumberFormat money = NumberFormat.getCurrencyInstance();
    
    //variable initilisation
    double cost = 0;
    
    
    //Title output
    System.out.println("Cost of Mailing a Letter");
    System.out.println("This program will calculate the cost of sending ");
    System.out.println("a first class or second class letter depending on the ");
    System.out.println("mass of the letter.");
    
    //user input
    System.out.println("Input class of Letter 1st(1) or 2nd (2).");
    int cLass= input.nextInt();
    System.out.println("input Weight of Letter sent in grams, no fractions please ");
    int weight= input.nextInt();
    
    //condition statments
    switch (cLass){
        case 1:{
        cost = cost + 0.40;
        if (weight<=50&& weight>30){
            cost = cost+0.20;}
        else if(weight>50){
            cost = cost+0.40;}
        else if (weight>100){
            cost=cost+(0.29*((weight-100)/50));}
        break;}
        case 2:{
        cost = cost+ 0.30;
        if (weight>100){
            cost=cost+(0.19*((weight-100)/50));}
        if (weight<=50&& weight>30){
            cost = cost+0.20;}
        else if(weight>50){
            cost = cost+0.40;}
        break;}
        default:{
        System.out.println("invalid class");}}
    
    //fianl output
    System.out.println("Total cost of letter"+ (money.format(cost)));
    
    //Maximum of five condition run
    
    }}
    
    
    

