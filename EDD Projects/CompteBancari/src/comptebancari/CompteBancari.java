/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancari;

/**
 *
 * @author monyert
 */
public class CompteBancari {
    // Definició de les propietats de la classe

    private int numeroCompte;
    private double saldo;

    public CompteBancari(int ncompte, double inicial) {
        numeroCompte = ncompte;
        saldo = inicial;
    } // Fi del constructor CompteBancari

    public void ingresar(double quantitat) throws Exception {
        if (quantitat < 0) {
            throw new Exception("No es pot ingressar una quantitat negativa");
        }
        saldo = saldo + quantitat;
    }

    public void retirar(double quantitat) throws Exception {
        if (quantitat <= 0) {
            throw new Exception("No es pot retirar una quantitat negativa");
        }
        if (cons_saldo() < quantitat) {
            throw new Exception("No hi ha suficiente saldo");
        }
        saldo = saldo - quantitat;
    }

    double cons_saldo() {
        return saldo;
    }
}
