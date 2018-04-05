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

    public void Attack(Player p) {

        if (life <= 0) {
            System.out.println("La batalla ha acabat");
        } else if (p.life <= 0) {
            System.out.println("La batalla ha acabat");
        } else if (life > 0) {
            System.out.println("ABANS DE L'ATAC:");
            System.out.println("Atacant: " + this);
            System.out.println("Atacat: " + p);
            System.out.println("ATAC:");
            p.Hit(attackPoints);
            if (p.life == 0) {
                //    System.out.print("No pot efectuar un atac. \n");
                System.out.println("DESPRES DE L'ATAC:");
                System.out.println("Atacant: " + this);
                System.out.println("Atacat: " + p);
            } else {
                Hit(p.attackPoints);
                System.out.println("DESPRES DE L'ATAC:");
                System.out.println("Atacant: " + this);
                System.out.println("Atacat: " + p);
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
    
    protected void Hit(int attackPoints) {
        int resultat;
        resultat = attackPoints - defensePoints;
        if (resultat > 0) {
            System.out.print(this.name + " es colpejat amb " + attackPoints + " i es defen amb " + this.defensePoints
                    + ". Vides: " + this.life + " - " + resultat);
            life -= resultat;
            if (life <= -1) {
                life = 0;
                System.out.println(" = " + this.life);
            } else {
                System.out.println(" = " + this.life);
            }
        } else {
            System.out.print(this.name + " es colpejat amb " + attackPoints + " i es defen amb " + this.defensePoints);
            System.out.print(". La Defensa ha tingut exit");
            System.out.println(". Vides:" + this.life);

        }
        if (this.life <= 0) {
            System.out.println("" + this.name + " HA MORT!! ");
            life = 0;
        }
    }

    @Override
    public String toString() {
        return name + " PA:" + attackPoints + " / PD:" + defensePoints + " / PV:" + life;
    }

}
