/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatema8;

import Utils.Utilitats;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author monyert
 */
public class PracticaTema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] Nom_1DAM = new String[20];
        int[] Notes_1DAM = new int[20];
        String[] Nom_2DAM = new String[20];
        int[] Notes_2DAM = new int[20];
        String nom_total[] = new String[Nom_1DAM.length + Nom_2DAM.length];
        int notes_total[] = new int[Notes_1DAM.length + Notes_2DAM.length];
        int element = 0, element2 = 0, element3 = 0;
        int menu = 0;
        do {
            do {
                try {
                Scanner teclat = new Scanner(System.in);
                System.out.println("------------------------------------");
                System.out.println("1. Donar d’alta	alumne (Nom i nota)");
                System.out.println("2. Mostrar mitges de grups.");
                System.out.println("3. Llistar nom del Alumnes.");
                System.out.println("4. Mostrar els 3 millors alumnes de cada grup.");
                System.out.println("5. Fusionar dades i mostrar tot.");
                System.out.println("0: Eixir.");
                System.out.println("------------------------------------");
                System.out.print("Que vols fer?: ");
                menu = teclat.nextInt();
                } catch (InputMismatchException e) {
                            }
            } while ((menu < 0) || (menu > 5));
            switch (menu) {
                case 1: {
                    int menu2 = 0;
                    do {
                        do {
                            try {
                            Scanner teclat = new Scanner(System.in);
                            System.out.println("------------------------------------");
                            System.out.println("1 Presencial");
                            System.out.println("2 Semipresencial");
                            System.out.println("0 Tornar arrere");
                            System.out.println("------------------------------------");
                            System.out.print("Que vols fer?: "); 
                            menu2 = teclat.nextInt();
                            } catch (InputMismatchException e) {
                            }
                        } while ((menu2 < 0) || (menu2 > 3));
                        switch (menu2) {
                            case 1: {
                                element = ordenar(Nom_1DAM, Notes_1DAM, element);
                            }
                            break;
                            case 2: {
                                element2 = ordenar(Nom_2DAM, Notes_2DAM, element2);
                            }
                            break;
                        }
                    } while (menu2 != 0);
                }
                break;
                case 2: {
                    int menu3 = 04;
                    do {
                        do {
                            try{
                            Scanner teclat = new Scanner(System.in);
                            System.out.println("------------------------------------");
                            System.out.println("1 Presencial");
                            System.out.println("2 Semipresencial");
                            System.out.println("0 Tornar arrere");
                            System.out.println("------------------------------------");
                            System.out.print("Que vols fer?: ");
                            menu3 = teclat.nextInt();
                            } catch (InputMismatchException e) {
                            }
                        } while ((menu3 < 0) || (menu3 > 3));
                        switch (menu3) {
                            case 1: {
                                System.out.println("Alumnes de 1DAM Presencial");
                                media(Notes_1DAM, element3,element);   //mitges presencial
                            }
                            break;
                            case 2: {
                                System.out.println("Alumnes de 1DAM SemiPresencial");
                                media(Notes_2DAM, element3,element);  // mitges semipresencial
                            }
                            break;
                        }
                    } while (menu3 != 0);
                }
                break;
                case 3: {
                    alumnestotal(Nom_1DAM, Notes_1DAM, Nom_2DAM, Notes_2DAM,element,element2);
                }
                break;
                case 4: {
                    millors(Nom_1DAM, Notes_1DAM, Nom_2DAM, Notes_2DAM);
                }
                break;
                case 5: {
                    dadestotal(nom_total,Nom_1DAM,Nom_2DAM,notes_total,Notes_1DAM,Notes_2DAM,element,element2);
                }
                break;
                case 0: {

                }
                break;
            }
        } while (menu != 0);

    }

    public static int ordenar(String[] noms, int[] notes, int element) {
        // Inserrim les dades i les ordenem
        noms[element] = Utilitats.leerTextoC("Disme el nom del Alumne "
                + "(Cognom1 Cognom2, Nom): ");
        do {//Control de error Nota entre 0 i 10
            notes[element] = Utilitats.leerEnteroC("Disme la nota de " + noms[element] + ": ");
        } while (notes[element] < 0 || notes[element] > 10);
        if (element == 0) {
            noms[0] = noms[element];
            notes[0] = notes[element];
        } else {
            for (int i = 0; i < element + 1; i++) {
                int aux = notes[i];
                String aux2 = noms[i];
                int j = i - 1;
                while ((j >= 0) && (aux > notes[j])) {
                    notes[j + 1] = notes[j];
                    noms[j + 1] = noms[j];
                    j--;
                }
                notes[j + 1] = aux;
                noms[j + 1] = aux2;
            }
        }

        element++;
        return element;
    }

    public static double media(int[] notes, double num, int element) {
        DecimalFormat formato1 = new DecimalFormat("#.000");
        
        for (int i = 0; i < element; i++) {
            num = num + notes[i];
        }
        num = num / element;
        System.out.println("La mitja es de : " + (formato1.format(num)));
        return num;
    }

    public static void millors(String[] Nom_1DAM, int[] Notes_1DAM, String[] Nom_2DAM, int[] Notes_2DAM) {
        System.out.println("Alumnes de 1DAM");
        for (int i = 0; i < Notes_1DAM.length-17; i++) {
            Utilitats.muestraMensajeC("Alumne: " + Nom_1DAM[i] + " te de nota: " + Notes_1DAM[i]);
        }

        System.out.println("Alumnes de 2DAM");
        for (int i = 0; i < Notes_2DAM.length-17; i++) {
            Utilitats.muestraMensajeC("Alumne: " + Nom_2DAM[i] + " te de nota: " + Notes_2DAM[i]);
        }
    }

    public static void alumnestotal(String[] Nom_1DAM, int[] Notes_1DAM, String[] Nom_2DAM, int[] Notes_2DAM,int element,int element2) {
        //Imprimir alumnes
        System.out.println("Alumnes de 1DAM");
        try {
        Arrays.sort(Nom_1DAM);      
        } catch (NullPointerException e) {
            }
        for (int i = 0; i < element; i++) {
            Utilitats.muestraMensajeC("Alumne: " + Nom_1DAM[i]);//+ " te de nota: " + Notes_1DAM[i]);
        }

        System.out.println("Alumnes de 2DAM");
         try {
        Arrays.sort(Nom_2DAM);
        } catch (NullPointerException e) {
            }
        for (int j = 0; j < element2; j++) {
            Utilitats.muestraMensajeC("Alumne: " + Nom_2DAM[j]);//+ " te de nota: " + Notes_1DAM[i]);
        }
    }

    public static void dadestotal(String nom_total[],String[] noms,String[] noms2, int[] notes_total,int[] notes, int[] notes2, int element,int element2) {
        int x=0,z=0;
        for (int i = 0; i < (element+element2); i++) {
                        if ((notes[x] >= notes2[z]) && (x < element)){
                            notes_total[i] = notes[x];
                            nom_total[i] = noms[x];
                                    x++;
                        } else{
                            notes_total[i] = notes2[z];
                            nom_total[i] = noms2[z];
                                    z++;  
                        }
                    }
                    System.out.println(Arrays.toString(nom_total));
                    System.out.println(Arrays.toString(notes_total));

    }       
}