/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;

import javax.swing.text.html.HTMLDocument;
import joc.Alien;
import joc.Human;
import joc.Player;
import joc.Team;
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
        
        Team equip1 = new Team("Rekiem");
        Team equip2 = new Team("OutofControl");
        
    //    System.out.print(h);
    //    System.out.print(a);
    //    System.out.print(w);
        a.Attack(h);
        a.Attack(h);
        a.Attack(h);
        a.Attack(h);
         
        System.out.println("");  
        
        
        h.add(equip2);
        w.add(equip1);
        w.remove(equip2);
        w.add(equip2);
        h.add(equip1);
        w.remove(equip2);
        equip1.add(h);
        equip1.add(h);
        equip1.remove(w);
        equip1.add(w);
        System.out.println(equip1);
        System.out.println(equip2);

        
    }

}
