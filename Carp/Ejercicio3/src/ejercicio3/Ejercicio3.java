/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       
       //Introduce los segundos: 300, La hora completa es:
       
       int loquepongo;
       int segundos;
       int minutos;
       int horas;
            
        System.out.println("Introduce los segundos");
         loquepongo = sc.nextInt();
            horas = (loquepongo/3600);
        System.out.println("El número de horas es " + (horas));
            minutos = (loquepongo%3600)/60;
        System.out.println("El número de minutos es " + (minutos));
            segundos = (loquepongo%3600) - (minutos*60);
        System.out.println("Los segundos son " + segundos);
        
        
        
        
        
        
    }
    
}
