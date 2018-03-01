/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafic;

import java.util.Scanner;

/**
 *
 * @author monyert
 */
public class Grafic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        numeroilletra();
        
    }
    
    public static void numeroilletra() {
        int vector[] = new int[10];
        int index, i, num=0;
        
           //Espai per a captar el numeros del vector
           
            for (index=num; index < vector.length; index++) {
               if (num >= 0){
                Scanner teclat = new Scanner(System.in);
                System.out.print("Introduix un numero: ");
                num = teclat.nextInt();
                vector[index] = num;
               }
               else{
                   System.out.println("Es Negatiu!");
                   System.exit(0);
                }
            }
           //espai per a captar el simbol

            String simbol;
            Scanner teclat = new Scanner(System.in);
            System.out.print("Introduix un caracter: ");
            simbol = teclat.nextLine();

            for (index = 0; index < vector.length; index++) {
                System.out.print(index + " ");
                for (i = 0; i < vector[index]; i++) {
                    System.out.print(simbol);
                }
                System.out.print("\n");
            }

            
        //    else {
         //       System.out.println("El numero te que ser positiu!!!");
        //    }
 
}
}
