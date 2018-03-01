// A la matriu temperatures anem a guardar 4 temperatures per a cada dia del mes.
// Les temperatures s'han mesurat a les 0, 6, 12 i 18 hores de cada dia.

// INCLUSIO DE LLIBRERIES
#include <stdio.h>
#include <stdlib.h>  // Per a la funcio system()

// DEFINICIO DE CONSTANS
#define DIES 3
#define FRANGES 4

int temperatures(){

// DECLARACIO DE VARIABLES
int i, j, temperatures[DIES+1][FRANGES];  // Un lloc més per als dies per a no usar el dia 0
int dia, hora, franja, opcio;
float total = 0, mitjana;
system("clear");
// RECORREM LA MATRIU PER A INICIALITZAR-LA A 0
for (i=1; i<=DIES; i++) {
    for (j=0; j<FRANGES; j++)     {
        temperatures[i][j]=0;
    }
}
printf("Array net\n");

// RECORREM LA MATRIU PER A MOSTRAR QUE ESTA INICIALITZADA
for (i=1; i<=DIES; i++) {
    for (j=0; j<FRANGES; j++)     {
        printf("%d ", temperatures[i][j]);
    }
    printf("\n");
}

// INTRODUCCIO DE DADES:
while (1)
{
      // DEMANEM UN DIA CORRECTE (ENTRE 0 I 30)
      do
      {
         printf("Dona'm el dia entre 1 i %i (0 per a acabar): ", DIES);
         scanf("%d", &dia);
         setbuf(stdin,0);
      } while ((dia <0) || (dia > DIES));
      

      // SI HEM POSAT EL DIA 0, ACABEM:
      if (dia ==0) {
       		break;
      }

      // DEMANEM LES TEMPERATURES DEL DIA ESCOLLIT:
      for (j=0; j<FRANGES; j++) {
          printf("Dona'm la temperatura de les %2d:", j*6);
          scanf("%d", &temperatures[dia][j]);
          setbuf(stdin,0);
      }
}

// QUAN JA NO VOLEM INTRODUIR MeS DADES (HEM POSAT DIA 0)
// PROCEDIM A MOSTRAR LES TEMPERATURES QUE HEM POSAT:

for (i=1; i<=DIES; i++) {
    for (j=0; j<FRANGES; j++) {
        printf("%d ", temperatures[i][j]);
    }
    printf("\n");
}

// MENU DE COSES A FER SOBRE LES DADES POSADES:
do {
      // MOSTREM MENU I DEMANEM UNA OPCIO CORRECTA
      do {
          system("clear");
          printf("***********************************\n");
          printf("1.-Mostrar temp.mitjana d'un dia\n");
          printf("2.-Mostrar temp.mitjana d'una hora\n");
          printf("3.-Mostrar temp.mitjana del mes\n");
          printf("0.-Eixir\n");
          printf("***********************************\n");
          printf("Tria opcio: "); scanf("%d", &opcio);
          setbuf(stdin,0);
      } while ((opcio<0) || (opcio>3));
          
      // EXECUTEM L'OPCIO ESCOLLIDA
      switch (opcio)
      {
             case 1:	// MITJANA DE LES TEMPERATURES D'UN DIA
                  do {
                      printf("De quin dia vols calcular la mitjana:");
                      scanf("%d", &dia);
                      setbuf(stdin,0);
                      } while ((dia<=0) || (dia>DIES));
                  total = 0;
                  for (j=0; j<FRANGES; j++)
                      total = total + temperatures[dia][j];
                  mitjana = total / FRANGES;
                  printf("La mitjana del dia %d es %5.2f\n", dia, mitjana);
                //  system("sleep 2");
                  break;
                
             case 2:	// MITJANA DE LES TEMPERATURES D'UNA HORA
                  do {
                      printf("De quina franja vols calcular la mitjana (0 a 3):");
                      scanf("%d", &franja);
                      setbuf(stdin,0);
                      } while ((franja<0) || (franja>3));
                  total = 0;
                  for (i=1; i<=DIES; i++)
                      total = total + temperatures[i][franja];
                  mitjana = total / DIES;
                  printf("La mitjana de la franja %d es %5.2f\n", franja, mitjana); 
                //  system("sleep 2");
                  break;
                  
             case 3:	// MITJANA DE TOT EL MES
                  total = 0;
                  for (i=1; i<=DIES; i++)
                      for (j=0; j<FRANGES; j++)
                          total += temperatures[i][j];
                  mitjana = total / (DIES * FRANGES);
                  printf("La mitjana del mes es %5.2f\n", mitjana);
                //  system("sleep 2");
                  break;
                  
             case 0:	// EIXIR
                  printf("Adeu!");	
                  break;

             default: 
                 printf("Opció incorrecta");

      }  // FINAL DEL SWITCH

    } while (opcio != 0);       // FINAL DEL BUCLE QUE REPETIX EL MENU

} // FINAL DEL PROGRAMA             
