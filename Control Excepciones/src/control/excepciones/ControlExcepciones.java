
package control.excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ControlExcepciones {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        /*
        
        int b = 0;
        int a = 5;
        
        try{
        System.out.println(a/b);
            System.out.println("entrando por e final del try");
    }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
        System.out.println("saliendo del programa");
        */
        
        /*
        int num;
        int[]array={2,3,7};

        System.out.println("Introduce un numero");
        
        
        try{
            num = sc.nextInt();
            System.out.println(array[num]/num);
            System.out.println("Final del try");
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
            
        }
        
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Error de tamaño");
        }
        
        
        catch(InputMismatchException e3){
            System.out.println("Otros errores");
        }
        
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.toString());
        }
        */
        
        int num;
        
        int[] array = {2,3,7};
        
        System.out.println("Introduce un numero");
        
        try{
            division(array);
        }
        catch (ArithmeticException e){
            System.out.println("Por dividir");
        }
        
        
        
        
        /*
        
        int edad;
        
        if(edad<18){
        throw new EdadException();
        }
        */
            
}
    
    
    public static void division(int[]array) throws ArithmeticException{
        
        Scanner sc = new Scanner(System.in);
        
        //try{
        int num = sc.nextInt();        
        System.out.println(array[num]/num);
            System.out.println("final del try");
    //}
       /* catch (ArithmeticException ex){
            System.out.println("eror por tri");
        }*/
       
        
    }
}
