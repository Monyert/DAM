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
public class Item {
    private String name;
    private int attackbonus;
    private int defensebonus;
    private int equipat=0;

    public Item(String name, int attackbonus, int defensebonus) {
        this.name = name;
        this.attackbonus = attackbonus;
        this.defensebonus = defensebonus;
    }

    public int getEquipat() {
        return equipat;
    }

    public void setEquipat(int equipat) {
        this.equipat = equipat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackbonus() {
        return attackbonus;
    }

    public void setAttackbonus(int attackbonus) {
        this.attackbonus = attackbonus;
    }

    public int getDefensebonus() {
        return defensebonus;
    }

    public void setDefensebonus(int defensebonus) {
        this.defensebonus = defensebonus;
    }
    

    @Override
    public String toString() {
        return "\b\b\b - " + name + " BA:" + attackbonus + " / BD:" + defensebonus + "\n";
    }
    
    
}
