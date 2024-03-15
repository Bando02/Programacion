/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrdenarPacientes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class ListaPacientes {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lista de Pacientes
        
        ArrayList<Paciente> pacientes = new ArrayList<>();
        int salir = 1;
        do{
            System.out.println("1. Añadir  2.Listas  3. Salir ");
            int rep = sc.nextInt();
            switch(rep){
                
                case 1:
                    System.out.println("Añade un paciente ");
                    pacientes.add(new Paciente(sc.next(),sc.nextInt()));
                    break;
                   
                case 2:
                    
                    Collections.sort(pacientes);
                    System.out.println(pacientes.toString());
                    
                    break;
                case 3:
                    System.out.println(" Gracias por utlizar el Listado de Pacientes \n  --> Hasta luego \n saliendo del programa");
                    salir = 2;
                    break;
                case 4:
                    try{
                        throw new CaseException("Error al escoger caso");                              
                    }
                    catch(CaseException e){
                        System.out.println("Error al escoger caso");
                    }
            }
        }while(salir != 2);
        
        
        
    }
    
}
