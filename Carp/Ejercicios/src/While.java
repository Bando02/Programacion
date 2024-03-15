
import java.util.Scanner;
public class While {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);


    /*
    int a = 3;
    while ( a < 5 ){
        System.out.println("hola");
        a++;
        
    }
    */
    
    /*
    int num;
    System.out.println("Introduce numeros ");
        num = sc.nextInt();
        while ( num!=0 ){
            if (num == 0){
                break;
                        }
            else if (num%2 == 0){
                System.out.println("Es par ");
            }
            else{
                System.out.println("Es impar ");
            }
            num = sc.nextInt();
        }
*/
    
    
    
    
    
    int num;
    double a;
    boolean resp;
    
        System.out.println("Introduce un numero del 1 al 100 para jugar, Para salirte del juego escriba -1 ");
        num = sc.nextInt();
         a =(int)(Math.random()*100);
        while (num > 0 || num < 100){
            if(num == -1){
                System.out.println("Ha salido del juego ");
                break;
            }
            else{
                if(num == a){
                    System.out.println("Has ganado!!");
                    System.out.println("Quieres jugar de nuevo ? True = si False = no ");
                    if (resp = true){
                        resp = sc.nextBoolean(); 
                        System.out.println("Introduce un numero del 1 al 100 para jugar, Para salirte del juego escriba -1 ");
                    }
                    else{
                        break;
                    }
                }
                else if(num < a){
                    System.out.println("Tu numero es menor ");
                }
                else if (num > a){
                    System.out.println("Tu numero es mayor ");
                }
            }
            num = sc.nextInt();
        }
    
    }
    
}
