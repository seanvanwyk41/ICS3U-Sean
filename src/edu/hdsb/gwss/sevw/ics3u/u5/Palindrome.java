/* 
 * Name: WordSquare
 * Date: 17-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that checks if a string is a pala
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Object Import
        Scanner input = new Scanner(System.in);
        
    //variables
    String in;
    String back="";
    String tmp;
    //get/ask
    System.out.println("Please insert palndrome to test");
    in = input.next();
    in=in.toUpperCase();
    
    //
    for(int index=in.length()-1;index>=0;index--){
        tmp=Character.toString(in.charAt(index));
        back=back+tmp;
            }
    System.out.println(in+" backwards is: "+back);
    if (in.equals(back)){
        System.out.println(in+" is a palendrome.");
    }
}}
