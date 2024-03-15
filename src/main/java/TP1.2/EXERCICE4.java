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
public class EXERCICE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
	        System.out.print("veulliez ntrez le premier nombre entier : ");
	        int n = scanner.nextInt();
	        System.out.print("veulliez e'ntrez le deuxième nombre entier : ");
	        int m = scanner.nextInt();
	        boolean Amis = NbAmis(n, m);
	        if (Amis) {
	            System.out.println(n + " et " + m + " sont des nombres d'amis.");
	        } else {
	            System.out.println(n + " et " + m + " ne sont pas des nombres d'amis.");
	        }
	    }
	    public static boolean NbAmis(int n, int m) {
	        return sumDiviseurs(n) == m && sumDiviseurs(m) == n;
	    }
	    public static int sumDiviseurs(int nombre) {
	        int sum = 0;
	        for (int diviseur = 2; diviseur <= nombre / 2; diviseur++) {
	            if (nombre % diviseur == 0) {
	                sum += diviseur;
	            }
	        }
	        return sum;
	    }
	}// TODO code application logic here
    
