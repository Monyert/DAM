/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxers_text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        // TODO code application logic here
    }

    public static void llegirfitxer() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("proves.txt");
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
}
