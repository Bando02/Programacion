
package Inventario;
import java.io.*;
import java.util.Scanner;

public class Inventario {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        File file = new File("inventario.txt");
        FileReader fileReader;
        BufferedReader bufferedReader;
        int cont = 0;
        
        Articulo [] articulos = new Articulo[100];
        
        try{
            String texto = BufferedReader.readLine();
            
            while(texto != null){
                
            }
            
            
            
               
    }
        catch(IOException e){
            System.out.println(" Error en el fichero");
        }
    }
    
}
