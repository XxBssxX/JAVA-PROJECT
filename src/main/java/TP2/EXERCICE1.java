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
public class EXERCICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le nombre N : ");
            int N = scanner.nextInt();

            int s = 0;
            int p = 1;

            for (int i = 0; i < N; i++) {
                System.out.print("Entrez le nombre " + (i + 1) + " : ");
                int nombre = scanner.nextInt();
                s += nombre;
                p *= nombre;
            }

            double MN = (double) s / N;

            System.out.println("Somme : " + s);
            System.out.println("Produit : " + p);
            System.out.println("Moyenne : " + MN);

            scanner.close();
        }
    }
/* avec boucle while :
 Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        int s = 0;
        int p = 1;
        int i = 0;

        while (i < N) {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            int nombre = scanner.nextInt();
            s += nombre;
            p *= nombre;
            i++;
        }

        double MN = (double) s / N;

        System.out.println("Somme : " + s);
        System.out.println("Produit : " + p);
        System.out.println("Moyenne : " + MN);

        scanner.close();
 */
/* avec do-while
Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        int s = 0;
        int p = 1;
        int i = 0;

        do {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            int nombre = scanner.nextInt();
            s += nombre;
            p *= nombre;
            i++;
        } while (i < N);

        double MN = (double) s / N;

        System.out.println("Somme : " + s);
        System.out.println("Produit : " + p);
        System.out.println("Moyenne : " + MN);

        scanner.close();
 */// TODO code application logic here
    
}
