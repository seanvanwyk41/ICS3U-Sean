/*
* Name: WordEcho
* Date: 30-03-2015 (DD-MM-YYYY)
* Version: v0.1
* Author: Sean van Wyk
 * Description: Program to repeat a word the same amount of times it has letters
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Variables
    int length;
    
    //Objects
    Scanner input = new Scanner(System.in);
    
    //ask get
    System.out.println("Enter word to pass");
    String word = input.nextLine();
    System.out.println();
    
    //Calculate variable value
    length = word.length();
    
    while (length>0){
        System.out.println(word);
        length=length-1;
    }
    
    }
    
}
