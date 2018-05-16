/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;


import java.util.ArrayList;

import java.util.Objects;

/**
 *
 * @author monyert
 */
public abstract class Player implements Comparable {

    private String name;
    private int attackPoints;
    private int defensePoints;
    private static int life = 100;
    private ArrayList <Team> Teams = new ArrayList <>();
    private ArrayList <Item> Items = new ArrayList <>();

    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
    }

    public void Attack(Player p) {

        if (life <= 0) {
            System.out.println("La batalla ha acabat");
        } else if (p.life <= 0) {
            System.out.println("\bLa batalla ha acabat");
        } else if (life > 0) {
            System.out.println("\bABANS DE L'ATAC:");
            System.out.print("Atacant:  " + this);
            System.out.print("Atacat:  " + p);
            System.out.println("\bATAC:");
            p.Hit(attackPoints);
            if (p.life == 0) {
                //    System.out.print("No pot efectuar un atac. \n");
                System.out.println("DESPRES DE L'ATAC:");
                System.out.print("Atacant:  " + this);
                System.out.print("Atacat:  " + p);
            } else {
                Hit(p.attackPoints);
                System.out.println("DESPRES DE L'ATAC:");
                System.out.print("Atacant:  " + this);
                System.out.print("Atacat:  " + p);
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public int getLife() {
        return life;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public void setLife(int life) {
        this.life = life;
    }
    
    public void add(Team t){
        
        boolean iguals, condicio = false;
        for (int i = 0; i <= Teams.size() - 1; i++) {
            iguals = t.equals(Teams.get(i));
            if (iguals == true) {
                condicio = iguals;
            }
        }
        if (condicio == true) {
            System.out.println(this.name + " ja forma part del equip " + t.getName());
        } else {
            
            Teams.add(t);
            t.setPlayers(this);
            System.out.println(this.name + " entra a l'equip " + t.getName());
        }
    }
    
    public void remove(Team t){
        boolean iguals, condicio = false;
        for (int i = 0; i <= Teams.size() - 1; i++) {
            iguals = t.equals(Teams.get(i));
            if (iguals == true) {
                condicio = iguals;
            }
        }
        if (condicio == true) {
            Teams.remove(t);
            t.removePlayers(this);
            System.out.println(this.name + " eliminat de l'equip " + t.getName());
            
        } else {
            System.out.println("Error. "+ this.name +" no forma part de l'equip " + t.getName());
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    

    public boolean equals(Player p) {
        if (this == p) {
            return true;
        }
        if (p == null) {
            return false;
        }
        if (getClass() != p.getClass()) {
            return false;
        }
        final Player other = (Player) p;
        if (!Objects.equals(this.Teams, other.Teams)) {
            return false;
        }
        return true;
    }

    public void setTeams(Team t) {
        Teams.add(t);
        
    }
    public void removeTeams(Team t){
        Teams.remove(t);
    }

    public ArrayList getTeams() {
        return Teams;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    
    protected void Hit(int attackPoints) {
        //El bonus de atack o defensa apareixera al costat del atack/defensa entre "()"
        int bonusattack = 0;
        int bonusdefense = 0;
        for (int i = 0; i < Items.size(); i++) {
           bonusattack = bonusattack + Items.get(i).getAttackbonus();
           bonusdefense = bonusdefense + Items.get(i).getDefensebonus(); 
        }
        
        int resultat;
        resultat = (attackPoints + bonusattack) - (defensePoints + bonusdefense);
        if (resultat > 0) {
            System.out.print(this.name + " es colpejat amb " + attackPoints +"("+ bonusattack +")"+ " i es defen amb " + this.defensePoints 
                    +"("+ bonusdefense +")" + ". Vides: " + this.life + " - " + resultat);
            life -= resultat;
            if (life <= -1) {
                life = 0;
                System.out.println(" = " + this.life);
            } else {
                System.out.println(" = " + this.life);
            }
        } else {
            System.out.print(this.name + " es colpejat amb " + attackPoints +"("+ bonusattack +")"+ " i es defen amb " + this.defensePoints +"("+ bonusdefense +")");
            System.out.print(". La Defensa ha tingut exit");
            System.out.println(". Vides:" + this.life);

        }
        if (this.life <= 0) {
            System.out.println("" + this.name + " HA MORT!! ");
            life = 0;
        }
    }
    
    public void additem (Item i){
        boolean iguals, condicio = false;
        for (int z = 0; z <= Items.size() - 1; z++) {
            iguals = i.equals(Items.get(z));
            if (iguals == true) {
                condicio = iguals;
            }
        }
        if (condicio == true) {
            System.out.println( this.name + " ja porta el item: " + i.getName());
        } else {
            if (i.getEquipat() == 0){
                i.setEquipat(1);
                Items.add(i);
                System.out.println( this.name + " s'equipa amb: " + i.getName());
            }else{
                System.out.println("Un jugador ja porta aquest item: " + i.getName());
            }
            
        }
       // Items.add(i);
    }
    
    public void removeitem (Item i){
        boolean iguals, condicio = false;
        for (int z = 0; z <= Items.size() - 1; z++) {
            iguals = i.equals(Items.get(z));
            if (iguals == true) {
                condicio = iguals;
            }
        }
        if (condicio == true) {
            if (i.getEquipat() == 1){
                i.setEquipat(0);
                Items.remove(i);
                System.out.println( this.name + " es desequipa: " + i.getName());
            }else{
                System.out.println("Un jugador ja porta aquest item ");
            }
            
        } else {  
            System.out.println( this.name + " no porta el item: " + i.getName()+", no es pot desequipar");
        }
       // Items.remove(i);
        
    }

    @Override
    public String toString() {
        return "\b\b "+name + " PA:" + attackPoints + " / PD:" + defensePoints 
                + " / PV:" + life +" (Pertany a "+Teams.size()+" equips) te els items: \n"
                + Items.toString()+"\b";
    }

    @Override
    public int compareTo(Object o) {
     Player p = (Player) o;
        if (this.name.length() < p.name.length()) {
            return -1;
        } else if (this.name.length() == p.name.length()) {
            return this.name.compareTo(p.name);
        } else {
            return 1;
        }
        
        
        
        /*  int igual;
        if(this.name.length() != p.name.length()){
            if(this.name.length() > p.name.length()){
                igual = 1;
            }else{
                igual = -1;
            }
        }else{
            if(this.name.equals(p.name)){
            igual = 0;
            }else{
            igual = 1;    
            }
        }
        return igual;*/
    }

    
}
