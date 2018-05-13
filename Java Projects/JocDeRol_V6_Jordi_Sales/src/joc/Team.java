/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author monyert
 */
public class Team implements Comparable {

    private String name;
    private ArrayList<Player> Players = new ArrayList<>();

    public Team(String name) {
                this.name = name;
    }

    public void add(Player p) {
        boolean iguals, condicio = false;
        for (int i = 0; i <= Players.size() - 1; i++) {
            iguals = p.equals(Players.get(i));
            if (iguals == true) {
                condicio = iguals;
            }
        }
        if (condicio == true) {
            System.out.println(p.getName() + " ja forma part del equip " + this.name );
        } else {
            
            Players.add(p);
            p.setTeams(this);
           
        }
        
    }

    public void setPlayers(ArrayList<Player> Players) {
        this.Players = Players;
    }

    public void remove(Player p) {
        boolean iguals, condicio = false;
        for (int i = 0; i <= Players.size() - 1; i++) {
            iguals = p.equals(Players.get(i));
            if (iguals == true) {
                condicio = iguals;
            }
        }
        if (condicio == true) {
            Players.remove(p);
            p.removeTeams(this);
            System.out.println(p.getName() + " eliminat de l'equip " + this.name );
        } else {
            System.out.println("Error. "+ p.getName() +" no forma part de l'equip " + this.name);
        }
        
    }

    public ArrayList getMembers() {
        return Players;
    }

    public boolean equals(Team t) {
        boolean iguals;
        iguals = (t.getName().equals(this.name));
        return iguals;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(Player p) {
        Players.add(p);
    }
    public void removePlayers(Player p) {
        Players.remove(p);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "Equip " + name + ": \n" + Players + "\b\b";

    }
    
    @Override
    public int compareTo(Object o) {
     Team p = (Team) o;
        if (this.name.length() < p.name.length()) {
            return -1;
        } else if (this.name.length() == p.name.length()) {
            return this.name.compareTo(p.name);
        } else {
            return 1;
        }
       
        
        
        
        /*int igual;
        if(this.name.length() != t.name.length()){
            if(this.name.length() > t.name.length()){
                igual = 1;
            }else{
                igual = -1;
            }
        }else{
            if(this.name.equals(t.name)){
            igual = 0;
            }else{
            igual = 1;    
            }
        }
        return igual;
    }*/
    }
}