/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratiurecursiu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author monyert
 */
public class IteratiuRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        do {
            do{
            Scanner teclat = new Scanner(System.in);
            System.out.println("------------------------------------");
            System.out.println("1: Girar String de forma iterativa.");
            System.out.println("2: Girar String de forma recursiva");
            System.out.println("0: Eixir.");
            System.out.println("------------------------------------");
            System.out.print("Que vols fer?: ");
            menu = teclat.nextInt();
            } while ((menu < 0) || (menu > 2));
           switch(menu){
            case 1:{
                iteratiu();
            }break;
            case 2:{
                String paraula2 = "";
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader teclat = new BufferedReader (isr);

                    System.out.print("Disme una paraula: ");
                try {
                    paraula2 = teclat.readLine();
                } catch (IOException e) {
                     System.out.println("Ha hagut algun error!");
                    }
                System.out.println("Paraula nomal: " + paraula2);

                System.out.println("Paraula girada: " + recursiu(paraula2));
            }
break;
           }
        }while (menu!=0);
    }

    public static void iteratiu() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader teclat = new BufferedReader (isr);
        
        String paraula = "";
        System.out.print("Disme una paraula: ");
        try {
            paraula = teclat.readLine();
        } catch (IOException e) {
            System.out.println("Ha hagut algun error!");
        }
        System.out.println(paraula);
        String paraulainvertida = "";        
            for (int x = paraula.length()-1;x >= 0;x--){
		paraulainvertida = paraulainvertida + paraula.charAt(x);
            }
            System.out.println(paraulainvertida);
        
            // Comprovacio de la paraula reconocer com a palindrom.
    /*    paraula = "reconocer";
        paraulainvertida = "";
           System.out.println(paraula);
                for (int x = paraula.length()-1;x >= 0;x--){
                    paraulainvertida = paraulainvertida + paraula.charAt(x);
                }
           System.out.println(paraulainvertida);
        */
    }
    
     public static String recursiu (String paraula2) {
        if (paraula2.length() == 1){
            return paraula2;
        }
        else{ 
            return recursiu(paraula2.substring(1)) + paraula2.charAt(0);
        }
     }
}
