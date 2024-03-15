/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel;

/**
 *
 * @author Medac
 */
public class Huesped {
 
    //atributos
    
    private int numNoche;
    private String nombre;
    
    
    
    //constructores
    
    Huesped(String nombre, int numNoche){
        this.nombre = nombre;
        this.numNoche = numNoche;
        
    }
    
    //métodos

    public int getNoche() {
        return numNoche;
    }

    public void setNoche(int noche) {
        this.numNoche = noche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
   
}
