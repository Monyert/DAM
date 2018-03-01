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
public class PracticaRegistres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Vivenda v=construirVivenda();
        System.out.println(v.m2);
        
    }
    
//b)

    /*
    public static void construirVivenda() {

        Utils.Utilitats.leerEnteroG("Disme el numero de l'Edifici");
        Utils.Utilitats.leerEnteroG("Disme el numero de l'Escalera");
        Utils.Utilitats.leerEnteroG("Disme el numero de la Planta");
        Utils.Utilitats.leerEnteroG("Disme el numero de la Vivenda");
        Utils.Utilitats.leerRealG("Disme els m2 de la Vivenda");
        Utils.Utilitats.leerEnteroG("Disme el numero d'Habitacions");
        Utils.Utilitats.leerRealG("Quin preu te la Vivenda?");
        Utils.Utilitats.leerTextoG("Nom del propetari");
        Utils.Utilitats.leerTextoG("Primer Cognom del propetari");
        Utils.Utilitats.leerTextoG("Segon Cognom del propetari");
    }
     */
    

    public static Vivenda construirVivenda() {
        Vivenda v = new Vivenda();
        v.m2 = Utils.Utilitats.leerRealG("Disme els m2 de la Vivenda");
        v.q_hab = Utils.Utilitats.leerEnteroG("Disme el numero d'Habitacions");
        v.preu = Utils.Utilitats.leerRealG("Quin preu te la Vivenda?");
        return v;
    }

}


/*    final int TAM1 = 1;
      final int TAM2 = 1;
      final int TAM3 = 1;
      Edifici [][][] edf = new Edifici [TAM1][TAM2][TAM3];
 */

class Edifici {

    int num;
    Escaleres esc = new Escaleres();
}

class Escaleres {

    char escalera;
    Planta plnt = new Planta();
}

class Planta {

    int num;
    Vivenda viv = new Vivenda();
}

class Vivenda {     //a)

    double m2;
    int q_hab;
    double preu;
    NomComplet nm = new NomComplet();
    String[] nif;
}

class NomComplet {

    String[] nom;
    String[] cognom1;
    String[] cognom2;
}
