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
        String name = "";
        provafase(name);
    }

    public static void provafase(String name) {
        System.out.println("Creating the Human character");
        Human h = new Human();
        System.out.println("Creating the Alien character");
        Alien a = new Alien();
        System.out.println("Creating the Warrior character");
        Warrior w = new Warrior();

    }

}
