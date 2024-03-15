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
public class EXERCICE8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
			System.out.print("Entrez le premier entier : ");
	        int a = sc.nextInt();
	        System.out.print("Entrez le deuxième entier : ");
	        int b = sc.nextInt();
	        while (b != 0) {
	            int temp = b;
	            b = a%b;
	            a =temp;
	        }
	        
	        System.out.println("Le pgcd est: "+a);


		}

	}
