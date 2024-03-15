/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP2;
import java.util.Scanner;
/**
 *
 * @author BASSAM
 */
public class EXERCICE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de N : ");
        int n = scanner.nextInt();

        double somme = sommeHarmonique(n);
        System.out.println("La somme des " + n + " premiers termes de la série harmonique est : " + somme);
    }

    public static double sommeHarmonique(int n) {
        double somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += 1.0 / i;
        }
        return somme;
    }
}
    
