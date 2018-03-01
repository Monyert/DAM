/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitja;

/**
 *
 * @author monyert
 */
import java.io.*;

public class Mitja {

    private static BufferedReader stdin
            = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String input = "";
        int acumulat = 0;
        int numeroLlegit = 0;
        int n = 0;
        float mitja = 0;
        do {
            System.out.print("Dóna'm un número (negatiu per a acabar):");
 try {
                input = stdin.readLine();
            } catch (IOException e) {
                System.out.println("Error!");
            }
            numeroLlegit = Integer.parseInt(input);
            if (numeroLlegit < 0) {
                break;
            }
            acumulat += numeroLlegit;
            n++;
        } while (numeroLlegit >= 0);
        if (n > 0) {
            mitja = (float) acumulat / n;
            System.out.println("\nLa mitja dels números introduïts és: " + mitja);
 }
 }
}
