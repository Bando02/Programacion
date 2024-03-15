package cluedo;
import java.util.Scanner;
import java.util.Arrays;
public class Cluedo {

    
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in); 
    
    
    Persona[] Humanos = new Persona[5];
    
    Persona mayordomo = new Persona("Mayordomo","Entrada");
    Persona llaves = new Persona("llaves", "Dormitorio");
    Persona jardinero = new Persona("Jardinero","Jardin");
    Persona cocinero = new Persona("Cocinero", "Cocina");
    Persona propietario = new Persona("Propietario", "Salon");
    Persona esposa = new Persona("esposa_propietario" , "Baño");
    
    Humanos [0] = mayordomo;
    Humanos [1] = llaves;
    Humanos [2] = jardinero;
    Humanos [3] = cocinero;
    Humanos [4] = propietario;
    Humanos [5] = esposa;
        
    
        int posH = (int)(Math.random()*5+1);
        
        
        switch(posH){
            case 0:
                mayordomo.asesino(true);
                break;
            case 1:
                llaves.asesino(true);
                break;
            case 2:
                jardinero.asesino(true);
                break;
            case 3:
                cocinero.asesino(true);
                break;
            case 4:
                propietario.asesino(true);
                break;
            case 5:
                esposa.asesino(true);
                break;
                
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    

    
    
    }
    
}
