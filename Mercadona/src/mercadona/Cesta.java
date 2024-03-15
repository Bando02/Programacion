/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadona;


public class Cesta {
    
    protected Producto[] producto;
    protected int unidades;
    
    Cesta(Producto[]producto, int unidades){
        this.producto = producto;
        this.unidades = unidades;
        
        
    }

    public Producto[] getProducto() {
        return producto;
    }

    public int getUnidades() {
        return unidades;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Productos Cesta:" + producto + ", unidades=" + unidades;
    }
    
    
    
}
