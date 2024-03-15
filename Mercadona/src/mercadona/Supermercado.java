/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadona;


public class Supermercado {
    
    // atributo
    
    protected String nombre;
    protected Producto[] lista;
   
    
    
    
    // constructor
    
    Supermercado(String nombre ,Producto[] lista){
        
        this.nombre = nombre;
        this.lista = lista;
        
        
        
        
    }
    
    // metodo

    @Override
    public String toString() {
        return " Supermercado " + nombre + ", lista=" + lista;
    }
    
    
    
    
}
