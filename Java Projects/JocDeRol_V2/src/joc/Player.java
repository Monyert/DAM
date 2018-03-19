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
abstract class Player {
    String name;
    int p_atack, p_def, p_v;

    Player(String name, int p_atack, int p_def, int p_v) {
        this.name = name;
        this.p_atack = p_atack;
        this.p_def = p_def;
        this.p_v = p_v;
    }
    
}
