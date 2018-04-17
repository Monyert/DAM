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
    private ArrayList<Player> Players = new ArrayList<>();

    public Team(String name) {
        
        boolean condicio = false;
        for (int i = 0; i < Players.size(); i++) {
                
            if (name.equals(this.name)){
                condicio = true;
            }
        }
        if (condicio == true) {
                System.out.println("El equip " + this.name + " ja esta creat");
            } else {
                this.name = name;
            }

    }

    public void add(Player p) {
        Players.add(p);
        p.setTeams(this);
    }

    public void setPlayers(ArrayList<Player> Players) {
        this.Players = Players;
    }

    public void remove(Player p) {
        Players.remove(p);
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "Equip " + name + ": \n" + Players + "\b";

    }
}
