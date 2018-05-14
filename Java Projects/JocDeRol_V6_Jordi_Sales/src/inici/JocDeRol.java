/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;

import java.util.ArrayList;

import java.util.Iterator;

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
        ArrayList<Item> Items = new ArrayList<>();
        ArrayList<Team> Teams = new ArrayList<>();
        ArrayList<Player> Players = new ArrayList<>();
        Alien q = new Alien("Jordi", 2, 3, 4);
        Players.add(q);
        Alien e = new Alien("Jord2", 2, 3, 4);
        Alien er = new Alien("Jord3", 2, 3, 4);
        Alien erere = new Alien("Jord4", 2, 3, 4);
        Players.add(e);
        Players.add(er);
        Players.add(erere);
        Team equip1 = new Team("Rekiem");
        Team equip2 = new Team("Rekiem2");
        Team equip3 = new Team("Rekiem3");
        Teams.add(equip1);
        Teams.add(equip2);
        Teams.add(equip3);

        Item object2 = new Item("Heavens Divider", 560, 0);
        Items.add(object2);

        Player p = null; // No borrar(iterador)
        Team t = null;   // No borrar(iterador)
        Item objecte; //No borrar(iterador)
        int x;
        x = q.compareTo(e);
        /*   System.out.println(x);*/

        int menujdr;
        do {

            System.out.println("1. Configuracio");
            System.out.println("2. Jugar");
            System.out.println("3. Eixir");
            menujdr = Utils.Utilitats.leerEnteroC("Menu Option: ");
            System.out.println("");
            switch (menujdr) {
                case 1: {//Estem en Configuracio
                    String name;
                    String nomequip;
                    int atac, defensa, vida;
                    int menu;
                    do {

                        System.out.println("1.1 Gestio Jugadors");
                        System.out.println("1.2 Gestio Equips");
                        System.out.println("1.3 Gestio Items");
                        System.out.println("1.4 Tornar al menu anterior");
                        menu = Utils.Utilitats.leerEnteroC("Menu Option: ");
                        System.out.println("");
                        switch (menu) {
                            case 1: {//Estem en Gestio de Jugadors
                                int menuj;
                                do {

                                    System.out.println("1.1.1 Crear Jugador");
                                    System.out.println("1.1.2 Mostrar Jugadors");
                                    System.out.println("1.1.3 Esborrar Jugadors");
                                    System.out.println("1.1.4 Asignar Jugador a Equip");
                                    System.out.println("1.1.5 Asignar Item a Jugador");
                                    System.out.println("1.1.6 Tornar al menu anterior");
                                    menuj = Utils.Utilitats.leerEnteroC("Menu Option: ");
                                    System.out.println("");

                                    switch (menuj) {

                                        case 1: { //Creacio de Jugadors
                                            int tipus;

                                            do {
                                                System.out.println("Tria el Tipus de Jugador");
                                                System.out.println("1. Alien");
                                                System.out.println("2. Human");
                                                System.out.println("3. Warrior");
                                                System.out.println("4. Tornar al menu anterior");
                                                tipus = Utils.Utilitats.leerEnteroC("Tipus Option: ");
                                                System.out.println("");
                                                switch (tipus) {
                                                    case 1: { //Crear el Alien
                                                        int cont = 0;
                                                        try {
                                                            name = Utils.Utilitats.leerTextoG("Nom del Jugador: ");
                                                            Iterator<Player> it;
                                                            it = Players.iterator();
                                                            while (it.hasNext()) {
                                                                p = it.next();
                                                                if (p.getName().equals(name)) {
                                                                    System.out.println("Ja existeix aquest Jugador: " + name);
                                                                    cont++;
                                                                }
                                                            }
                                                            if (cont == 0) {
                                                                atac = Utils.Utilitats.leerEnteroG("Punts de atac del Jugador: ");
                                                                defensa = Utils.Utilitats.leerEnteroG("Punts de defensa del Jugador: ");
                                                                vida = Utils.Utilitats.leerEnteroG("Punts de vida del Jugador: ");
                                                                Alien jug = new Alien(name, atac, defensa, vida);
                                                                Players.add(jug);
                                                            }
                                                        } catch (Exception exc) {
                                                        }
                                                    }
                                                    break;
                                                    case 2: { //Crear el Huma
                                                        int cont = 0;
                                                        try {
                                                            name = Utils.Utilitats.leerTextoG("Nom del Jugador: ");
                                                            Iterator<Player> it;
                                                            it = Players.iterator();
                                                            while (it.hasNext()) {
                                                                p = it.next();
                                                                if (p.getName().equals(name)) {
                                                                    System.out.println("Ja existeix aquest Jugador: " + name);
                                                                    cont++;
                                                                }
                                                            }
                                                            if (cont == 0) {
                                                                atac = Utils.Utilitats.leerEnteroG("Punts de atac del Jugador: ");
                                                                defensa = Utils.Utilitats.leerEnteroG("Punts de defensa del Jugador: ");
                                                                vida = Utils.Utilitats.leerEnteroG("Punts de vida del Jugador: ");
                                                                Human jug = new Human(name, atac, defensa, vida);
                                                                Players.add(jug);
                                                            }
                                                        } catch (Exception exc) {
                                                        }
                                                    }
                                                    break;
                                                    case 3: { // Crear el Warrior
                                                        int cont = 0;
                                                        try {
                                                            name = Utils.Utilitats.leerTextoG("Nom del Jugador: ");
                                                            Iterator<Player> it;
                                                            it = Players.iterator();
                                                            while (it.hasNext()) {
                                                                p = it.next();
                                                                if (p.getName().equals(name)) {
                                                                    System.out.println("Ja existeix aquest Jugador: " + name);
                                                                    cont++;
                                                                }
                                                            }
                                                            if (cont == 0) {
                                                                atac = Utils.Utilitats.leerEnteroG("Punts de atac del Jugador: ");
                                                                defensa = Utils.Utilitats.leerEnteroG("Punts de defensa del Jugador: ");
                                                                vida = Utils.Utilitats.leerEnteroG("Punts de vida del Jugador: ");
                                                                Warrior jug = new Warrior(name, atac, defensa, vida);
                                                                Players.add(jug);
                                                            }
                                                        } catch (Exception exc) {
                                                        }
                                                    }
                                                    break;
                                                    default: { //Eixir del Tipus de Jugador

                                                    }
                                                    break;
                                                }
                                            } while (tipus > 0 && tipus < 4);

                                        }
                                        break;
                                        case 2: { //Mostrar els Jugadors
                                            System.out.println("*** Llista de Players ***");
                                            for (int i = 0; i < Players.size(); i++) {
                                                System.out.println(Players.get(i) + "\b");
                                            }
                                        }
                                        break;
                                        case 3: { //Esborrar Jugador
                                            name = Utils.Utilitats.leerTextoG("Nom del Jugador: ");
                                            Iterator<Player> it;
                                            it = Players.iterator();
                                            while (it.hasNext()) {
                                                p = it.next();
                                                if (p.getName().equals(name)) {
                                                    it.remove();
                                                    System.out.println("Player " + name + " eliminat.");
                                                }
                                            }
                                        }
                                        break;

                                        case 4: { //Asignar Jugador a Equip
                                            try {
                                                Player asign = null;
                                                Team asignt = null;
                                                name = Utils.Utilitats.leerTextoG("Nom del Jugador: ");
                                                nomequip = Utils.Utilitats.leerTextoG("Nom del Equip: ");
                                                int contp=0,contt=0;
                                                Iterator<Player> it;
                                                it = Players.iterator();
                                                while (it.hasNext()) {
                                                    p = it.next();
                                                    if (p.getName().equals(name)) {
                                                        System.out.println("Existeix aquest Jugador: " + name);
                                                        contp++;
                                                        asign = p;
                                                    }
                                                }
                                                
                                                Iterator<Team> it2;
                                                it2 = Teams.iterator();
                                                while (it2.hasNext()) {
                                                    t = it2.next();
                                                    if (t.getName().equals(nomequip)) {
                                                        System.out.println("Existeix aquest Team: " + nomequip);
                                                        contt++;
                                                        asignt = t;
                                                    }
                                                }
                                                if(contp == 0 || contt == 0){
                                                    if (contp == 0){
                                                        System.out.println("Aquest Player no existeix");
                                                    }
                                                    if(contt == 0){
                                                        System.out.println("Aquest Item no existeix");
                                                    }
                                                }else if (contp == 1 && contt == 1){
                                                    asign.add(asignt);
                                                }
                                            } catch (Exception exc) {
                                            }
                                        }
                                        break;
                                        case 5: { //Assignar objecte a jugador

                                        }
                                        break;
                                        default: { //Tornar al menu Configuracio

                                        }
                                        break;
                                    }
                                } while (menuj > 0 && menuj < 6);
                            }

                            break;

                            case 2: { // Estem en Gestio Equips
                                int menuequip;

                                do {

                                    System.out.println("1.2.1 Crear Equip");
                                    System.out.println("1.2.2 Mostrar Equips");
                                    System.out.println("1.2.3 Esborrar Equip");
                                    System.out.println("1.2.4 Asignar Equip a Jugador");
                                    System.out.println("1.2.5 Tornar al menu anterior");
                                    menuequip = Utils.Utilitats.leerEnteroC("Menu Option: ");
                                    System.out.println("");
                                    switch (menuequip) {
                                        case 1: { //Crear el equip
                                            int cont = 0;
                                            try {
                                                name = Utils.Utilitats.leerTextoG("Nom del Equip: ");
                                                Iterator<Team> it;
                                                it = Teams.iterator();
                                                while (it.hasNext()) {
                                                    t = it.next();
                                                    if (t.getName().equals(name)) {
                                                        System.out.println("Team: " + name + " ja esta creat.");
                                                        cont++;
                                                    }
                                                }
                                                if (cont == 0) {
                                                    Team nout = new Team(name);
                                                    Teams.add(nout);
                                                }
                                            } catch (Exception exc) {
                                            }
                                        }
                                        break;
                                        case 2: {//Mostrar els equips
                                            System.out.println("*** Llista de Equips ***");
                                            for (int i = 0; i < Teams.size(); i++) {
                                                System.out.println(Teams.get(i));

                                            }
                                        }
                                        break;
                                        case 3: {//Esborrar equip

                                            name = Utils.Utilitats.leerTextoG("Nom del Equip: ");
                                            Iterator<Team> it;
                                            it = Teams.iterator();
                                            while (it.hasNext()) {
                                                t = it.next();
                                                if (t.getName().equals(name)) {
                                                    it.remove();
                                                    System.out.println("Equip: " + name + " eliminat.");
                                                }
                                            }

                                        }
                                        break;
                                        case 4: {//Assignar equip a jugador

                                        }
                                        break;
                                        default: { //Tornem al menu Configuracio

                                        }
                                        break;
                                    }
                                } while (menuequip > 0 && menuequip < 5);
                            }
                            break;
                            case 3: {//Estem en Configuracio  
                                int menuitems;
                                do {
                                    System.out.println("1.3.1 Crear Objecte");
                                    System.out.println("1.3.2 Mostrar Objectes");
                                    System.out.println("1.3.3 Esborrar Objecte");
                                    System.out.println("1.3.4 Asignar Objecte a Jugador");
                                    System.out.println("1.3.5 Tornar al menu anterior");
                                    menuitems = Utils.Utilitats.leerEnteroC("Menu Option: ");
                                    System.out.println("");
                                    switch (menuitems) {
                                        case 1: {//Crear Item
                                            int cont = 0;
                                            try {
                                                name = Utils.Utilitats.leerTextoG("Nom del Item: ");
                                                Iterator<Item> it;
                                                it = Items.iterator();
                                                while (it.hasNext()) {
                                                    objecte = it.next();
                                                    if (objecte.getName().equals(name)) {
                                                        System.out.println("Item: " + name + " ja esta creat.");
                                                        cont++;
                                                    }
                                                }
                                                if (cont == 0) {
                                                    atac = Utils.Utilitats.leerEnteroG("Punts de atac");
                                                    defensa = Utils.Utilitats.leerEnteroG("Punts de defensa");
                                                    Item nouobj = new Item(name, atac, defensa);
                                                    Items.add(nouobj);
                                                }
                                            } catch (Exception exc) {
                                            }

                                        }
                                        break;
                                        case 2: {// Mostrar Items
                                            System.out.println("*** Llista de Items ***");
                                            for (int i = 0; i < Items.size(); i++) {
                                                System.out.println(Items.get(i));
                                            }
                                        }
                                        break;
                                        case 3: {// Esborrar Items
                                            name = Utils.Utilitats.leerTextoG("Nom del Item: ");
                                            Iterator<Item> it;
                                            it = Items.iterator();
                                            while (it.hasNext()) {
                                                objecte = it.next();
                                                if (objecte.getName().equals(name)) {
                                                    it.remove();
                                                    System.out.println("Item: " + name + " eliminat.");
                                                }
                                            }
                                        }
                                        break;
                                        case 4: {//Asignar Item a Jugador

                                        }
                                        break;
                                        default: {//Tornar al menu Configuracio

                                        }
                                        break;
                                    }
                                } while (menuitems > 0 && menuitems < 5);
                            }
                            break;
                            default: {//Tornem a Joc de Rol

                            }
                            break;
                        }
                    } while (menu > 0 && menu < 3);
                }

                break;

                case 2: {//Estem en menu Joc de Rol
                    provafase();  //Jugar al joc
                }
                break;
                case 3: { //Estem en menu Joc de Rol
                    System.exit(0); //Eixir del Joc
                }
            }
        } while (menujdr > 0 && menujdr < 3);

    }

    public static void provafase() {

        Human h = new Human("John Smith", 13, 8, 39);
        Alien a = new Alien("Martian PK", 27, 2, 32);
        Warrior w = new Warrior("Monyert", 27, 14, 40);

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
