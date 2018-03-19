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
public class Human extends Player{
    
    public Human(String name, int p_atack, int p_def, int p_v) {
        super(name, p_atack, p_def, p_v);
        System.out.println("He creat un Human");
    }
    
}
