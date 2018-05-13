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
public class Item implements Comparable <Item>{
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
    
    @Override
    public int compareTo(Item it) {
        int igual;
        if(this.name.length() != it.name.length()){
            if(this.name.length() > it.name.length()){
                igual = 1;
            }else{
                igual = -1;
            }
        }else{
            if(this.name.equals(it.name)){
            igual = 0;
            }else{
            igual = 1;    
            }
        }
        return igual;
    }
    
}
