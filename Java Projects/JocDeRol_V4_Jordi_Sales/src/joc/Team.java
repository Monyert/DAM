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
public class Team {
    private String name;
    private ArrayList <Player> Players = new ArrayList <>();
    
    
    public Team(String name) {
        this.name = name;
    }
    
    public void add(Player p){
        boolean iguals = false;
        for (int i = 0; i < Players.size(); i++) {
            iguals = p.equals(Players.get(i));
        }
        if (iguals = true){
            System.out.println("No pots crear el Mateix equip");
        }else {
        Players.add(p);
        p.setTeams(this);
        }
    }
    
    public void remove(Player p){
        Players.remove(p);
        p.remove(this);
        
    }

    public ArrayList getMembers() {
        return Players;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    public boolean equals(Team t) {
        if (this == t) {
            return true;
        }
        if (t == null) {
            return false;
        }
        if (getClass() != t.getClass()) {
            return false;
        }
        final Team other = (Team) t;
        if (!Objects.equals(this.Players, other.Players)) {
            return false;
        }
        return true;
    }

    

    public void setName(String name) {   
        this.name = name;
    }

    public void setPlayers(Player p) {
        Players.add(p);
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {

        return "Equip "+ name +": \n" + Players + "\b";
        
    }
}
