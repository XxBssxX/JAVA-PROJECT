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
public class EXERCICE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de X : ");
        int x = scanner.nextInt();

        System.out.print("Entrez la valeur de N : ");
        int n = scanner.nextInt();

        int resultat = (int) Math.pow(x, n);
        System.out.println(x + "^" + n + " = " + resultat);
    }
}// TODO code application logic here
    
