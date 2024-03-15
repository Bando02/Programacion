import java.util.Scanner;
public class NumerosSuficienteInsuficiente {
public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
   /*    
 double num;
    System.out.println("Introduce un numero del 1 al 10 ");
    num = sc.nextDouble();
    if (num > 10 || num<0){
        System.out.println("Aprende a leer, num del 1 al 10 ");
    }
    else{
        if (num<5){
        System.out.println("Insuficiete");
                }
        else{
        System.out.println("Aprobado");
    }

      }
*/
   
   
   
   int nota;
   nota = sc.nextInt();
   switch( nota ){
        case 0:
           System.out.println("cero");
           break;
        case 1:
            System.out.println("uno");
            break;
        case 2:
            System.out.println("dos");
            break;
        default:
            System.out.println("no es lo mismo");
            break;
   }


    
}
}
