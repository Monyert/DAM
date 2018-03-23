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
        System.out.println("ABANS DE L'ATAC:");
        System.out.println("Atacant: " + toString());
        System.out.println("Atacat: " + p);
        System.out.println("ATAC:");
        p.Hit(attackPoints);
        Hit(p.attackPoints);
        System.out.println("DESPRES DE L'ATAC:");
        System.out.println("Atacant: " + toString());
        System.out.println("Atacat: " + p);
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
        
        if (life >= resultat){
            life-=resultat;
           
        }else {
             System.out.println("ESTAA MORRTT");
        }
        
        if (resultat > 0){
        System.out.print(this.name+" es colpejat amb "+attackPoints+ " i es defen amb "+this.defensePoints+".");
        
        }else{
            System.out.println(this.name+" es colpejat amb "+attackPoints+ " i es defen amb "+this.defensePoints+".");
        //System.out.println("Vides: "+life+" - "+ resultat+" = "+(life=life-resultat));
            System.out.println(" La Defensa ha tingut exit");
        }
        System.out.println("Vides: "+this.life+" - "+ resultat+" = "+(life));
        
    }

    @Override
    public String toString() {
        return name + " PA:" + attackPoints + " / PD:" + defensePoints + " / PV:" + life;
    }
    
}
