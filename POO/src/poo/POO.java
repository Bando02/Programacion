
package poo;

public class POO {

    
    public static void main(String[] args) {
        
        /*
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Julian",18);
        Persona persona5 = new Persona(18);
        */
        Persona persona6 = new Persona("Juan");
        
        
        System.out.println(persona6.dni);
        System.out.println(persona6.edad);
        
            /*
            persona1.nombre = "Juan";
            persona1.edad = 18;
            persona1.dni = "12345678X";
            persona1.email = "juanDAM@gmail.com";
            persona1.saludar();
        
            persona2.nombre = "Antonio";
            persona2.edad = 19;
            persona2.dni = "87654321Y";
            persona2.email = "antonioDAM@gmail.com";
            persona2.comer();
            
            
            persona5.incrementar(5);
            System.out.println(persona5.edad);
            
            persona5.incrementar(2);
            System.out.println(persona5.edad);
            */
            
            persona6.edad = 12;
            
            System.out.println(persona6.mayorEdad());
            
            persona6.edad = 23;
            System.out.println(persona6.mayorEdad());
            
            
    }
    
}
