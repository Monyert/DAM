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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monyert
 */
public class Fitxers_Text {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int menu = 0;
        do {
            System.out.println("1. Mostrar Directori i Arxius");
            System.out.println("2. Llegir fitxer Alumne");
            System.out.println("3. LLegir fitxer Plantilla");
            System.out.println("4. Corregir Exam: ");
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
                        Logger.getLogger(Fitxers_Text.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 3: {
                    try {
                        llegirfitxerRespostes();
                    } catch (IOException ex) {
                        Logger.getLogger(Fitxers_Text.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case 4: {
                try {
                    corregir();
                } catch (IOException ex) {
                    Logger.getLogger(Fitxers_Text.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                break;
            }
        } while (menu > 0 && menu < 5);

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
        FileReader fr = null;
        try {
            fr = new FileReader(Utilitats.leerTextoG("Disme la ruta del ficher Respostes: "));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fitxers_Text.class.getName()).log(Level.SEVERE, null, ex);
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

    public static void llegirfitxerAlumne() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader(Utilitats.leerTextoG("Disme la ruta del ficher Alumne: "));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fitxers_Text.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public static void corregir() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader(Utilitats.leerTextoG("Disme la ruta del ficher Respostes: "));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fitxers_Text.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);
        String s = "";
        while (br.ready()) {
            s = br.readLine();
        }
        br.close();
        fr.close();
        
        FileReader fr2 = null;
        try {
            fr2 = new FileReader(Utilitats.leerTextoG("Disme la ruta del ficher Alumne: "));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fitxers_Text.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br2 = new BufferedReader(fr2);
        String s2 = "";
        while (br2.ready()) {
            s2 = br2.readLine();
        }
        boolean es;
        es = s.equalsIgnoreCase(s2);
        if (es == true){
            Utilitats.muestraMensajeG("Totes les respostes correctes");
        }else{
            Utilitats.muestraMensajeG("Algo tens mal");
        }
        br2.close();
        fr2.close();
        
    }
    
}
