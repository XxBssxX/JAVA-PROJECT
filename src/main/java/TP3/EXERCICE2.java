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
public class EXERCICE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[10];
        System.out.println("Veuillez entrer les 10 éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }
        System.out.println("Le contenu du tableau est :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + (i + 1) + " : " + tableau[i]);
        }
    }
}// TODO code application logic here
    
