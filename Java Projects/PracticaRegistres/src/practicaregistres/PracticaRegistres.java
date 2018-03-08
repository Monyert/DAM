/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaregistres;

/**
 *
 * @author monyert
 */
class Vivenda {

    double m2;
    int q_hab;
    double preu;
    NomComplet nm = new NomComplet();
    String nif;
}

class NomComplet {

    String nom;
    String cognom1;
    String cognom2;
}

public class PracticaRegistres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int TAM1 = 6;   //Nombre de escaleres
        final int TAM2 = 8;   //Nombre de plantes 
        final int TAM3 = 5;   //nombre de portes
        Vivenda Edificis[][][] = new Vivenda[TAM1][TAM2][TAM3];
        /*  int escalera = 0;
        int planta = 0;
        int porta = 0;
        int contador = 1;
        int ubicacio1 = 0;
        int ubicacio2 = 0;
        int ubicacio3 = 0;
         */
        construirVivenda(Edificis);

        comprarVivenda(Edificis);
    }

    public static Vivenda dadesin() {
        Vivenda v = new Vivenda();
        v.m2 = Utils.Utilitats.leerRealG("Disme els m2 de la Vivenda");
        v.q_hab = Utils.Utilitats.leerEnteroG("Disme el numero d'Habitacions");
        v.preu = Utils.Utilitats.leerRealG("Quin preu te la Vivenda?");
        v.nm.nom = Utils.Utilitats.leerTextoG("Nom del propetari");
        v.nm.cognom1 = Utils.Utilitats.leerTextoG("Primer Cognom del propetari");
        v.nm.cognom2 = Utils.Utilitats.leerTextoG("Segon Cognom del propetari");
        v.nif = Utils.Utilitats.leerTextoG("Disme el DNI del propietari");
        return v;
    }

    public static void construirVivenda(Vivenda matriu[][][]) {
        //COMPROVACIO DEL CONTINGUT DE LA MATRIU
        int escalera, planta, porta, ubicacio1, ubicacio2, ubicacio3, contador = 1;
        //    Vivenda Edificis[][][] = new Vivenda[TAM1][TAM2][TAM3];

        // Iniciar matriu 
        for (escalera = 0; escalera < matriu.length; escalera++) {
            for (planta = 0; planta < matriu[escalera].length; planta++) {
                for (porta = 0; porta < matriu[escalera][planta].length; porta++) {
                    matriu[escalera][planta][porta] = new Vivenda();
                }

            }

        }

        do {
            ubicacio1 = Utils.Utilitats.leerEnteroG("Disme la escala (Del 1 al 6): ");
        } while ((ubicacio1 < 1) || (ubicacio1 > 6));
        do {
            ubicacio2 = Utils.Utilitats.leerEnteroG("Disme la planta (Del 1 al 8): ");
        } while ((ubicacio2 < 1) || (ubicacio2 > 8));
        do {
            ubicacio3 = Utils.Utilitats.leerEnteroG("Disme la porta (Del 1 al 5): ");
        } while ((ubicacio3 < 1) || (ubicacio3 > 5));

        for (escalera = 0; escalera < matriu.length; escalera++) {
            for (planta = 0; planta < matriu[escalera].length; planta++) {
                for (porta = 0; porta < matriu[escalera][planta].length; porta++) {
                    if ((ubicacio1 - 1 == escalera) && (ubicacio2 - 1 == planta) && (ubicacio3 - 1 == porta)) {
                        matriu[escalera][planta][porta] = dadesin();
                    }
                }
            }
        }

    }

    public static void comprarVivenda(Vivenda matriu[][][]) {
        int escalera, planta, porta, ubicacio1 = 0, ubicacio2 = 0, ubicacio3 = 0, contador = 1;
        Utils.Utilitats.muestraMensajeG("Quina vivenda es la que vols comprar:");
        do {
            ubicacio1 = Utils.Utilitats.leerEnteroG("Disme la escala (Del 1 al 6): ");
        } while ((ubicacio1 < 1) || (ubicacio1 > 6));
        do {
            ubicacio2 = Utils.Utilitats.leerEnteroG("Disme la planta (Del 1 al 8): ");
        } while ((ubicacio2 < 1) || (ubicacio2 > 8));
        do {
            ubicacio3 = Utils.Utilitats.leerEnteroG("Disme la porta (Del 1 al 5): ");
        } while ((ubicacio3 < 1) || (ubicacio3 > 5));

        if ((matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].m2 > 0) 
                && (matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].nm.nom == null)
                && (matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].nm.cognom1 == null)
                && (matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].nm.cognom2 == null)) {
            System.out.println("Esta buida, pots comprarla.");
            dadesin();
        } else {
            System.out.println("La vivenda esta ocupada.");
            for (escalera = 0; escalera < matriu.length; escalera++) {
                for (planta = 0; planta < matriu[escalera].length; planta++) {
                    for (porta = 0; porta < matriu[escalera][planta].length; porta++) {
                        if ((escalera == ubicacio1 - 1) && (planta == ubicacio2 - 1) && (porta == ubicacio3 - 1)) {
                            System.out.println("Dades de la Vivenda numero: " + contador);

                        }
                        contador++;
                    }
                }
            }

            System.out.println(matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].m2 + " m2");
            System.out.println("DNI: " + matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].nif);
            System.out.println(matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].preu + " €");
            System.out.println(matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].q_hab + " Habitacio/ns");
            System.out.println("Propietari: " + matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].nm.nom + " "
                    + matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].nm.cognom1 + " "
                    + matriu[ubicacio1 - 1][ubicacio2 - 1][ubicacio3 - 1].nm.cognom2);
        }
    }
}
