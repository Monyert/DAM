/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: monyert
 *
 * Created on 16 de noviembre de 2017, 23:42
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
/*
 * 
 */
int main(int argc, char** argv) {
    double n; 
        printf("Disme un numero: ");
        scanf("%lf",&n);
        setbuf(stdin,0);
     if (n>0){
        double i,f=1;
        for (i=n;i>1; i--)
            f=f*i;
        printf("El factorial de %lf es %lf",n,f);
        }
     if (n<0){
         printf("Els numeros negatius no tenen factorial");
        }
     if (n==0){
         int n;
        printf("El factorial de %d es 1",n);
        }
}

