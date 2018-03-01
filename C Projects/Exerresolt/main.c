/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: monyert
 *
 * Created on 13 de diciembre de 2017, 17:47
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*
 * 
 */
int main(int argc, char** argv) {
  char frase[256];
  
    printf("Disme una frase: ");
    gets(frase);
    
  char vector[256];  
  int index_f=0, index_vect=0;
  
  while(frase[index_f] != '\0'){
      if(frase[index_f] != ' '){
          vector[index_vect] = frase[index_f];
          index_vect++;
      }
      else{
          vector[index_vect] = '\0';
          printf("La paraula es: %s i medira: %d\n",vector,strlen(vector));
          index_vect = 0;
      }
      index_f++;
  }
    //ultima paraula
  vector[index_vect] = '\0';
  printf("La paraula es: %s i medira: %d\n",vector,strlen(vector));
}

