/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linea;

import java.util.Scanner;

/**
 *
 * @author monyert
 */
public class Linea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       numeroilletra();       
    }
    public static void numeroilletra(){
        int num,i;{
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = teclat.nextInt();
    }
        String simbol;{
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introduce un caracter: ");
        simbol = teclat.nextLine();
        
        for (i = 0; i < num; i++) {
            System.out.print(simbol);
           
        }
        System.out.println();
    }
    }
}
