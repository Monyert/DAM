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
    protected void Hit(int attackPoints) {
        int resultat;
        resultat = attackPoints - getDefensePoints();
        if (resultat > 0) {
            if(resultat > 0 && resultat <= 5){
                System.out.print(getName() + " es colpejat amb " + attackPoints + " i es defen amb " + getDefensePoints()
                    + ", el colp rebut es de " + resultat);
            System.out.println(", "+getName()+" fa us de \nl'habilitat Ultimate Evasion (Ferides <= 5 resten 0)");
            
        }else{
            System.out.print(getName() + " es colpejat amb " + attackPoints + " i es defen amb " + getDefensePoints()
                    + ". Vides: " + getLife() + " - " + resultat);
            setLife(getLife() - resultat);
            if (getLife() <= -1) {
                setLife(0);
                System.out.println(" = " + getLife());
            } else {
                System.out.println(" = " + getLife());
            }
            }
        }else {
            System.out.print(getName() + " es colpejat amb " + attackPoints + " i es defen amb " + getDefensePoints());
            System.out.print(". La Defensa ha tingut exit");
            System.out.println(". Vides:" + getLife());

        }
        if (getLife() <= 0) {
            System.out.println("" + getName() + " HA MORT!! ");
            setLife(0);
        }
    }
}
