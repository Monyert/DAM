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
public class Warrior extends Human{
    
    public Warrior(String name, int p_atack, int p_def, int p_v) {
        super(name, p_atack, p_def, p_v);
        System.out.println("Constructor ----> He creat un Warrior");
    }
    
}
