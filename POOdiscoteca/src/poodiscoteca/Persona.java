
package poodiscoteca;

public class Persona {
    
    // variables 
    
    private String nombre;
    private String dni;
    
    
    
    // constructores 
    
    Persona(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // métodos
    
    @Override
    public String toString() {
        return "Persona {" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
}
