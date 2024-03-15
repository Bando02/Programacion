
package array;
import java.util.Scanner;
import java.util.Arrays;
public class Matrices {

    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    
    /*
    int [][] matriz = new int [3][3];
    
    
    for(int filas = 0; filas < matriz.length; filas++){
        
        System.out.println(Arrays.toString(matriz[filas])); //rellenar//
    }
    
    for(int i = 0;i<matriz.length;i++){
        for(int j=0;j<matriz.length;j++){
            matriz[i][j]=3;
        }
    }
    
    
    
    char [][] matrizX = new char [4][4];
    for(char i = 0; i<matrizX.length; i++){
        for(char j = 0; j<matrizX[0].length;j++){
            matrizX[i][j] = 'x';
        }
    }
    */
    
    
    // HUNDIR LA FLOTA  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA //
    
    
    /*  m.length  da filas
        m[0].length  da columnas */
    
   
    //declaramos array tablero
       char[][] tablero=new char[10][10];
            for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero[0].length;j++){
                    tablero[i][j]='A';
                }
    }
 
            mostrar(tablero);
            System.out.println("-----------");
            
            //declaramos arrays de barcos
            
       
            
        introducirBarco(tablero, 5,'B');
        introducirBarco(tablero, 3,'C');
        introducirBarco(tablero, 1,'D');
        mostrar(tablero);
       
        
       

       
       
       
       
       
       
       
       
    }
    //funciones
    
    //mostrar matriz
    
     public static void mostrar(char [][] a){
    for (int i=0;i<a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
}
     //rellenar matriz
     public static void rellenar(char[][] a){
         for(int fila=0;fila<a.length;fila++)
             Arrays.fill(a[fila], 'A');
     }
     
     //introducir barco
     
     public static void introducirBarco(char[][] m,int tamaño, char letra){
      boolean  condicion;
      int posx,posy;
      
      do{
      condicion=false;
      posx=(int) (Math.random()*10);
      posy=(int) (Math.random()*10);
      if(posy+tamaño<m[0].length){
          condicion=true;
           //comprobar que no coincidan barcos
           for (int i=0;i<tamaño;i++){
               if(m[posx][posy+i]!='A'){
                   condicion=false;
               }
           }
           if(condicion==true){
               for(int i=0;i<tamaño;i++){
                   m[posx][posy+i]=letra;
               }
           }
      }
      }
      while(!condicion);
     }
      
    
      
      
      
      
}
    
    
    
    


    
        
    
    
    
    
    
    
    





    
    
        
    
    

