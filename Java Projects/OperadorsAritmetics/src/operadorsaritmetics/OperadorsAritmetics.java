/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorsaritmetics;

/**
 *
 * @author monyert
 */
public class OperadorsAritmetics {

    public static void main(String[] args) {
        int i = 12, j = 120;
        double x = 12.345, y = 8.27;
        System.out.print("Valors de les variables:\n");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
        System.out.print("Sumant:\n");
// Amb println es convertix a String i, per tant, concatenem:
        System.out.println(" i + j = " + (i + j));
// Amb printf hem d’indicar el format, i separem amb comes:
        System.out.printf(" x + y = %f", (x + y));
        System.out.println("");
    }
}
