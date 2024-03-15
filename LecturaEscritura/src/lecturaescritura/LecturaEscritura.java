
package lecturaescritura;
import java.io.*;
import java.util.Scanner;
public class LecturaEscritura {

    
    public static void main(String[] args) {
        
        /*
        
        File file = new File("inspector.txt");
        
        // File file = new File ("C:\Users\Medac\Documents\NetBeansProjects\LecturaEscritura")
        
       
        
        
        
        try{
            if (file.canRead()){
                
        
        FileReader fileReader = new FileReader(file);
        
                for (int i = 0; i < 8; i++) {
                    
                
        int num = fileReader.read();
            char letra = (char)num;
                System.out.print(letra +" ");
            }
        }
        }
        catch(IOException e){
            System.out.println("error al leer el arcivo");
        }
        
        
        */
        
        
        
        /*  Leer lineas de texto
        
        
        File file = new File("texto.txt");
        
        char letra;
        int num;
        String frase = "";
        
        String frase2 = "";
        
        try{
            FileReader filereader = new FileReader(file);
            
            BufferedReader bufferedReader = new BufferedReader(filereader);
            
            frase = bufferedReader.readLine();
            
            
            while(frase != null){
                frase2 = frase2 + frase +'\n';
                frase = bufferedReader.readLine();             
            }
            
            
            System.out.println(frase2);
            
            bufferedReader.close();
            
        }
         catch(IOException e){
             System.out.println("Error");
         }
        
        */
        
        
        
        
        // Escribir en el archivo de texto
        
        
        File file = new File("texto.txt");
        
        
        try{
        FileWriter filewriter = new FileWriter(file,true);
        
        // true añade texto
        // false sobreescribe
        
        BufferedWriter bufferedwriter = new BufferedWriter (filewriter);
        
        bufferedwriter.write("Hola");
        bufferedwriter.newLine();
        bufferedwriter.write("que tal");
        
        bufferedwriter.close();
        
        
        
            
        
        }
        
        
        
        
        
        catch(IOException e){
            System.out.println("Error");
        }
        
        
        
        
        
        
    }
    
    
    
}
