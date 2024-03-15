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
	System.out.println("veuillez donner le rayon du cercle :");
    double r= sc.nextDouble();
    double s = Math.PI * Math.pow(r, 2);
    double p = Math.PI * 2 * r;
    System.out.println("la surface est : "+s);
    System.out.println("la perimetre est : "+p);
}
    }


