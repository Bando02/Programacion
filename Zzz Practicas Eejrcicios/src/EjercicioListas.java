import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class EjercicioListas {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int personas = 5;
        
        List<Personas> humanos = new ArrayList<>();
        
        System.out.println(" <-- SISTEMA DE PERSONAS --> ");
        boolean salir = false;
        do{
            
   
        System.out.println("1. Ingresa personas  2. Muestra personas  3. Modifica datos   4. Salir");
        int opcion = sc.nextInt();
        switch(opcion){
            
            case 1 -> {
                System.out.println("Ingrese el nombre de las personas ");
                System.out.println("Nombre: ");
                String nombre = sc.next();
                System.out.println("Apellido: ");
                String apellido = sc.next();
                System.out.println("Genero: ");
                String genero = sc.next();
                System.out.println("Edad: ");
                int edad = sc.nextInt();
                System.out.println("\n");
                
                Personas personaIngresada = new Personas(nombre,apellido,genero,edad);
                humanos.add(personaIngresada);
                }
        
            case 2 -> {
                System.out.println(humanos.toString());
                }
            case 3 -> {
                System.out.println("Elije a la persona que quieres modificar los datos por el id ");
                System.out.println(humanos.toString());
                }
            case 4 -> salir = true;
                
         
        }
        }
while(salir == false);
        
    }}     
    


        