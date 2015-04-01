/*
* Name: Start and End
* Date: 01-04-2015 (DD-MM-YYYY)
* Version: v1
* Author: Sean van Wyk
 * Description: To print a count down
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class StartAndEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //objects
    Scanner input = new Scanner(System.in);   
    
    //ask get
    System.out.println("Enter start number.");
    int start=input.nextInt();
    System.out.println("Enter end number.");
    int end=input.nextInt();
    System.out.println();
    
    //calculate # of loops
    int numLoops= start-end;
        
    //Loop
    if (numLoops>0){
       do{
            System.out.println(start);
            numLoops= numLoops-1;
            start= start-1;
       }while(-1<numLoops);
    
    }
    else{
        do{
                
            System.out.println(start);
            numLoops= numLoops+1;
            start= start+1;
        }while(1>numLoops  );
        }}}
    
    

