/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;

import joc.Alien;
import joc.Human;
import joc.Warrior;

/**
 *
 * @author monyert
 */
public class JocDeRol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        provafase();
    }

    public static void provafase() {
        
        Human h = new Human("John Smith", 13, 8, 39);
        Alien a = new Alien("Martian PK", 27, 2, 32);
        Warrior w = new Warrior("Monyert", 27, 14, 40); //Per supost el meu pj, que es el millor.
     //   System.out.println(h);
     //   System.out.println(a);
     //   System.out.println(w);
        a.Attack(h);
        a.Attack(h);
        a.Attack(h);
        a.Attack(h);
    }

}
