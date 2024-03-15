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
public class EXERCICE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez un nombre : ");
	        int nombre = scanner.nextInt();
	        boolean Parfait = Nb_Parfait(nombre);
	        if (Parfait) {
	            System.out.println(nombre + " est un nombre parfait.");
	        } else {
	            System.out.println(nombre + " n'est pas un nombre parfait.");
	        }
	    }
	    public static boolean Nb_Parfait(int nombre) {
	        int sumDiviseurs = 0;
	        for (int i = 1; i < nombre; i++) {
	            if (nombre % i == 0) {
	                sumDiviseurs += i;
	            }
	        }
	        return sumDiviseurs == nombre;
	    }
	}
    
