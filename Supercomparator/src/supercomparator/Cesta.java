/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supercomparator;

/**
 *
 * @author Medac
 */
public class Cesta {
    
    // atributos
    
    Producto producto;
    int unidades;
    
    //constructor
    
    public Cesta (Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
    }
    
    // métodos

    public Producto getProducto() {
        return producto;
    }

    public int getUnidades() {
        return unidades;
    }
    
    
}
