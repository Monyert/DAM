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
        int vardef = getDefensePoints();

        if (p.getLife() <= 0) {
            System.out.println("La batalla ha acabat");
        } else if (getLife() <= 0) {
            System.out.println("La batalla ha acabat");
        } else if (p.getLife() > 0) {

            System.out.println("ABANS DE L'ATAC:");
            System.out.println("Atacant: " + this);
            System.out.println("Atacat: " + p);
            System.out.println("ATAC:");

        }
        if ((getLife() > 20) && (p.getLife() > 0)) {
            System.out.println(getName() + " fa us de l'habilitat Rage (+3 al atac, -3 a la defensa)");
            setAttackPoints(getAttackPoints() + 3);
            setDefensePoints(getDefensePoints() - 3);
            if (getDefensePoints() < 0) {
                setDefensePoints(0);
                p.Hit(getAttackPoints());
                if (p.getLife() == 0) {
                    System.out.print(p.getName() + "No pot efectuar un atac. \n");
                    //   System.out.println("DESPRES DE L'ATAC:");
                    //   System.out.println("Atacant: " + getName() + " PA:" + getAttackPoints() + " / PD:" + getDefensePoints() + " / PV:" + getLife());
                    //   System.out.println("Atacat: " + p);
                    //   setDefensePoints(vardef);
                } else {
                    Hit(p.getAttackPoints());
                    System.out.println("DESPRES DE L'ATAC:");
                    System.out.println("Atacant: " + getName() + " PA:" + getAttackPoints() + " / PD:" + getDefensePoints() + " / PV:" + getLife());
                    System.out.println("Atacat: " + p);
                    setAttackPoints(getAttackPoints() - 3);
                    setDefensePoints(vardef);
                }
            } else {

                p.Hit(getAttackPoints());
                if (p.getLife() == 0) {
                    System.out.print(p.getName() + " No pot efectuar un atac. \n");
                    //   System.out.println("DESPRES DE L'ATAC:");
                    //   System.out.println("Atacant: " + getName() + " PA:" + getAttackPoints() + " / PD:" + getDefensePoints() + " / PV:" + getLife());
                    //   System.out.println("Atacat: " + p);
                    //   setDefensePoints(vardef);
                } else {
                    Hit(p.getAttackPoints());
                    System.out.println("DESPRES DE L'ATAC:");
                    System.out.println("Atacant: " + getName() + " PA:" + getAttackPoints() + " / PD:" + getDefensePoints() + " / PV:" + getLife());
                    System.out.println("Atacat: " + p);
                    setAttackPoints(getAttackPoints() - 3);
                    setDefensePoints(vardef);
                }
            }

        } else {
            if (p.getLife() <= 0) {
                //     System.out.println("La batalla ha acabat");
            } else if (getLife() <= 0) {
                System.out.println("La batalla ha acabat");
            } else if (p.getLife() > 0) {
                System.out.println("ABANS DE L'ATAC:");
                System.out.println("Atacant: " + this);
                System.out.println("Atacat: " + p);
                System.out.println("ATAC:");
                p.Hit(getAttackPoints());
                if (p.getLife() == 0) {
                    System.out.print(p.getName() + " No pot efectuar un atac. \n");
                    //   System.out.println("DESPRES DE L'ATAC:");
                    //   System.out.println("Atacant: " + this);
                    //   System.out.println("Atacat: " + p);
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
