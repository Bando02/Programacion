
package practica.laberinto;
import java.util.Scanner;
import java.util.Arrays;
public class PracticaLaberinto {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);


    char[][] laberinto = new char[10][10];
    
    //Pasamos a rellenar el tablero de X con el metodo "rellenar" // 
    boolean ZZ;
        char empezar;
        
        do{
    rellenar(laberinto,'x');

    // Ahora lo mostramos para ver como queda con el metodo "mostrar"//
    
       // mostrar(laberinto); 
       
       // Ya creada el metodo mostrar lo usaremos para ir actualizando el tablero //
    
    // Una vez rellenado, creamos los pasillos con varios for //
    
  
   
    
    for(int i = 0;i<6;i++ ){
        laberinto[0][i]=' ';
    }    
    
    for(int i = 0; i<4;i++){
        laberinto[i][5]=' ';
    }
        
    for(int i = 3; i<8;i++){
        laberinto[i][6]=' ';
    }
    
    for(int i = 7; i < 10; i++){
        laberinto[i][7]=' ';
    }
    
     for(int i = 7;i<10;i++ ){
        laberinto[9][i]=' ';
    }  
    
    // Añadimos la posición inicial del jugador //
    
    int posX = 0;
    int posY = 0;
       
    
    
    // Creamos los movimientos solo como referencia  // 
    
    int derecha;
    int izquierda;
    int abajo;
    int arriba;
    
    
    // Empezamos a crear el juego // 
    
    
    boolean jugar = false;
            
    
    System.out.println(" Juego del laberinto, avanza con 1.Derecha, 2.Izquierda, 3.Abajo, 4.Arriba ");
    int move;
    boolean aux;
    
       posX = 0;
       posY = 0;
       int turnos = 3;
       
    do{
        
      
        
        System.out.println(" Ahora mismo estas en la posición " + "["+posX+","+posY+"]");
        laberinto[posX][posY] =  'O';
      mostrar(laberinto);
    
        // Con If hacemos todos los posibles movimientos // 
        
        // Teniendo en cuenta que si sale del tablero, vuelvas a donde estabas y te quite un turno // 
        
      
        System.out.println(" Escribe 1 = Abajo, 2 = Arriba, 3 = Derecha , 4 = Izquierda");
        
        
        move = sc.nextInt();
        
        if (move == 1){
        laberinto[posX][posY]=' ';    
        posX = posX + 1;
            if(posX == -1 || posY == -1 || posX == 'x' || posY == 'x'){
                System.out.println("Te has salido, has perdido 1 turno ");
                posX = posX - 1;
                 turnos  = turnos - 1;
                
            }
        }
        else if ( move == 2){
            laberinto[posX][posY]=' ';
            posX = posX - 1;
            if(posX == -1 || posY == -1 || posX == 'x' || posY == 'x'){
                System.out.println("Te has salido, has perdido 1 turno ");
                posX = posX +1;
                turnos  = turnos - 1;
               
            
        }
      
    }
        else if ( move == 3){
            laberinto[posX][posY]=' ';
            posY = posY + 1;
            if(posX == -1 || posY == -1 || posX == 'x' || posY == 'x' ){ 
                System.out.println("Te has salido, has perdido 1 turno ");
                turnos  = turnos - 1;
                
                posY = posY -1;
        }
    }
        else if ( move == 4){
            laberinto[posX][posY]=' ';
            posY = posY - 1;
            if(posX == -1 || posY == -1 || posX == 'x' || posY == 'x' ){
                System.out.println("Te has salido, has perdido 1 turno ");
                turnos  = turnos - 1;
                
                posY = posY +1;
                
        }
        }
        // Contemplamos el posible caso que el usuario ponga un movimiento no valido // 
        else{
            System.out.println(" Introduce un numero del 1 al 4 ");
        }
        
    
        
        // Contemplamos los turnos y la posición final // 
        
        
    if(turnos == 0){
        jugar = true;
    }    
        
    if(posX == 9 && posY == 9){
        jugar = true;
        
    }    
        
    }
    while(!jugar );
    
    
        // Comprobamos si hemos ganado o hemos perdido //
        
    if( jugar = true && turnos>0){
        System.out.println(" Felicidades, has ganado ");
    }
    else{
        System.out.println(" Has perdido :o, te has quedado sin turnos ");
    }
    
        
        System.out.println(" Quieres volver a jugar ?? (y/n)");
        empezar = sc.next().charAt(0);
        
        if(empezar == 'y'){
            ZZ = true;
        }
        else{
            ZZ = false;
        }
        
    }
    while(ZZ = true);
    
    
    
    
}

// Metodo para Rellenar Tablero //
    
private static void rellenar(char[][] laberinto, char letra){
        for(int i = 0;i<laberinto.length;i++){
            Arrays.fill(laberinto[i],letra);
        }
}

// Metodo para mostrar tablero // 

public static void mostrar(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }}




}
