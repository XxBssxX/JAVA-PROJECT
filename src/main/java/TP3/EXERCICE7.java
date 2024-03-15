/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP3;
import java.util.Scanner;
/**
 *
 * @author BASSAM
 */
public class EXERCICE7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Création du tableau
        int[] tableau = new int[taille];


        System.out.println("Remplissez le tableau : ");
        int somme = 0;
        for (int i = 0; i < taille; i++) {
            tableau[i] = scanner.nextInt();
            somme += tableau[i];
        }


        double moyenne = (double) somme / taille;


        System.out.println("La somme des éléments est : " + somme);
        System.out.println("La moyenne des éléments est : " + moyenne);

        int[] T2 = new int[taille];
        for (int i = 0; i < taille; i++) {
            T2[i] = tableau[i];
        }
        System.out.println("Le deuxième tableau T2 est : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(T2[i] + " ");
        }

        scanner.close();
    }
}
   
