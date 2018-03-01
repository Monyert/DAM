/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author monyert
 */
import java.util.Scanner;

public class C_Fibonacci {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int num, fib1, fib2, i;
        do {
            System.out.print("Introdueix numero major que 1: ");
            num = sc.nextInt();
        } while (num <= 1);
        System.out.println("Els " + num + " primers termes de la sèrie de Fibonacci son:");
        fib1 = 1;
        fib2 = 1;
        System.out.print(fib1 + " ");
        for (i = 2; i <= num; i++) {
            System.out.print(fib2 + " ");
            fib2 = fib1 + fib2;
            fib1 = fib2 - fib1;
        }
        System.out.println();
    }
}
