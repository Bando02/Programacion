
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class Cartaskm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creacion de mazo con todas cartas 
        LinkedList<Carta> mazo = new LinkedList<>(); // -> Mazo

        // Creacion cartas ataque y defensa e introducirlas al mazo
        for (int i = 0; i < 8; i++) {
            mazo.add(new Carta("SemaforoVerde", 0, false));
            mazo.add(new Carta("SemaforoRojo", 0, true));
            mazo.add(new Carta("Gasolina", 0, false));
            mazo.add(new Carta("QuitarGasolina", 0, true));

        }
        // Creacion de cartas avance e introducirlas al mazo
        for (int i = 0; i < 16; i++) {
            switch (i) {
                case 0, 1, 2, 3, 4, 5 -> {
                    mazo.add(new Carta("100km", 100, false));
                    break;
                }
                case 6, 7 -> {
                    mazo.add(new Carta("25km", 25, false));
                    break;
                }
                case 8, 9 -> {
                    mazo.add(new Carta("50km", 50, false));
                    break;
                }
                case 10, 11 -> {
                    mazo.add(new Carta("75km", 75, false));
                    break;
                }
                case 12, 13 -> {
                    mazo.add(new Carta("150km", 150, false));
                    break;
                }
                case 14, 15 -> {
                    mazo.add(new Carta("200km", 200, false));
                    break;
                }
            }

        }
        
         
        
        
        // Creamos los jugadores con sus manos 
        
        LinkedList<Carta> mano1 = new LinkedList<>();
        LinkedList<Carta> mano2 = new LinkedList<>();
        Jugador jugador1 = new Jugador(mano1,0);
        Jugador jugador2 = new Jugador(mano2,0);
        
        LinkedList<Carta> mesa1 = new LinkedList<>();
        LinkedList<Carta> mesa2 = new LinkedList<>();
        
        barajar(mazo); // Removemos las posiciones de las cartas
        repartir(mazo,mano1,mano2); // Repartimos cartas del mazo
        
        
        // Interfaz de bienvenida 
        
        System.out.println(" Bienvendido al juego 1000km ");

        boolean jugar = true;
        int turno = 0;
        do {
                 
            System.out.println(" ------ " + turno + " ------ ");
            System.out.println("Turno de jugador 1 \n Cartas en la mesa:");
            
            System.out.println(mesa1);
            System.out.println(mesa2);
            
            System.out.println("Cartas jugador 1 :       Kilometros : " +jugador1.kmTotales);
            System.out.println(mano1);
            
            System.out.println("Elije la posicion de la carta que quieras utilizar: ");
            
            int eleccion;
            eleccion = sc.nextInt();
            switch(eleccion){
                case 0 -> {
                    
                        
                    
                
            }
            }
                
                
            
        
            
            
        turno++;    
        } while (jugar == true);

    }

    
    
    
    
    
    
    
    //metodo para barajar las cartas del mazo
    public static void barajar(LinkedList<Carta> mazo) {

        Collections.shuffle(mazo);

    }
    
    public static void repartir(LinkedList<Carta> mazo,LinkedList<Carta>mano1,LinkedList<Carta>mano2){
    
        for (int i = 0; i < 6; i++) {
        
            mano1.add(mazo.pollFirst());
        }
        for (int i = 0; i < 6; i++) {
            mano2.add(mazo.pollFirst());
        }
    }

}
