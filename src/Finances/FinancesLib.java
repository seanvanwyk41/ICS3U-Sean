/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finances;

/**
 *
 * @author Sean
 */
public class FinancesLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void newDatedFolder() {

    }

    public static void newDatedExcelFile() {

    }

    public static double tax(double amount) {
        double tax = amount * 0.13;
        tax = (Math.round(tax * 100) / 100);
        return tax;
    }

    public static double intrest(double start, double rate, double time) {
        double intrest=0.00;

        return intrest;
    }
}
