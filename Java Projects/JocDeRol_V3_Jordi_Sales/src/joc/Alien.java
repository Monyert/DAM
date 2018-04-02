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
public class Alien extends Player {

    public Alien(String name, int attackPoints, int defensePoints, int life) {
        super(name, attackPoints, defensePoints, life);
    }

    @Override
    public void Attack(Player p) {
        if (getLife() > 20) {
            int rage = getAttackPoints() + 3;
            int ragedef = getDefensePoints() - 3;
            if (ragedef < 0){
                ragedef = 0;
            if (p.getLife() <= 0) {
                System.out.println("La batalla ha acabat");
            } else if (getLife() <= 0) {
                System.out.println("La batalla ha acabat");
            } else if (p.getLife() > 0) {
                
                System.out.println("ABANS DE L'ATAC:");
                System.out.println("Atacant: " + this);
                System.out.println("Atacat: " + p);
                System.out.println("ATAC:");
                System.out.println(getName() + " fa us de l'habilitat Rage (+3 al atac, -3 a la defensa)");
                p.Hit(rage);
                if (p.getLife() == 0) {
                    //    System.out.print("No pot efectuar un atac. \n");
                    System.out.println("DESPRES DE L'ATAC:");
                    System.out.println("Atacant: " + getName() + " PA:" + rage + " / PD:" + ragedef + " / PV:" + getLife());
                    System.out.println("Atacat: " + p);
                } else {
                    Hit(p.getAttackPoints());
                    System.out.println("DESPRES DE L'ATAC:");
                    System.out.println("Atacant: " + getName() + " PA:" + rage + " / PD:" + ragedef + " / PV:" + getLife());
                    System.out.println("Atacat: " + p);
                }
            }
            }

        } else {
            if (p.getLife() <= 0) {
                System.out.println("La batalla ha acabat");
            } else if (getLife() <= 0) {
                System.out.println("La batalla ha acabat");
            } else if (p.getLife() > 0) {
                System.out.println("ABANS DE L'ATAC:");
                System.out.println("Atacant: " + this);
                System.out.println("Atacat: " + p);
                System.out.println("ATAC:");
                p.Hit(getAttackPoints());
                if (p.getLife() == 0) {
                    //    System.out.print("No pot efectuar un atac. \n");
                    System.out.println("DESPRES DE L'ATAC:");
                    System.out.println("Atacant: " + this);
                    System.out.println("Atacat: " + p);
                } else {
                    Hit(p.getAttackPoints());
                    System.out.println("DESPRES DE L'ATAC:");
                    System.out.println("Atacant: " + this);
                    System.out.println("Atacat: " + p);
                }
            }
        }
    }
    
}
