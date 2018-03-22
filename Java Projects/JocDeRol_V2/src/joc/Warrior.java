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
public class Warrior extends Human{

    public Warrior(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }
    
    @Override
    public  void Attack(Player p) {
        System.out.println("Abans de l'Atac");
        System.out.println("Atacant: " + toString());
        System.out.println("Atacat: " + p);
        System.out.println("ATAC:");
        System.out.print(p.getName()+" es colpejat amb "+getAttackPoints()+ " i es defen amb "+p.getDefensePoints()+".");
        Hit(getAttackPoints());
        System.out.print(getName()+" es colpejat amb "+p.getAttackPoints()+ " i es defen amb "+getDefensePoints()+".");
        Hit(getAttackPoints());
    }
    
    @Override
    protected  void Hit(int attackPoints){
        int resultat;
        resultat = getAttackPoints() - getDefensePoints();
        System.out.println("Vides: "+getLife()+" - "+ resultat);
    }
}
