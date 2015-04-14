/*
 * Name: Slot_Machine
 * Date: 07-04-2015 (DD-MM-YYYY)
 * Version: v0.1
 * Author: Sean van Wyk
 * Description: A simple slot machinr game
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Slot_Machine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object initialize    
        Scanner input = new Scanner(System.in);

        // Intro
        System.out.println("The purpose of this code is to run a slot machine. You start with 50 token. Each spin costs 1 token;");
        System.out.println("If all are ones you win 4 tokens.");
        System.out.println("If all are two's you win 6 tokens.");
        System.out.println("If all are threes you win 8 tokens.");
        System.out.println("If all are 4 you win 10 tokens.");

        // Variable Initialising
        int first;          //first wheel
        int second;         //Second wheel
        int third;          //Third wheel
        int token = 50;       //Token counter
        String play;           //gets if you want to play or not

        // Start Loop; ask/get
        do {

            //Get ask
            System.out.println("welcome to Slot machine, you have " + token + " tokens would you like to play. (Y/N) ");
            play = input.next();
            
            //Continue play?
            if ("Y".equals(play)) {

                //Token deduction
                token = token - 1;

                // random number generation
                first = (int) (Math.random() * 4) + 1;
                second = (int) (Math.random() * 4) + 1;
                third = (int) (Math.random() * 4) + 1;

                //Slot Output
                System.out.print(first);
                System.out.print(second);
                System.out.print(third);
                System.out.println();

                //Are you a winner
                if (first == second && second == third) {

                    //Switch to calculate wether you win or not
                    switch (first) {
                        case 1:
                            System.out.println("Three 1's you win 4 tokens!!");
                            token = token + 4;
                            break;
                        case 2:
                            System.out.println("Three 2's you win 6 tokens!!");
                            token = token + 6;
                            break;
                        case 3:
                            System.out.println("Three 3's you win 8 tokens!!");
                            token = token + 8;
                            break;
                        case 4:
                            System.out.println("Three 4's you win 10 tokens!!");
                            token = token + 10;
                            break;

                    }
                } else {
                    System.out.println("You Lose.");
                }
            } else {
            }
        } while ("Y".equals(play)&& token>0);
        System.out.println("Thank You for playing please come and lose your hardearned money again.");
    }
}
