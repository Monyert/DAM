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
public class Banc {

    public static void main(String[] args) throws Exception {

        double totalCompte;
        // Creem el compte
        CompteBancari Compte;
        Compte = new CompteBancari(20324, 1200.30);
        // Consultamos el saldo
        totalCompte = Compte.cons_saldo();
        System.out.println("Saldo actual en el compte: " + totalCompte + " €");
        // Fem un ingrés en el compte
        double ingres = 350.20;
        System.out.println("Ingrés en el compte: " + ingres + " €");
        Compte.ingresar(ingres);

        System.out.println("-------------------------------------------------");
        // Consultem el saldo actual
        totalCompte = Compte.cons_saldo();
        System.out.println("Saldo actual en el compte: " + totalCompte + " €");

    }

}
