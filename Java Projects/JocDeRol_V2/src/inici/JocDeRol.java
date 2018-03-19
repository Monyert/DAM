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
        // TODO code application logic here
    }
    
    public static void provafase(String name){
        System.out.println("Creating the Human character");
          Human pj1 = new Human(name, 0, 0, 0);
        System.out.println("Creating the Warrior character");
        Warrior pj2 = new Warrior(name, 0, 0, 0);
        System.out.println("Creating the Alien character");
          Alien pj3 = new Alien(name, 0, 0, 0);
    }
           
}
