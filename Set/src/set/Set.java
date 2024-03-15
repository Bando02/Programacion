
package set;
import java.util.TreeSet;

public class Set {

    
    public static void main(String[] args) {
    
        
        TreeSet<String> nombres = new TreeSet<>();

        nombres.add("Pepe");
        nombres.add("Yonymelavo");
        nombres.add("BenitoCarmelas");
        nombres.add("AitorTilla");
        System.out.println(nombres); // Los pone en orden alfabético

        TreeSet<Persona> personas = new TreeSet<>();

        personas.add(new Persona("Juan", 18));
        personas.add(new Persona("Clara", 20));
        System.out.println(personas);
    
        
        
        
    }
    
}
