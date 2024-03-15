/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supercomparator;

/**
 *
 * @author Medac
 */
public class Supermercado {

    // atributos
    
    String nombre;
    Producto[] listadeproductos;
    
    // constructor 
    
    public Supermercado (String nombre, Producto[] listadeproductos) {
        this.nombre = nombre;
        this.listadeproductos = listadeproductos;
    }
    
    // métodos

    public String getNombre() {
        return nombre;
    }

    public Producto[] getListadeproductos() {
        return listadeproductos;
    }
    
    

}
