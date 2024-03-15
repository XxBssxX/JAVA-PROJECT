/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP1;
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
        Scanner sc = new Scanner(System.in);
	    System.out.print("Entrez l'heure : ");
	    int heure = sc.nextInt();
	    System.out.print("Entrez les minutes : ");
	    int minutes = sc.nextInt();
	    int nouvelleHeure = (heure + (minutes + 1) / 60) % 24;
	    int nouvellesMinutes = (minutes + 1) % 60;
	    System.out.println("Dans une minute, il sera " + nouvelleHeure + " heure(s) " + nouvellesMinutes + ".");
	}

}
    
