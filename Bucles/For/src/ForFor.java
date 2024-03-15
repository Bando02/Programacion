import java.util.Scanner;
public class ForFor {
    public static void main(String[] args) {
    Scanner sc = new Scanner ( System.in);
    
    
    /* Explicacion ForFor, rsultado 123
                                    123
                                    123 
    int contador = 0;
    for (int i = 0; i<3 ; i++){
           for(int j = 0;j<2; j++){
               contador++;
               System.out.print(contador);
           }
        System.out.println("3");
        contador = 0;
    }
    
    */
    
    
    /*
    for ( int i = 0 ; i<4; i++){
        for ( int j = 0 ; j<i; j++){
            System.out.println("*");           
        }
        System.out.println("*");
    }
    */
    
    
    for ( int i = 0 ; i<4; i++){
        for ( int j = 3 ; j>i; j--){
            System.out.print("*");           
        }
        System.out.println("*");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
