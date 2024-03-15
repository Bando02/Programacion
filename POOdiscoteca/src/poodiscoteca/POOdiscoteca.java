/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poodiscoteca;
import java.util.Scanner;
import java.util.Arrays;
public class POOdiscoteca {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    
        Persona[] arraysPersonas = new Persona[100];
        int i = 0;
        int opcion = 0;
            do{
                System.out.println("Seleccione 1.Crear Personas ,  2.Mostrar Personas 3.Buscar nombre");
                
                opcion = sc.nextInt();
                
                switch(opcion){
                    case 1: // Crear persona //
                        System.out.println("Introduce el nombre");
                        String nombre = sc.next();
                        System.out.println("Introduce el DNI");
                        String dni = sc.next();
                        Persona persona = new Persona(nombre, dni);
                        i++;
                        break;
                        
                    case 2: // Mostrar Personas 
                        for(int a = 0; a < i; a++){
                            System.out.println(arraysPersonas[a]);
                        }
                        break;
                        
                    case 3: // Buscar por dni  
                        System.out.println("Introduce el DNI ");
                            String dci = sc.next();
                        for ( int a = 0 ; a < i ; a++){
                            if(dci.equals(arraysPersonas[a].getDni())){
                                System.out.println("La persona con dni " +dci +" es "+arraysPersonas[a]);
                            }
                        }
                        break;
                      
                    case 4: // Buscar por nombre 
                        System.out.println("Introduce el nombre ");
                            String name = sc.next();
                        for ( int a = 0 ; a < i ; a++){
                            if(name.equals(arraysPersonas[a].getNombre())){
                                System.out.println("La persona con nombre " +name +" tiene el dni  "+arraysPersonas[a]);
                            }
                        }
                        break;
                    
                }
            } while( opcion != 5);
         
        
    
    
    
    
    
    
    
    
    }
    
}
