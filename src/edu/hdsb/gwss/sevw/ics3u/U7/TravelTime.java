/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.sevw.ics3u.U7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Sean
 */
public class TravelTime {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        //Imports
        File file = new File("TravelTimeData.txt");
        PrintWriter output = new PrintWriter(file);
        Scanner input = new Scanner(file);

        //variables and arrays
        String[] in = new String[(int) file.length()];
        String[] out = new String[(int) file.length()];
        String tmp;
        String time;
        int hour;
        int length;
        int zone;
        String minuteSecond;
        int lineNumber = 0;

        while (input.hasNext()) {
            in[lineNumber] = input.nextLine();
            lineNumber++;
        }

        for (int i = 0; i < in.length; i++) {
            tmp = in[i];

            //spliting Line into usefull variables
            StringTokenizer split = new StringTokenizer(tmp, " ");
            time = split.nextToken();
            length = parseInt(split.nextToken());
            zone = parseInt(split.nextToken());

            //splitting Time into usefull values
            StringTokenizer hourSplit = new StringTokenizer(time, ":");
            hour = parseInt(hourSplit.nextToken());
            minuteSecond = ":" + hourSplit.nextToken() + ":" + hourSplit.nextToken();

            //Conerting hour value
            hour = (hour + zone + length) % 24;
            out[i] = hour + minuteSecond;

        }
        for (int i = 0; i < out.length; i++) {
        output.write(out[i]);
        
        System.out.println(out[i]);
        }
        output.close();
    }

}
