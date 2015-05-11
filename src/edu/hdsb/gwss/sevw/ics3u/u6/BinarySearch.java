/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.sevw.ics3u.u6;

import edu.hdsb.gwss.sevw.ics3u.Libraries.ArrayTools;

/**
 *
 * @author Sean
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int []x=new int [10];
    int[] found=new int[2];
    ArrayTools.populateArray(x, 1, 10);
    int search=1;
    
    
    found=ArrayTools.BinarySearch(x, search);
    
    System.out.println(""+ArrayTools.subIndexString(x, found[0], found[1]));
    }
    
}
