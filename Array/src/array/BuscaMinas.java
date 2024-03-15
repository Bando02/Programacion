
package array;
import java.util.Scanner;
import java.util.Arrays;
public class BuscaMinas {

    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    
    char[][] tablero = new char[3][3];
    char [][] tableroC = new char[3][3];
    
    rellenar(tablero,'x');
    rellenar(tableroC,'x');
    
    mostrar(tableroC);
    
    
    introducirBomba(tablero);
    
    
    //mostrar(tablero);
    
    jugar(tablero,tableroC);
    
    
    
    
    }

    private static void rellenar(char[][] tablero, char letra){
        for(int i = 0;i<tablero.length;i++){
            Arrays.fill(tablero[i],letra);
        }
    }

     public static void mostrar(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");

        }
    }

    private static void introducirBomba(char[][] tablero){
        int posX = (int)(Math.random()*3);
        int posY = (int)(Math.random()*3);
        tablero[posX][posY] = 'B';
        
    }

    private static void jugar(char[][] tablero, char[][] tableroC) {
        Scanner sc=new Scanner (System.in);
        int posX;
        int posY;
        boolean ganas = true;
        int turnos = 3;
        do{
            
            do{
            System.out.println("Introduce el valor de x ");
            posX = sc.nextInt();
            System.out.println("Introduce el valor de y ");
            posY = sc.nextInt();
            
            }
            while((posX >= 0 && posX > 3) || (posY >= 0 && posY > 3));
        if(tablero[posX][posY] == 'B'){
            System.out.println("Has perdido, exploto la bomba"); 
            ganas = false;
            turnos = 0;
        }
        else{
            System.out.println(" Has gastado un turno, continue ");
            turnos = turnos -1;
            tableroC[posX][posY] = ' ';
           mostrar(tableroC);
           //mostrar(tablero);
        }
        }
        while(turnos>0);
        
           
        
        if (ganas){
            System.out.println("Ganaste");   
        }
        else{
            System.out.println("Perdiste ");
        }
             

        
        
        }
            
                 
      
       
    
    

        }        