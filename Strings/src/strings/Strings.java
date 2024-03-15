
package strings;
import java.util.Arrays;
import java.util.Scanner;
public class Strings {
Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        
        
        String Texto4 = "Hola";
        String Texto1 = "hola";
        String Texto2 = "que tal";
        String Texto3 = Texto1 + Texto2;
        
        System.out.println(Texto1);
        System.out.println(Texto2);
        System.out.println(Texto3);
        
        
        System.out.println(Texto1.equals(Texto4));  // compara strings o compara palabras
        System.out.println(Texto3.length());                // dice el tamaño del String//
        System.out.println(Texto1.indexOf('h'));
        System.out.println(Texto3.indexOf('a'));
        System.out.println(Texto2.charAt(2));   // lee la letra de la posicion 2 en este caso
        System.out.println(Texto1.substring(0,2));
        System.out.println(Texto1.toUpperCase());
        
        
        
        
        
        
        
        
    }
    
}
