/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author monyert
 */
package suma100;
public class Suma100 {
 public static void main(String[] args) {
 int i, sum;
 sum=0;
 for(i=1;i<=100;i++){
 sum += i;
 }
 System.out.print("La suma de 100 nombres: "+sum);
 }
}
