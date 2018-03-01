/*                      Palindrom o no
 * File:   main.c
 * Author: monyert
 * Created on 15 de diciembre de 2017, 19:10
 */
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 *  ¡¡¡¡Es recomana obrir el programa amb la terminal externa!!!!!
 */
#define TAM 51

int main() {
    int largo, index,index2=0;  // PER A INVERTIR
    char frase[TAM];
    
    printf("Disme una frase sense utilitzar accents: ");
    scanf("%[^\n]s",frase);
   // puts(frase);       //Per a comprovar
    
    largo=strlen(frase);
    // Pasem a llevar el espais
    while (frase[index2] != '\0'){
        if (frase[index2] == ' '){
            for (index = index2; index < largo; index++) 
            {
                frase[index] = frase[index+1];
            }
            largo--;
        }
        index2++;
    }
   // puts(frase);        //Comprovem que ho fa be
    //Sense espais 
        //Menu per a les dues opcions
        int opcio;
        char frase2[TAM];
 do {
   do {
          printf("-----------------------------------------------\n");
          printf("1.-Opcio A (invertir i comparar)\n");
          printf("2.-Opcio B (Comparar desde els extrems)\n");
          printf("3.-Comprovacio visual (mostra les dos cadenes)\n");
          printf("4.-Netejar pantalla\n");
          printf("0.-Eixir\n");
          printf("-----------------------------------------------\n");
          printf("Quina sera la teua opcio?: "); 
          scanf("%d", &opcio);
          printf("\n");
          setbuf(stdin,0);
      } while ((opcio<0) || (opcio>4));
    
      // Invertim la cadena
        index = 0;      //iniciar contador
        index2 = 0;     //iniciar contador
      for (index = strlen(frase)-1, index2 = 0; index >= 0; index--, index2++)
            frase2[index2] = frase[index];
            frase2[index2] = '\0'; 
      // invertida 
    switch (opcio){
        case 1: { 
                 //Comparem les dos cadenes amb strcmp
          int res=strcmp(frase, frase2);
             if (res==0){                   //ojo amb les claus
                 printf("Es palindrom\n");
             }
             else{                          //ojo amb les claus
                 printf("No es palindrom\n");
             }        
            break;  }   //Trenca menu 1
        case 2:{
          int palindro=1;   //boolean verdader
          index=0;
          index2=strlen(frase);
          index2=index2-1;
          while (index < index2){
              if (frase[index++] != frase[index2--])
                  palindro=0;   //boolean fals
          }
            if (palindro)
                printf("Es palindrom\n");
            else
                printf("No es palindrom\n");
            break;  }   //Trenca menu 2
        case 3:{
            printf("Cadena sense espais: %s\n",frase);   
            printf("Cadena invertida:    %s\n",frase2);
            break;  }
        case 4:{
            system("clear");    //Netejar pantalla
            break;  }
        
    }     //tanca switch   
    }while (opcio != 0);    //Eixim del menu
}


