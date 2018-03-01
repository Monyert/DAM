/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numperfecte;

import java.util.Scanner;

/**
 *
 * @author monyert
 */
public class NumPerfecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        do {
            do{
            Scanner teclat = new Scanner(System.in);
            System.out.println("Programa 1 : Perfecte o no.");
            System.out.println("Programa 2 : Et dire els 5 primers perfectes.");
            System.out.println("Programa 0 : Eixir.");
            System.out.print("Que vols fer?: ");
            menu = teclat.nextInt();
            } while ((menu < 0) || (menu > 2));
           switch(menu){
            case 1:{
                int n;
                Scanner teclat = new Scanner(System.in);
                System.out.println("Disme el numero: ");
                n = teclat.nextInt();
                if (perfecte(n)){
                    System.out.println("Es Perfecte");
                }
                else {
                    System.out.println("No es Perfecte");
                }
            }break;
            case 2:{
                   perfecte5(args);
            }break;
           }
        }while (menu!=0);
    }
    public static boolean perfecte(int num) {
        int i, suma = 0;
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void perfecte5(String[] arg) {
     //   System.out.println("Atencio el programa esta en execucio, pero la "
     //           + "operacio podria tardar uns minuts...");
        int np = 1;
        String numerosp = "";
        int n = 1;
        int suma = 0;
         do {
            n++;
            for (int x = 1; x < n; x++) {
                if (n % x == 0) {
                    suma = suma + x;
                }
            }
            if (suma == n) {
                np = np + 1;
                numerosp = numerosp + suma + "\n";
                suma = 0;
            } else {
                //   System.out.println(n+"no es Perfecto");
                suma = 0;
            }
        }while (np < 5); //Fins a 4 per a no allargar la espera
        System.out.println("Numeros Perfectes:\n" + numerosp);
    }
}
