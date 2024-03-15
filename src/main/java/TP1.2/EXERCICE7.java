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
public class EXERCICE7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("veulliez svp entrez l'âge de l'habitant : ");
        int age = scanner.nextInt();
        System.out.print("veulliez entrer le sexe de l'habitant (M = masculin, F = féminin) : ");
        char sexe = scanner.next().charAt(0);
        boolean imposable = estImposable(age, sexe);
        if (imposable) {
            System.out.println("L'habitant est imposable");
        } else {
            System.out.println("L'habitant n'est pas imposable");
        }
	}
    public static boolean estImposable(int age, char sexe) {
        if (sexe == 'M') {
            return age > 20;
        } else if (sexe == 'F') {
            return age >= 18 && age <= 35;
        } else {
          return false;
        }
    }
}// TODO code application logic here
    }
}
