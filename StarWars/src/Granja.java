
import java.util.Scanner;
import java.util.Arrays;

public class Granja {

    
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    

    Perro p1 = new Perro();
    Gato g1 = new Gato();
    
    
    /*  polimorfismo clases en una array */
    
    Animal [] array ={ p1 , g1 };
    
    p1.comer();
    p1.dormir();
    
    g1.comer();
    g1.dormir();
    
    
        
    }
    
}
