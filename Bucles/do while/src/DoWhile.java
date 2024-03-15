import java.util.Scanner;
public class DoWhile {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);    
 

    int min_rango;
    int max_rango;
    int num;
    
    System.out.println("Introduce el numero minimo ");
    min_rango = sc.nextInt();
    System.out.println("Introduce el numero maximo ");
    max_rango = sc.nextInt();
    do{
        System.out.println("Introduce un numero para saber si esta en rango");
        num = sc.nextInt();
        if (min_rango < num && max_rango > num){
            System.out.println("El numero esta en el rango ");
        }
        else{
            System.out.println("El numero no esta en el rango");
            
        }
        
    }
 
    while (min_rango > num || max_rango < num);
}
}
 


            
    
    
    
            