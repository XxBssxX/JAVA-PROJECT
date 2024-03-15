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
            Scanner sc = new Scanner(System.in);
	        System.out.println("veulleiz saisir la valeur de a , b et c sucessivement: ");
	        double a = sc.nextDouble();//a différente de 0
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();
	        double delt = b - 4*a*c;
	        double x1 = (-b-Math.sqrt(delt))/(2*a);
	        double x2 = (-b+Math.sqrt(delt))/(2*a);
	        double x3 = -b/(2*a);//a diFférente de 0
	        if (a==0){
	        System.out.println("le system admet une infinité de solution ");
	        }else if(delt>0){
	        System.out.println("le systeme admet deux solution possible x1,x2 "+x1+ ","+x2);
	        }else if(delt==0) {
	        System.out.println("le systeme admet une seul solution x3 " +x3);
	        }else{
	        System.out.println("le systeme n'a pas de solution ");
	        }
		

	}

}// TODO code application logic here
    
