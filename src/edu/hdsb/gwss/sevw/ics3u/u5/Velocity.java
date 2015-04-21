/*           
 * Name: Velocity
 * Date: 20-04-2015 (DD-MM-YYYY)
 * Version: v1
 * Author: Sean van Wyk
 * Description: a program calculates the velocity of an object.  
 */
package edu.hdsb.gwss.sevw.ics3u.u5;

 import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Velocity {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static double Distance;
    static double Time;
    static String VelocityReturn;

    public static void main(String[] args) {
        getData();
        VelocityDisplay();
    }

    public static void getData() {
        String unitsD;
        String unitsT;
        String timeReturn;
        String distanceReturn;

        //Ask/Get
        System.out.println("Input Distance");
        Distance = input.nextDouble();
        System.out.println("Input Unit of Distance(F(feet)/M(Metres)/Mi(Miles)/K(Kilometres))");
        unitsD = input.next();
        System.out.println("Input Time");
        Time = input.nextDouble();
        System.out.println("Input Unit of Time (S(seconds)/M(Minutes)/H(Hours))");
        unitsT = input.next();
        System.out.println("Enter unit of velocity return.(MS(meters/second)/FS(Feet/second)/KH(Km per hour)/MiH(miles per hour)");
        VelocityReturn = input.next();

        //Get return variales
        timeReturn = (String) VelocityReturn.substring(VelocityReturn.length() - 1);
        distanceReturn = (String) VelocityReturn.substring(0, VelocityReturn.length() - 1);

        //Convert to meters and seconds
        Distance = DistanceConvert(unitsD, Distance, distanceReturn);
        Time = TimeConvert(unitsT, Time, timeReturn);
    }

    public static void VelocityDisplay() {

        //variblaes
        double velocity;

        //output velocity
        switch (VelocityReturn) {
            case "MS":
                VelocityReturn = " Meters Per Second.";
                break;
            case "FS":
                VelocityReturn = " Feet per Second.";
                break;
            case "KH":
                VelocityReturn = " Kilometers per Hour.";
                break;
            case "MiH":
                VelocityReturn = " Miles per Hour.";
                break;
            default:
                System.out.println("Invalid Units");
        }
        //calculate
        velocity = Distance / Time;

        //Output
        System.out.println("The object is traveling at " + velocity + VelocityReturn);

    }

    public static Double DistanceConvert(String x, Double y, String z) {
        switch (x) {
            case "F":
                y = y * 0.305;
                break;
            case "M":
                break;
            case "Mi":
                y = y * 1609.34;
                break;
            case "K":
                y = y * 1000;
                break;
            default:
                System.out.println("Invalid Units");

        }

        switch (z) {
            case "F":
                y = y / 0.305;
                break;
            case "M":
                break;
            case "Mi":
                y = y / 1609.34;
                break;
            case "K":
                y = y / 1000;
                break;
            default:
                System.out.println("Invalid Units");
        }
        return y;
    }

    public static double TimeConvert(String x, double y, String z) {
        switch (x) {
            case "H":
                y = (y * 60) * 60;
                break;
            case "M":
                y = y * 60;
                break;
            case "S":
                break;
            default:
                System.out.println("Invalid Units");
        }
        switch (z) {
            case "H":
                y = (y / 60) / 60;
                break;
            case "M":
                y = y / 60;
                break;
            case "S":
                break;
            default:
                System.out.println("Invalid Units");
        }
        return y;

    }
}
