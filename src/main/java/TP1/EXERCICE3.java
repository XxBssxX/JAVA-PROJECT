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
         Scanner sc = new Scanner(System.in);
	System.out.println("veulliez svp entrer la valeure des deux entier :");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c;
    c = a;
    a = b;
    b = c;
    System.out.println("la valeuur de a est :"+a);
    System.out.println("la valeuur de b est :"+b);
}
}

    
