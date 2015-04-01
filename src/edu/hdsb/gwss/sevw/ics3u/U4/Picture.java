/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Picture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //objects
    Scanner input = new Scanner(System.in);  
    
    //Variablt initialising
    int h;//h as in hight.
    int w;//w as in width.
    int m;//m as in matt.
    int f;// f as in frame.
    
    //Ask get
    /*System.out.println("Enter hight of frame.");
    h=input.nextInt();
    System.out.println("Enter width of frame.");
    w=input.nextInt();
    System.out.println("Enter size of matt.");
    m=input.nextInt();
    System.out.println("Enter size of frame.");
    f=input.nextInt();
    */
    //TMP
    h=2;
    w=3;
    f=2;
    m=3;
    
    //Picture hight
    for(int hight =1; hight<=h;h--){
        //row of dots
        for(int dots=1; dots<= w; w--){
            System.out.print(".");
        }
    System.out.println();}
    
}}
