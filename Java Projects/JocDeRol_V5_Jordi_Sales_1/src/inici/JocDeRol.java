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
        menuintro();
    }

    public static void menuintro() {
        int menujdr;
        do {
            // variable Menu Joc De Rol
            System.out.println("1. Configuracio");
            System.out.println("2. Jugar");
            System.out.println("3. Eixir");
            menujdr = Utils.Utilitats.leerEnteroC("Menu Option: ");
            System.out.println("");
            switch (menujdr) {
                case 1: {
                    menuconfig();//Configuracio
                }break;
                case 2: {
                    System.out.println("jugar");//Jugar
                }break;
                case 3: {
                    System.exit(0);
                }
            }
        } while (menujdr > 0 && menujdr < 3 );
    }
    
    public static void menuconfig() {
        int menu;
        do {
            // variable Menu Joc De Rol
            System.out.println("1.1 Gestio Jugadors");
            System.out.println("1.2 Gestio Equips");
            System.out.println("1.3 Gestio Items");
            System.out.println("1.4 Tornar al menu anterior");
            menu = Utils.Utilitats.leerEnteroC("Menu Option: "); 
            System.out.println("");
            switch (menu) {
                case 1: {
                    menujugadors();
                }break;
                case 2: {
                    System.out.println("jugar");
                }break;
                case 3: {
                    System.out.println("Gestio Items");
                }break;
                case 4: {
                    menuintro();
                }break;
            }
        } while (menu > 0 && menu < 3);
    }
    
    public static void menujugadors() {
        int menu;
        do {
            // variable Menu Joc De Rol
            System.out.println("1.1.1 Crear Jugador");
            System.out.println("1.1.2 Mostrar Jugadors");
            System.out.println("1.1.3 Esborrar Jugadors");
            System.out.println("1.1.4 Asignar Jugador a Equip");
            System.out.println("1.1.5 Asignar Item a Jugador");
            System.out.println("1.1.6 Tornar al menu anterior");
            menu = Utils.Utilitats.leerEnteroC("Menu Option: "); 
            System.out.println("");
            switch (menu) {
                case 1: {
                    System.out.println("gestio jugadors");
                }break;
                case 2: {
                    System.out.println("jugar");
                }break;
                case 3: {
                    System.out.println("Gestio Items");
                }break;
                case 4: {
                    System.out.println("Asignar jugador equip");
                }break;
                case 5: {
                    System.out.println("Asignar objecte jugador");
                }break;
                case 6: {
                    menuconfig();
                }break;
            }
        } while (menu > 0 && menu < 6);
    }
    
        public static void menuequips() {
        int menu;
        do {
            // variable Menu Joc De Rol
            System.out.println("1.1.1 Crear Equip");
            System.out.println("1.1.2 Mostrar Equips");
            System.out.println("1.1.3 Esborrar Equip");
            System.out.println("1.1.4 Asignar Equip a Jugador");
            System.out.println("1.1.5 Tornar al menu anterior");
            menu = Utils.Utilitats.leerEnteroC("Menu Option: "); 
            System.out.println("");
            switch (menu) {
                case 1: {
                    System.out.println("gestio jugadors");
                }break;
                case 2: {
                    System.out.println("jugar");
                }break;
                case 3: {
                    System.out.println("Gestio Items");
                }break;
                case 4: {
                    System.out.println("Asignar jugador equip");
                }break;
                case 5: {
                    
                }break;
            }
        } while (menu > 0 && menu < 6);
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
    }

}
