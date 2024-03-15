/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cluedo;


public class Persona {
    
    // atributos
    
    
    private String nombre;
    private String lugar;

   
    boolean asesino = false;
    
    // constructores
    
    
    Persona(String nombre, String lugar){
        this.nombre = nombre;
        this.lugar = lugar;
    }
    
    
    // métodos 
    
    

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isAsesino() {
        return asesino;
    }

    public void setAsesino(boolean asesino) {
        this.asesino = asesino;
    }
    
    
    }
