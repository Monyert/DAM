/*
 * Manual Escacs
 */

/* 
 * File:   main.c
 * Author: monyert
 *
 * Created on 28 de diciembre de 2017, 23:30
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
                    
                        //¡¡Terminal externa recomanada!!

#define FIL 8   //esquerra - dreta ; detra - esquerra
#define COL 8   //dalt - baix ; baix - dalt
int main() {
    int opcio;
    int matriu [FIL][COL];
    int fil, col;
    int y,x;
    // Menu per a triar la pesa
 do{  
    
      do {
         // system("clear");    Activar nomes sense el bucle
          printf("Manual joc escacs.\n");
          printf("*************\n");
          printf("* 1.-Rei    *\n");
          printf("* 2.-Cavall *\n");
          printf("* 3.-Torre  *\n");
          printf("* 4.-Alfil  *\n");
          printf("* 5.-Reina  *\n");
          printf("* 0.-Eixir  *\n");
          printf("*************\n");
          printf("Quina peça vols aprendre? (introduix el numero): "); 
          scanf("%d", &opcio);
          printf("\n");
          setbuf(stdin,0);
       } while ((opcio < 0) || (opcio > 5));
   
       if (opcio==0){   //Si el usuari vol eixir trenquem per a que no tinga 
           break;       //que introduir mes dades.
       }
    // Iniciar matriu a 0
        for (fil=0; fil<=FIL-1; fil++) {
            for (col=0; col<=COL-1; col++)     {
                matriu[fil][col]=0;
            }
        }
    
       printf("Disme la ubicacio de la peça.\n");
         //Ubiquem la peça al tauler
       do{
            printf("Disme la fila entre 1 i %d:", FIL);
            scanf("%d", &x);
            setbuf(stdin,0);
        } while ((x < 1) || (x > FIL));
       
       do{
            printf("Disme la columna entre 1 i %d:",COL);
            scanf("%d", &y);
            setbuf(stdin,0);
        }while ((y < 1) || (y > COL));

    // Comprovem el contingut de la matriu segons la opcio
        
    switch (opcio){
        case 1:{
            printf("Posibles moviments amb el REI donat la ubicacio.\n");
            for (fil=0; fil<=FIL-1; fil++) {
                for (col=0; col<=COL-1; col++){
                  if ((x-1 == fil) && (y-1 == col))
                    printf("O ");
                    else
                        if ((x-1 == fil+1) && (y-1 == col-1))
                            printf("X ");
                    else
                        if ((x-1 == fil) && (y-1 == col-1))
                            printf("X ");
                    else
                        if ((x-1 == fil) && (y-1 == col+1))
                            printf("X ");
                    else
                        if ((x-1 == fil-1) && (y-1 == col))
                            printf("X ");
                    else
                        if ((x-1 == fil+1) && (y-1 == col))
                            printf("X ");
                    else
                        if ((x-1 == fil-1) && (y-1 == col-1))
                            printf("X ");
                    else
                        if ((x-1 == fil+1) && (y-1 == col+1))
                            printf("X ");
                    else
                        if ((x-1 == fil-1) && (y-1 == col+1))
                            printf("X ");
                    else
                       printf("- ");
                }
            printf("\n");
            }
            printf("\n");
        }break;
        case 2:{
            printf("Posibles moviments amb el CAVALL donat la ubicacio.\n");
            for (fil=0; fil<=FIL-1; fil++) {
                for (col=0; col<=COL-1; col++){
                  if (x-1 == fil && y-1 == col)
                    printf("O ");
                  else
                    if (x-1 == fil+2 && y-1 == col+1)
                        printf("X ");
                  else
                    if (x-1 == fil+1 && y-1 == col+2)
                        printf("X ");
                  else
                    if (x-1 == fil-1 && y-1 == col+2)
                        printf("X ");
                    else
                    if (x-1 == fil+2 && y-1 == col-1)
                        printf("X ");
                    else
                    if (x-1 == fil-2 && y-1 == col+1)
                        printf("X ");
                    else
                    if (x-1 == fil-2 && y-1 == col-1)
                        printf("X ");
                    else
                    if (x-1 == fil-1 && y-1 == col-2)
                        printf("X ");
                    else
                    if (x-1 == fil+1 && y-1 == col-2)
                        printf("X ");
                  else
                    printf("- ");
                }
            printf("\n");
            }
            printf("\n");
        }break;
        case 3:{
            printf("Posibles moviments amb la TORRE donat la ubicacio.\n");
           for (fil=0; fil<=FIL-1; fil++) {
                for (col=0; col<=COL-1; col++){
                  if ((x-1 == fil) && (y-1 == col))
                    printf("O ");
                  else
                      if ((x-1 == fil||fil+1) && (y-1 == col))
                      printf("X ");
                  else
                      if ((x-1 == fil) && (y-1 == col-1||col+1))
                          printf("X ");
                      else
                    printf("- ");
                }
            printf("\n");
            }
            printf("\n");
        }break;
        case 4:{
            printf("Posibles moviments amb l'ALFIL donat la ubicacio.\n");
            for (fil=0; fil<=FIL-1; fil++) {
                for (col=0; col<=COL-1; col++){
               // printf("%d ", matriu[fil][col]);
                  if (x-1 == fil && y-1 == col)
                    printf("O ");
                  else          //Moviment1 alfil
                      if ((x-1 == fil-1) && (y-1 == col+1))
                      printf("X ");
                  else
                      if ((x-1 == fil-2) && (y-1 == col+2))
                          printf("X ");
                      else
                      if ((x-1 == fil-3) && (y-1 == col+3))
                      printf("X ");
                  else
                      if ((x-1 == fil-4) && (y-1 == col+4))
                          printf("X ");
                      else
                      if ((x-1 == fil-5) && (y-1 == col+5))
                      printf("X ");
                  else
                      if ((x-1 == fil-6) && (y-1 == col+6))
                          printf("X ");
                      else
                      if ((x-1 == fil-7) && (y-1 == col+7))
                      printf("X ");
                      else      //Moviment 2 alfil
                      if ((x-1 == fil+1) && (y-1 == col+1))
                          printf("X ");
                      else
                      if ((x-1 == fil+2) && (y-1 == col+2))
                          printf("X ");
                      else
                      if ((x-1 == fil+3) && (y-1 == col+3))
                          printf("X ");
                      else
                      if ((x-1 == fil+4) && (y-1 == col+4))
                          printf("X ");
                      else
                      if ((x-1 == fil+5) && (y-1 == col+5))
                          printf("X ");
                      else
                      if ((x-1 == fil+6) && (y-1 == col+6))
                          printf("X ");
                      else
                      if ((x-1 == fil+7) && (y-1 == col+7))
                          printf("X ");
                      else      //Moviment 3 alfil
                      if ((x-1 == fil-1) && (y-1 == col-1))
                          printf("X ");
                      else
                      if ((x-1 == fil-2) && (y-1 == col-2))
                          printf("X ");
                      else
                      if ((x-1 == fil-3) && (y-1 == col-3))
                          printf("X ");
                      else
                      if ((x-1 == fil-4) && (y-1 == col-4))
                          printf("X ");
                      else
                      if ((x-1 == fil-5) && (y-1 == col-5))
                          printf("X ");
                      else
                      if ((x-1 == fil-6) && (y-1 == col-6))
                          printf("X ");
                      else
                      if ((x-1 == fil-7) && (y-1 == col-7))
                          printf("X ");
                      else      //Moviment 4 alfil
                      if ((x-1 == fil+1) && (y-1 == col-1))
                          printf("X ");
                      else
                      if ((x-1 == fil+2) && (y-1 == col-2))
                          printf("X ");
                      else
                      if ((x-1 == fil+3) && (y-1 == col-3))
                          printf("X ");
                      else
                      if ((x-1 == fil+4) && (y-1 == col-4))
                          printf("X ");
                      else
                      if ((x-1 == fil+5) && (y-1 == col-5))
                          printf("X ");
                      else
                      if ((x-1 == fil+6) && (y-1 == col-6))
                          printf("X ");
                      else
                      if ((x-1 == fil+7) && (y-1 == col-7))
                          printf("X ");
                      else
                    printf("- ");
                }
            printf("\n");
            }
            printf("\n");
        }break;
        case 5:{
           printf("Posibles moviments amb la REINA donat la ubicacio.\n");
            for (fil=0; fil<=FIL-1; fil++) {
                for (col=0; col<=COL-1; col++){
                  if (x-1 == fil && y-1 == col)
                    printf("O ");
                  else          //Moviment1 reina
                      if ((x-1 == fil-1) && (y-1 == col+1))
                      printf("X ");
                  else
                      if ((x-1 == fil-2) && (y-1 == col+2))
                          printf("X ");
                      else
                      if ((x-1 == fil-3) && (y-1 == col+3))
                      printf("X ");
                  else
                      if ((x-1 == fil-4) && (y-1 == col+4))
                          printf("X ");
                      else
                      if ((x-1 == fil-5) && (y-1 == col+5))
                      printf("X ");
                  else
                      if ((x-1 == fil-6) && (y-1 == col+6))
                          printf("X ");
                      else
                      if ((x-1 == fil-7) && (y-1 == col+7))
                      printf("X ");
                      else      //Moviment 2 reina
                      if ((x-1 == fil+1) && (y-1 == col+1))
                          printf("X ");
                      else
                      if ((x-1 == fil+2) && (y-1 == col+2))
                          printf("X ");
                      else
                      if ((x-1 == fil+3) && (y-1 == col+3))
                          printf("X ");
                      else
                      if ((x-1 == fil+4) && (y-1 == col+4))
                          printf("X ");
                      else
                      if ((x-1 == fil+5) && (y-1 == col+5))
                          printf("X ");
                      else
                      if ((x-1 == fil+6) && (y-1 == col+6))
                          printf("X ");
                      else
                      if ((x-1 == fil+7) && (y-1 == col+7))
                          printf("X ");
                      else      //Moviment 3 reina
                      if ((x-1 == fil-1) && (y-1 == col-1))
                          printf("X ");
                      else
                      if ((x-1 == fil-2) && (y-1 == col-2))
                          printf("X ");
                      else
                      if ((x-1 == fil-3) && (y-1 == col-3))
                          printf("X ");
                      else
                      if ((x-1 == fil-4) && (y-1 == col-4))
                          printf("X ");
                      else
                      if ((x-1 == fil-5) && (y-1 == col-5))
                          printf("X ");
                      else
                      if ((x-1 == fil-6) && (y-1 == col-6))
                          printf("X ");
                      else
                      if ((x-1 == fil-7) && (y-1 == col-7))
                          printf("X ");
                      else      //Moviment 4 reina
                      if ((x-1 == fil+1) && (y-1 == col-1))
                          printf("X ");
                      else
                      if ((x-1 == fil+2) && (y-1 == col-2))
                          printf("X ");
                      else
                      if ((x-1 == fil+3) && (y-1 == col-3))
                          printf("X ");
                      else
                      if ((x-1 == fil+4) && (y-1 == col-4))
                          printf("X ");
                      else
                      if ((x-1 == fil+5) && (y-1 == col-5))
                          printf("X ");
                      else
                      if ((x-1 == fil+6) && (y-1 == col-6))
                          printf("X ");
                      else
                      if ((x-1 == fil+7) && (y-1 == col-7))
                          printf("X ");
                      else      //Moviments rectes
                      if ((x-1 == fil||fil+1) && (y-1 == col))
                      printf("X ");
                      else
                      if ((x-1 == fil) && (y-1 == col-1||col+1))
                          printf("X ");
                      else
                    printf("- ");
                }
            printf("\n");
            }
            printf("\n");
        }break;
        case 0:{
           break; 
            } 
    }
  }while (opcio != 0);
}
