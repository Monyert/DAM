    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: monyert
 *
 * Created on 19 de noviembre de 2017, 1:10
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
/*
 * 
 */
int main(int argc, char** argv) {
    int valor2,area;
    int i;
        printf("Costat1\t Costat2   Àrea \n");
    for (i = 10; i <= 30; i++) {
        valor2=100 - 2*i;
        area=i*valor2;
        
        printf("%d  \t      %d    %d \n", i,valor2,area);
    }

    
}

