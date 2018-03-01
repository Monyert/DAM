/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: monyert
 *
 * Created on 19 de noviembre de 2017, 3:15
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int n,i,l;
    char c;
        printf("Escriu un numero: ");
        scanf("%d",&n);
        setbuf(stdin,0);
        printf("Escriu un caracter: ");
        scanf("%c",&c);
        setbuf(stdin,0);
    for (i=1; i<=n ; i++) {
    for (l=1; l<=n ; l++){ 
            printf("%c ",c);
        }
        printf("\n");
    }
}
