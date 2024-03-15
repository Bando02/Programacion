
public class Personas {
    
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
    
    
    Personas(String nombre,String apellido,String genero,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }
    Personas(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        
        return "\n Nombre = " + nombre + ",Apellido = " + apellido + ",Genero = " + genero + ",Edad = " + edad + "\n";
        
    }
    
    
    
    
    
}
