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
        int escalera=0;
        int planta=0;
        int porta=0;
        int contador=1;
        

        
        comprovar(escalera, planta, porta, contador, contador, contador, contador);
    }

    
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
    
    public static void comprovar(int escalera,int planta,int porta,int contador,int ubicacio1,int ubicacio2,int ubicacio3){
        //COMPROVACIO DEL CONTINGUT DE LA MATRIU
        final int TAM1 = 6;   //Nombre de escaleres
        final int TAM2 = 8;   //Nombre de plantes 
        final int TAM3 = 5;   //nombre de portes
        Vivenda Edificis[][][] = new Vivenda[TAM1][TAM2][TAM3];
        
        // Iniciar matriu 
        for (escalera = 0; escalera < Edificis.length; escalera++) {
            for (planta = 0; planta < Edificis[escalera].length; planta++) {
                for (porta = 0; porta < Edificis[escalera][planta].length; porta++) {
                    Edificis[escalera][planta][porta] = new Vivenda();
                }

            }

        }
        
        for (escalera = 0; escalera < Edificis.length; escalera++) {
            for (planta = 0; planta < Edificis[escalera].length; planta++) {
                for (porta = 0; porta < Edificis[escalera][planta].length; porta++) {
                    System.out.println(Edificis[escalera][planta][porta]+" es el "+ contador);
                     contador++;
                }
            }
           
        }
        
        do{
            ubicacio1=Utils.Utilitats.leerEnteroG("Disme la escala: ");
        } while ((ubicacio1 < 1) || (ubicacio1 > 6));
        do{
            ubicacio2=Utils.Utilitats.leerEnteroG("Disme la planta: ");
        } while ((ubicacio2 < 1) || (ubicacio2 > 8));
        do{
            ubicacio3=Utils.Utilitats.leerEnteroG("Disme la porta: ");
        } while ((ubicacio3 < 1) || (ubicacio3 > 5));
        
        for (escalera = 0; escalera < Edificis.length; escalera++) {
            for (planta = 0; planta < Edificis[escalera].length; planta++) {
                for (porta = 0; porta < Edificis[escalera][planta].length; porta++) {
                    if ((ubicacio1-1 == escalera) && (ubicacio2-1 == planta) && (ubicacio3-1 == porta)){
                    Edificis[escalera][planta][porta] = construirVivenda();
                    }
                }
            }
        }
        
        System.out.println(Edificis[1][1][1]);
        
    }
}

