/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner ( System.in);    
        
        System.out.println("Hola Mundo");
       
       float a= 5;
       float b= 2;
       System.out.println(a);
       System.out.println(b);
       
       float division;
       division= a / b; 
               System.out.println("La division total es:" + division);
     
       
 // Calculo temperatura Faren A Cels
 
    float divi = 9/5f;
    float d = 32;       
    float Celsius = 40;
        float F = Celsius * divi + d;
    
            System.out.println("La formula total es = " + F);
    
    
            System.out.println(" Letras alfanumericas ");
    
    char letra11 = 'a';
    char letra22 = 'b';
        System.out.println(letra11 + letra22);
    String Nombre = "Carlos";
    System.out.println("La letra es: " + letra11);
        System.out.println("La palabra es: " + Nombre);
        
        
        //Datos booleanos 
       System.out.println("   Datos Boleanos   ");
    boolean respuesta = true;
            System.out.println(respuesta);
         
               
            
    boolean boleano1 = true;
    boolean boleano2 = false;
    boolean resultado;
    resultado = boleano1 && boleano2;
    System.out.println("and   "+resultado);
    resultado = boleano1 || boleano2;
    System.out.println("or   "+resultado);
    System.out.println("not   "+!boleano1);
   
                
    //Operaciones relacionales
    
    int num1 = 8;
    int num2 = 8;
    System.out.println(" ¿Es igual el numero 1 y numero 2 ? Es "+ (num1 == num2));
    
    char letra1 = 'a';
    char letra2 = 'a';
        System.out.println("¿Es igual Letra 1 y Letra 2 ?  Es " +( letra1 == letra2 ));
        
   
        System.out.println(Math.sqrt(25));
        
    
    /* Casting
     Se añade int para hacer un casting y asi bajar el valor de double*/
    double num = 8.3;
    int result = (int) num;
        System.out.println(result);
        
     // En este caso al aumentar el int a double se hace solo 
     
     int numCasting = 8;
     double resulCasting = numCasting;
        System.out.println(resulCasting);
             
                
    int dato;
    dato = sc.nextInt();
     
    
   
   
    
    }
  }


