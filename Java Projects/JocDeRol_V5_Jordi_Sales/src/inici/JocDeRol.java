/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;

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
        
        //test4();
    }

                  // Test 4 adaptat per al meu Joc.
        public static void test4() {
		System.out.println("** Creating a Human, an Alien and a Warrior");
		Player human = new Human("John Smith", 13, 8, 39);
		Player alien = new Alien("Plk Dfw", 9, 7, 32);
		Player warrior = new Warrior("Geronimo", 9, 4, 170);		
		
		System.out.println("** Creating Teams");
		Team t1 = new Team("Human's");
		Team t2 = new Team("Aliens's");
		Team t3 = new Team("Good people");		
		
		System.out.println("** Asociate Players with teams");
		t1.add(human);
		t1.add(warrior);
		t2.add(alien);
		t3.add(human);
		
		System.out.println("** Creating Items");
		Item item1 = new Item ("Sunglasses", -1, -1);
		Item item2 = new Item ("False Nails", 5, 2);
		Item item3 = new Item ("AK-47", 20, -7);
		Item item4 = new Item ("Ironed Umbrella", -7, 10);
		Item item5 = new Item ("Frodo's Ring", 2, 7);	

		System.out.println("** Asociate Players with Items");
		human.additem(item1);
		human.additem(item2);
		human.additem(item4);
		alien.additem(item5);
		warrior.additem(item3);		
	
		System.out.println("** Show players:");
		System.out.println(human);
		System.out.println(alien);
		System.out.println(warrior);
		
		System.out.println("** Show teams:");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);		
		
		t1.remove(human);
		
		System.out.println("** Show players:");
		System.out.println(human);
		System.out.println(alien);
		System.out.println(warrior);
		
		System.out.println("** Show teams:");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);	
		
		warrior.Attack(alien);
		warrior.Attack(alien);
		human.Attack(warrior);
	
		human.removeitem(item1);
		System.out.println("** Show players:");
		System.out.println(human);
		System.out.println(alien);
		System.out.println(warrior);	
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
        Item DC = new Item("Dark Crystal", 0, 15);
        
        a.additem(IC);
        a.additem(IC);
        w.additem(IC);
        w.additem(HD);
        a.removeitem(IC);
        h.removeitem(IC);
    }

}
