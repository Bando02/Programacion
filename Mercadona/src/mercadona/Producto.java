/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadona;

public class Producto {
    
    // Atributo
    
    protected String nombre;
    protected double precio;
    
    // Constructor
    Producto(String nombre){
        this.nombre = nombre;
    }
    
    Producto(String nombre , double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    // metodo

    @Override
    public String toString() {
        return " Producto "+ nombre + ", precio=" + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
    
    
    
    
}
