
package OrdenarPacientes;


public class Paciente implements Comparable <Paciente>{
    
    int id;
    String nombre;
    int edad;
    static int cont = 0;
    
    Paciente( String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        id = cont++;
    }
    
    @Override
    public int compareTo(Paciente p) {
        return ( edad - p.edad);
    }

    @Override
    public String toString() {
        return " \n Paciente {" + "id = " + id + ", Nombre = " + nombre + ", edad = " + edad + '}';
    }
    
    

    
    
    
    
    
}
