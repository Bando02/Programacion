
package FiltradorPalabrotas;
import java.io.*;
import java.util.Scanner;

public class CorreoOriginal {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        // Esto para leer por plabras el txt 
        
        File file = new File("Correo.txt");
        
        
        try{
            if(file.canRead()){
                FileReader filereader = new FileReader(file);
                
                for (int i = 0; i < file.length(); i++) {
                    int num = filereader.read();
                    char letra = (char)num;
                    System.out.print(letra);
                } 
            }
        }
        catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
        
        //
         
        
        
        
        File insultos = new File("DiccionarioPalabrotas");
        
        
      
        
        
        
    
        
        
        
        
    }
    
}
