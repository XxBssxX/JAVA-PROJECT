/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP1;
import java.util.scanner;
/**
 *
 * @author BASSAM
 */
public class EXERCICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	        System.out.print("veuillez entrez un entier positif : ");
	        int nombre = sc.nextInt();
	        if (nombre <= 0) {
	            System.out.println("Veuillez entrer un entier positif :");
	            return;
	        }
	        AffichageDeDiviseurs(nombre);
	    }
	    public static void AffichageDeDiviseurs(int nombre) {
	        int NbDiviseurs = 0;
	        int sumDiviseurs = 0;
	        System.out.println("Les diviseurs de " + nombre + " sont :");
	        for (int i = 1; i <= nombre; i++) {
	            if (nombre % i == 0) {
	                System.out.print(i + " ");
	                NbDiviseurs++;
	                sumDiviseurs += i;
	            }
	        }
	        System.out.println("\nLe nombre de diviseurs est : " + NbDiviseurs);
	        System.out.println("La somme des diviseurs est : " + sumDiviseurs);
	    }
}// TODO code application logic here// TODO code application logic here
    
