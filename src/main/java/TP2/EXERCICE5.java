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
public class EXERCICE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		System.out.print("veulliez entrez la valeur de n : ");
        int n = sc.nextInt();
        long factWhile = 1;
        int k = 1; 
        while (k <= n) {
            factWhile *= k;
            k++;
        }
        System.out.println("Factoriel avec while : " + factWhile);
        long factFor = 1;
        for (int j = 1; j <= n; j++) {
            factFor *= j;
        }
        System.out.println("Factoriel avec for : " + factFor);
	}
}
    
