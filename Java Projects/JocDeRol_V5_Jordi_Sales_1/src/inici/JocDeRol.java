/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;

import javax.swing.text.html.HTMLDocument;
import joc.Alien;
import joc.Human;
import joc.Item;
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
        
        Human h = new Human("Snake8", 13, 8, 39);
        Alien a = new Alien("Reena", 27, 2, 32);
        Warrior w = new Warrior("Monyert", 27, 14, 40); 
        
        Team equip1 = new Team("Rekiem");
        Team equip2 = new Team("OutofControl");
        Item HD = new Item("Heavens Divider", 5, 0);
        Item DB = new Item("Draconic Bow", 15, -10);
        Item IC = new Item("Imperial Crusader", 0, -10);
        
    //    System.out.print(h);
    //    System.out.print(a);
    //    System.out.print(w);
    h.additem(HD);
    w.additem(IC);
    w.additem(HD);
    a.additem(DB);
    a.additem(IC);
    a.additem(HD);
        a.Attack(h);
        
         
        System.out.println("");  
       
    }

}
