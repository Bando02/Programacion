
package practicafantasi;

public class Jugadores {
    
    
    // atributos
    
    private String nombre;
    private String posicion;
    private Double precio;
    
    // constructor
    
    Jugadores(String nombre,String posicion, double precio){
        
        this.nombre = nombre;
        this.posicion = posicion;
        this.precio = precio;
        
        
    // metodos 

    
    
    }

    @Override
    public String toString() {
        return "Nombre " +nombre +" Posicion: " +posicion +" Precio " +precio   ;
    }
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public void valor(double precio){
        
    }
}
