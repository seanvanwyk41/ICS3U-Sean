/*
 * Name:RockPaperScissors
 * Date: 24-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description:A program that plays rock paper scissors with the user
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //objects
        Scanner input= new Scanner(System.in);
        
     //variables
        String userIn;
        int user = 0;
        int computer;
        String out;
        
        //get ask
        System.out.println("Please select your throw(Rock/Paper/Scissors)");
        userIn= input.next();
        
        //get user number
        switch (userIn.toLowerCase()) {
            case "rock":
                user = 1;
                break;
            case "paper":
                user = 2;
                break;
            case "scissors":
                user = 3;
                break;
        }

        //get computer throw
        computer = generateRockPaperScissors();

        //get outcome
        out = determineOutcome(user, computer);

        //Display
        System.out.println(out);
    }
public static int generateRockPaperScissors() {

        int x = (int) (Math.random() * 3) + 1;
        return x;
    }

public static String determineOutcome(int user, int computer) {
                String out="";
        if (user==computer){
            out="The computer mathces your throw. It's a tie";
        }
        else{
            switch(user) {
            case 1:
                if (computer == 2) {
                out="You threw a rock but the computers paper covers it. You Lose.";
            } else {
                out="You threw a rock and it crushes the computers scissors. You Win. ";
            }
            break;
            case 2:
                if (computer == 1) {
                out="You threw a paper and it covers the computer's rock. You Win.";
            } else {
                out="You threw a papper but it was cut by the computers scissors. You Lose ";
            }
            break;
            case 3:
                if (computer == 1) {
                out="You threw a scissors but the computer's rock crushes it. You Lose.";
            } else if (computer == 2) {
                out="You threw a scissors and it cut the computer's paper. You Win.";
            }
            break;
            default:
                out="You Didn't throw and lost by default.";
            }}  
        return out;
    }
}
