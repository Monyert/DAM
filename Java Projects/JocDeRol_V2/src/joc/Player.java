/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/**
 *
 * @author monyert
 */
public abstract class Player {
    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life;

    public Player(String name, int attackPoints, int defensePoints, int life) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
    }

    public  void Attack(Player p) {
        System.out.println("Abans de l'Atac");
        System.out.println("Atacant: " + p);
        System.out.println("Atacat: " + p);
        System.out.println("ATAC:");
        System.out.print(name+" es colpejat amb "+attackPoints+ " i es defen amb "+defensePoints+".");
        Hit(attackPoints);
        System.out.print(name+" es colpejat amb "+attackPoints+ " i es defen amb "+defensePoints+".");
        Hit(attackPoints);
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

    protected  void Hit(int attackPoints){
        int resultat;
        resultat = attackPoints - defensePoints;
        System.out.println("Vides: "+life+" - "+ resultat);
        
    }

    @Override
    public String toString() {
        return name + " PA:" + attackPoints + " / PD:" + defensePoints + " / PV:" + life;
    }
    
}
