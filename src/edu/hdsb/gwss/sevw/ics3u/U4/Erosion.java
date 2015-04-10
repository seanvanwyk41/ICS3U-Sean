/*
* Name: Erosion
* Date: 04-04-2015 (DD-MM-YYYY)
* Version: v0.1
* Author: Sean van Wyk
 * Description: Determine when topsiol will erode away
 */
package edu.hdsb.gwss.sevw.ics3u.U4;

/**
 *
 * @author Sean
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Variables
    double soil=30.0;
    double erode = 0.01;
    double soilReplen=2.5;
    int soilReplenTime=500;
    int time=0;
   
    //Time till dead plants
    do{
    soil=soil*(1-erode);
    time++;
    if ((time%500)==0){
        soil=soil+2.5;
    }
    }while(soil>9);
    
    //Out
    System.out.println("Topsoil Erosion");
    System.out.println("");
    System.out.println("Careless land managment causes approximately 1% of the topsiol to erode each year.");
    System.out.println("It is then lost forever, since it takes nature approximately 500 years to produce 2.5cm of topsoil.");
    System.out.println("At 9cm, the topsoild is so shallow the crops cannot grow on a largre sale.");
    System.out.println("It will take "+time+" years for the top soild to errode to depth such that no crops will grow>");
    System.out.println("");
    System.out.println("");
    }}
    
    

