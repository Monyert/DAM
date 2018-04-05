/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

import java.util.ArrayList;

/**
 *
 * @author monyert
 */
public class Team {
    private String name;
    private ArrayList Players;

    public Team(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name + " PA:" + getna() + " / PD:" + defensePoints + " / PV:" + life;
    }
}
