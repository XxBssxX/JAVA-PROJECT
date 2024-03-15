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
public class EXERCICE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            	Scanner sc = new Scanner(System.in);
	    	System.out.println("veulliez svp entrer la valeure demander :");
	        int n=sc.nextInt();
	        int i;
	        int fact = 1;
	        for (i=1;i<=n;i++){
	            fact = fact*i;
	        }
	        System.out.println("le facterielle = "+fact);
	    }
}// TODO code application logic here
    }
}
