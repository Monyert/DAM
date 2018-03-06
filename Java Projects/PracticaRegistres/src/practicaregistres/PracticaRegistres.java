/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaregistres;

import java.util.Arrays;

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
        int Edifici[][][] = new int[TAM1][TAM2][TAM3];
        int escalera;
        int planta;
        int porta;
        // Edifici [][][] edf = new Edifici [TAM1][TAM2][TAM3];

        // Iniciar matriu a 0
        for (escalera = 0; escalera < Edifici.length; escalera++) {
            for (planta = 0; planta < Edifici[escalera].length; planta++) {
                for (porta = 0; porta < Edifici[escalera][planta].length; porta++) {
                   Edifici[escalera][planta][porta] = 0;
                }
                 
            }
            
        }
        
    

    }

    // Vivenda v = construirVivenda();
    // System.out.println (v.m2);
    public static Vivenda construirVivenda() {
        Vivenda v = new Vivenda();
        v.m2 = Utils.Utilitats.leerRealG("Disme els m2 de la Vivenda");
        v.q_hab = Utils.Utilitats.leerEnteroG("Disme el numero d'Habitacions");
        v.preu = Utils.Utilitats.leerRealG("Quin preu te la Vivenda?");
        v.nm.nom = Utils.Utilitats.leerTextoG("Nom del propetari");
        v.nm.cognom1 = Utils.Utilitats.leerTextoG("Primer Cognom del propetari");
        v.nm.cognom2 = Utils.Utilitats.leerTextoG("Segon Cognom del propetari");
        return v;
    }
}
