/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahorari;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author monyert
 */
class Horari {

    String modul;
    String profe;
    int aula;
}

public class Practicahorari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int TAM1 = 6;   //hores
        final int TAM2 = 5;   //dies
        Horari Clases[][] = new Horari[TAM1][TAM2];

        int menu = 0;
        System.out.println("Parcial de hores: 1 ->  8:00 -   8:55 | Dies: 1 -> Dilluns \n"
                + "                  2 ->  8:55 -   9:50 |       2 -> Dimats \n"
                + "                  3 ->  9:50 -  10:45 |       3 -> Dimecres \n"
                + "                  4 -> 11:15 -  12:10 |       4 -> Dijous \n"
                + "                  5 -> 11:15 -  13:05 |       5 -> Divendres \n"
                + "                  6 -> 13:05 -  14:00 |\n");
        do {
            do {
                try {
                    Scanner teclat = new Scanner(System.in);
                    System.out.println("------------------------------------");
                    System.out.println("1. Omplir Horari.");
                    System.out.println("2. Mostrar Horari.");
                    System.out.println("3. Modificar.");
                    System.out.println("4. Torna a mostrar la xulleta.");
                    System.out.println("0: Eixir.");
                    System.out.println("------------------------------------");
                    System.out.print("Que vols fer?: ");
                    menu = teclat.nextInt();
                } catch (InputMismatchException e) {
                }
            } while ((menu < 0) || (menu > 4));
            switch (menu) {

                case 1: {
                    omplirHorari(Clases);
                }
                break;
                case 2: {
                    mostrarhorari(Clases);

                }

                break;
                case 3: {
                    modificar(Clases);

                }

                break;
                case 4: {
                    System.out.println("Parcial de hores: 1 ->  8:00 -   8:55 | Dies: 1 -> Dilluns \n"
                + "                  2 ->  8:55 -   9:50 |       2 -> Dimats \n"
                + "                  3 ->  9:50 -  10:45 |       3 -> Dimecres \n"
                + "                  4 -> 11:15 -  12:10 |       4 -> Dijous \n"
                + "                  5 -> 11:15 -  13:05 |       5 -> Divendres \n"
                + "                  6 -> 13:05 -  14:00 |\n");
                }break;
                case 0: {

                }
                break;
            }
        } while (menu != 0);
    }

    public static void omplirHorari(Horari matriu[][]) {
        int hora, dia, ubicacio1, ubicacio2;

        do {
            ubicacio1 = Utils.Utilitats.leerEnteroG("Disme quin parcial de hores vols introduir (Del 1 al 6): ");
        } while ((ubicacio1 < 1) || (ubicacio1 > 6));
        do {
            ubicacio2 = Utils.Utilitats.leerEnteroG("Disme el dia (Del 1 al 5) ");
        } while ((ubicacio2 < 1) || (ubicacio1 > 5));

        for (hora = 0; hora < matriu.length; hora++) {
            for (dia = 0; dia < matriu[hora].length; dia++) {
                if ((ubicacio1 - 1 == hora) && (ubicacio2 - 1 == dia)) {
                    matriu[hora][dia] = omplir();
                }
            }

        }
    }

    public static Horari omplir() {
        Horari v = new Horari();
        v.modul = Utils.Utilitats.leerTextoG("Nom del modul: ");
        v.profe = Utils.Utilitats.leerTextoG("Nom del profesor: ");
        v.aula = Utils.Utilitats.leerEnteroG("Numero de aula: ");
        return v;
    }

    public static void mostrarhorari(Horari matriu[][]) {
        int hora, dia;
        String modulin;
        String profein;
        int aulain = 0;

        int opcio = submenu();
        switch (opcio) {
            case 1: {
                modulin = Utils.Utilitats.leerTextoG("Disme el Modul: ");
                for (hora = 0; hora < matriu.length; hora++) {
                    for (dia = 0; dia < matriu[hora].length; dia++) {
                        if (matriu[hora][dia] == null) {
                            continue;
                        } else if (matriu[hora][dia].modul.equalsIgnoreCase(modulin)) {
                            System.out.println((hora+1) + " Hora del dia " + (dia+1));
                        //    System.out.println(matriu[hora][dia].aula);
                            System.out.println(matriu[hora][dia].modul);
                        //    System.out.println(matriu[hora][dia].profe);

                        }
                    }
                }
            }
            break;

            case 2: {
                profein = Utils.Utilitats.leerTextoG("Disme el Professor: ");
                for (hora = 0; hora < matriu.length; hora++) {
                    for (dia = 0; dia < matriu[hora].length; dia++) {
                        if (matriu[hora][dia] == null) {
                            continue;
                        } else if (matriu[hora][dia].profe.equalsIgnoreCase(profein)) {
                            System.out.println((hora+1) + " Hora del dia " + (dia+1));
                        //    System.out.println(matriu[hora][dia].aula);
                        //    System.out.println(matriu[hora][dia].modul);
                            System.out.println(matriu[hora][dia].profe);

                        }
                    }
                }
            }
            break;
            case 3: {
                aulain = Utils.Utilitats.leerEnteroG("Disme l' aula: ");
                for (hora = 0; hora < matriu.length; hora++) {
                    for (dia = 0; dia < matriu[hora].length; dia++) {
                        if (matriu[hora][dia] == null) {
                            continue;
                        } else if (matriu[hora][dia].aula == aulain) {
                            System.out.println((hora+1) + " Hora del dia " + (dia+1));
                            System.out.println(matriu[hora][dia].aula);
                        //    System.out.println(matriu[hora][dia].modul);
                        //    System.out.println(matriu[hora][dia].profe);

                        }
                    }
                }
            }
            break;
            case 0: {

            }
            break;

        }

    }

    public static int submenu() {
        int menu = 0;

        do {
            try {
                Scanner teclat = new Scanner(System.in);
                System.out.println("------------------------------------");
                System.out.println("1. Mostrar el modul.");
                System.out.println("2. Mostrar el Professor.");
                System.out.println("3. Mostrar aula.");
                System.out.println("0: Torna Arrere.");
                System.out.println("------------------------------------");
                System.out.print("Que vols fer?: ");
                menu = teclat.nextInt();
            } catch (InputMismatchException e) {
            }
        } while ((menu < 0) || (menu > 3));

        return menu;
    }

    public static void modificar(Horari matriu[][]) {
        int hora, dia;
        String modulin;
        String profein;
        int aulain = 0;

        int opcio = submenu();
        switch (opcio) {
            case 1: {
                modulin = Utils.Utilitats.leerTextoG("Disme el Modul: ");
                for (hora = 0; hora < matriu.length; hora++) {
                    for (dia = 0; dia < matriu[hora].length; dia++) {
                        if (matriu[hora][dia] == null) {
                            continue;
                        } else {
                            matriu[hora][dia].modul = modulin;
                        }

                    }
                }
            }
            break;

            case 2: {
                profein = Utils.Utilitats.leerTextoG("Disme el Professor: ");
                for (hora = 0; hora < matriu.length; hora++) {
                    for (dia = 0; dia < matriu[hora].length; dia++) {
                        if (matriu[hora][dia] == null) {
                            continue;
                        } else {
                            matriu[hora][dia].profe = profein;

                        }
                    }
                }
            }
            break;
            case 3: {
                aulain = Utils.Utilitats.leerEnteroG("Disme l' aula: ");
                for (hora = 0; hora < matriu.length; hora++) {
                    for (dia = 0; dia < matriu[hora].length; dia++) {
                        if (matriu[hora][dia]== null) {
                            continue;
                        } else {
                            matriu[hora][dia].aula = aulain;
                        }
                    }
                }
            }
            break;
            case 0: {

            }
            break;

        }

    }
}
