
package practica5_valbuena_postigo_pract5;

import java.io.*;
import java.util.Scanner;

public class Paciente {
    
    String [] paciente = new String[100];
    
    protected String nombre;
    protected int id = 1;
    protected String apellido;
    protected int edad;
    
    
    public Paciente(String nombre, String apellido, int edad){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        id++;
        
        
    }
    
    public Paciente(String [] Paciente){
        this.paciente = paciente;
    }
    
    
    // Metodos 
    
    
    
    
    
    
    public void Mostrar_paciente(){
        
        File pacientes = new File("pacientes.txt");
        
        try{
            FileReader filereader_pac = new FileReader(pacientes);
            BufferedReader bufferedreader_pac = new BufferedReader(filereader_pac);
            
            boolean salir = true;
            
            while(salir){
                
                
                String persona = bufferedreader_pac.readLine();
                
                if(persona != null){
                    String [] division = persona.split(":");
                    System.out.println(" ---- Paciente ID "+id +" ----");
                    System.out.print("Nombre: " + division[0]);
                    System.out.print(" || Apellido: "+ division[1]);
                    System.out.print(" || Edad: "+ division[2]+"\n");
                    System.out.println("--------------------------");
                    System.out.println(" ");
                    id++;
                }else{
                    salir = false;
                }
            }
        }
        catch(IOException e){
            System.out.println(" Error al leer archivo");
        }
        
        
       
    
       
    }
    
    
    
    public void Crear_paciente(){
        
        File pacientes = new File("pacientes.txt");
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        
        
        System.out.println("Inserta nombre del paciente");
        String nombre = sc.next();
        System.out.println("Inserta primer apellido del paciente ");
        String apellido = sc.next();
        System.out.println("Inserta edad del paciente");
        String edad = sc.next();
        
        try{
            FileReader filereader_paciente = new FileReader(pacientes);
            BufferedReader buffered_paciente = new BufferedReader(filereader_paciente);
            
            FileWriter filewriter_paciente = new FileWriter(pacientes,true);
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter_paciente);
            
            String nueva_persona = nombre + ":" +apellido +":" +edad;
            
            bufferedwriter.write(nueva_persona +"\n");
            bufferedwriter.close();
            
        }
        catch(IOException e){
            System.out.println(" Error al crear paciente");
        }
        
        
        
        
        
        
        
            
            
        
    }

    public int getId() {

        return id;
    }

    
    
    
    

    
    
    

    
}
