
package estadistica;

import java.util.Scanner;
public abstract class Persona {
    Scanner sc = new Scanner(System.in);
    
    //atributos
    protected String nombre;
    protected double[]notas;
    boolean suspenso = false;
    
    //constructor
    public Persona(String nombre){
        nombre = this.nombre;
        notas = new double[6];
    }
    //metodos
    
    public void insertarNotas() {
        String []nombre = {"Programación", "LLMM", "BBDD", "FOL", "Entornos", "Sistemas"};
                for (int i= 0; i< notas.length; i++) {
                    System.out.println("Cuál es la nota de" + nombre[i]);
                    notas[i]= sc.nextDouble();
        }
    }
    
    public void esteAprobado() {
        for (int i= 0; i< notas.length; i++) {
            if (notas[i]<5) {
                suspenso = true;
                System.out.println("1 o más asignaturas están suspensas");
            }
    }
    }
    
    @Override
    public String toString() {
        String respuesta = " ";
        for (int i=0; i<notas.length; i++) {
            respuesta = respuesta + notas [i] + "||";
        }
        return nombre + respuesta;
    }
}



        
        
    
        

  

