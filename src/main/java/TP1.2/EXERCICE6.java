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
public class EXERCICE6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le poids en kg : ");
        double poids = scanner.nextDouble();
        System.out.print("Entrez la taille en mètres : ");
        double taille = scanner.nextDouble();
        System.out.print("Entrez le sexe (F pour femme, H pour homme) : ");
        char sexe = scanner.next().charAt(0);
        double imc = poids / (taille * taille);
        System.out.println("L'IMC est : " + imc);
        String etatPoids = determinerEtatPoids(imc, sexe);
        System.out.println("État de poids : " + etatPoids);
    }
    public static String determinerEtatPoids(double imc, char sexe) {
        if (sexe == 'F') {
            if (imc < 19) {
                return "Maigreur";
            } else if (imc >= 19 && imc <= 24) {
                return "Poids normal";
            } else if (imc >= 24 && imc <= 30) {
                return "Surcharge pondérale";
            } else if (imc >= 30 && imc <= 40) {
                return "Adiposité";
            } else {
                return "Obésité";
            }
        } else if (sexe == 'H') {
            if (imc < 20) {
                return "Maigreur";
            } else if (imc >= 20 && imc <= 25) {
                return "Poids normal";
            } else if (imc >= 25 && imc <= 30) {
                return "Surcharge pondérale";
            } else if (imc >= 30 && imc <= 40) {
                return "Adiposité";
            } else {
                return "Obésité";
            }
        } else {
            return "Sexe non valide";
        }
    }
}// TODO code application logic here
    }
}
