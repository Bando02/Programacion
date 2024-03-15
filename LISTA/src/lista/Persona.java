package lista;

public class Persona implements Comparable <Persona>{

    String nombre;
    int edad;

    Persona() {

    }

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    @Override
    public String toString() {
        return " [ -> Nombre: '" + nombre + "'  Edad: '" + edad + "' ] ";
    }

    @Override
    public int compareTo(Persona p) {
        return (edad - p.edad);
    }

}
