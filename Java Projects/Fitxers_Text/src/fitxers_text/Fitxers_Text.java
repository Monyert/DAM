/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxers_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.Arrays;


/**
 *
 * @author Monyert
 */
public class Fitxers_Text {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Utilitats.muestraMensajeG("Benvinguts al corrector d'Examens, \n"
                    + "les dades han de ser introduides com a rutes absolutes.");
        int menu = 0;
        do {
            System.out.println("");
            System.out.println("1. Mostrar Directori i Arxius");
            System.out.println("2. Llegir fitxer Alumne");
            System.out.println("3. LLegir fitxer Plantilla");
            System.out.println("4. Corregir Exam: ");
            System.out.println("5. Corregir Tots els fitxers");
            System.out.println("6. Eixir del programa");
            menu = Utilitats.leerEnteroC("Opcio Menu: ");

            switch (menu) {
                case 1: {
                    llistarDirectori(Utilitats.leerTextoG("Disme la ruta del directori: "));
                }
                break;
                case 2: {
                    try {
                        llegirfitxerAlumne();
                    } catch (IOException ex) {
                        Utilitats.muestraMensajeG("Error, Directori/Arxiu no valid.");
                    }catch (NullPointerException ex2){
                        
                    }
                }
                break;
                case 3: {
                    try {
                        llegirfitxerRespostes();
                    } catch (IOException ex) {
                        Utilitats.muestraMensajeG("Error, Directori/Arxiu no valid.");
                    }catch (NullPointerException ex2){
                        
                    }
                }
                break;
                case 4: {
                    try {
                        corregirun();
                    } catch (IOException ex) {
                        Utilitats.muestraMensajeG("Error, Directori/Arxiu no valid.");
                    }catch (NullPointerException ex2){
                        
                    }
                }
                break;
                case 5: {
                    try {
                        //corregirtots
                        corregirtots(Utilitats.leerTextoG("Disme la ruta del directori: "));
                    } catch (IOException ex) {
                        Utilitats.muestraMensajeG("Error, Directori/Arxiu no valid.");
                    }catch (NullPointerException ex2){
                        
                    }
                }break;
                case 6: {
                    System.exit(0);
                }break;
            }
        } while (menu > 0 && menu < 7);

    }

    public static void llistarDirectori(String ruta) {

        File d = new File(ruta);
        System.out.println("És un directori: " + d.isDirectory());
        String[] elsFitxers = d.list();
        System.out.println("Llistat de Fitxers de: " + d.getAbsolutePath());
        if (d.isDirectory() == true) {
            for (String f : elsFitxers) {
                System.out.println("\t" + f);
            }
            System.out.println("");
        } else {
            System.out.println("No es un directori.");
            System.out.println("");
        }
    }

    public static void llegirfitxerRespostes() throws IOException {
        File f = new File(Utilitats.leerTextoG("Disme la ruta del ficher Respostes: "));
        FileReader fr = null;
        try {
            fr = new FileReader(f);

        } catch (FileNotFoundException ex) {
            Utilitats.muestraMensajeG("Error, Directori/Arxiu no valid.");
        }
        
        int c;
        System.out.println("Respostes de l'examen:");
        while ((c = fr.read()) != -1) {
            System.out.print((char) c + ",");
        }
        System.out.print("\b");
        System.out.println("\n");
        fr.close();
    }

    public static void llegirfitxerAlumne() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader(Utilitats.leerTextoG("Disme la ruta del ficher Alumne: "));
        } catch (FileNotFoundException ex) {
            Utilitats.muestraMensajeG("Error, Directori/Arxiu no valid.");
        }
        BufferedReader br = new BufferedReader(fr);
        String s = "";
        while (br.ready()) {
            s = br.readLine();
            System.out.println(s);
        }

        br.close();
        fr.close();
    }

    public static void corregirun() throws IOException {

        File f = new File(Utilitats.leerTextoG("Disme la ruta del corrector: "));
        File f2 = new File(Utilitats.leerTextoG("Disme la ruta del Alumne: "));

        FileReader fr = new FileReader(f);
        FileReader fr2 = new FileReader(f2);

        int lletra;
        int lletra2;
        int E = 0, B = 0, F = 0;
        System.out.println("*** Comprovacio Visual ***");
        while ((lletra = fr.read()) != -1) {
            while ((lletra2 = fr2.read()) != -1) {

                System.out.println("");
                if ((char) lletra == (char) lletra2) {
                    E++;
                } else if ((char) lletra2 == '-') {
                    B++;
                } else {
                    F++;
                }

                System.out.print((char) lletra + " " + (char) lletra2);
                break;
            }
        }
        double nota;
        nota = (E * 0.5) - (F * 0.25);
        System.out.println("");
        System.out.println("Notes de " + f2.getName() + "\b\b\b\b. La nota és de: " + nota + ". E,B,F --> [" + E + "," + B + "," + F + "]");
        System.out.println("");
        fr.close();
        fr2.close();
    }

    public static void corregirtots(String ruta) throws IOException {
        
        File d = new File(ruta);
        
        System.out.println("És un directori: " + d.isDirectory());
        String[] elsFitxers = d.list();
        Arrays.sort(elsFitxers);
        System.out.println("Llistat de Fitxers de: " + d.getAbsolutePath());

        if (d.isDirectory() == true) {
            for (String f : elsFitxers) {
                System.out.println("\t" + f);
            }
            System.out.println("");
        } else {
            System.out.println("No es un directori.");
            System.out.println("");
            System.exit(0);

        }

        File f = new File(Utilitats.leerTextoG("Disme quin de tots es el corrector: "));

        File f2;
        FileReader fr2 = null;
        if (d.isDirectory() == true) {
            for (String s : elsFitxers) {
                f2 = new File(d.getAbsolutePath() + FileSystems.getDefault().getSeparator() + s);
                if (s.equals("respostes.tex")) {
                    continue;
                }
                fr2 = new FileReader(f2);
                FileReader fr = new FileReader(f);
                int lletra;
                int lletra2;
                int E = 0, B = 0, F = 0;
                while ((lletra = fr.read()) != -1) {
                    while ((lletra2 = fr2.read()) != -1) {

                        if ((char) lletra == (char) lletra2) {
                            E++;
                        } else if ((char) lletra2 == '-') {
                            B++;
                        } else {
                            F++;
                        }

                        // System.out.print((char) lletra + " " + (char) lletra2);
                        lletra = 0;
                        lletra2 = 0;
                        break;
                    }
                }
                double nota;
                nota = (E * 0.5) - (F * 0.25);
                System.out.println("Notes de " + f2.getName() + "\b\b\b\b. La nota és de: " + nota + ". E,B,F --> [" + E + "," + B + "," + F + "]");

                fr.close();
            }
            System.out.println("");

            fr2.close();

        } else {
            System.out.println("No es un directori.");
            System.out.println("");
        }

    }

}
