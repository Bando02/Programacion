
package constructorcopia;

/**
 *
 * @author Fernando
 */
public class ConstructorCopia {
    
    
    public static void main(String[] args) {
        
        
        Persona p1 = new Persona("Antonio",17);
        Persona p2 = new Persona(p1);
        
        p1.setNombre("Pepe");
        
        System.out.println(p2.getNombre());
        
    }
    
}
