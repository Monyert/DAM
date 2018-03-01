/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: monyert
 *
 * Created on 7 de diciembre de 2017, 17:54
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*
 * 
 */
int main(int argc, char** argv) {

    char s[51];
    //Medir la cadena amb strlen
    printf("Disme una frase:");
    gets(s);
    printf("La cadena %s medix: %zd\n",s,strlen(s));
    printf("Tamany de la cadena en bits: %d\n",sizeof(s));
    
    //Medir la cadena ara sense el strlen
    int l = 0;
    while (s[l] != '\0'){
        l++;
    }
    printf("Segona part del programa\n");
    printf("La cadena %s medix: %d\n",s,l);  
    
    //Copiar la cadena
    char b[51];
     printf("Tercera part del programa\n"); 
     strcpy(b,s);
     printf("La copia de la cadena: %s",b);
    
}

