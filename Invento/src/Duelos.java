import java.util.Scanner;
public class Duelos {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);   

    
    String jugador1;
    String jugador2;
    String Tjugador1;
    String Tjugador2;
    int vidaJugador1 = 4;
    int vidaJugador2 = 4;
    int tiroCuerpo = 2;
    int tiroPiernas = 1;
        System.out.println("Juego duelo 1vs1");
        System.out.println("Añade tu nombre jugador 1 ");
        jugador1 = sc.nextLine();
        System.out.println("Añade tu nombre jugador 2 ");
        jugador2 = sc.nextLine();
        
        System.out.println("En el juego habra un total de 4 vidas por jugador y una cierta posiblidad de fallar la bala ");
        
        String cabeza;
        String cuerpo;
        String piernas;
        double pcabeza =(int)(Math.random()*5+1);
        double pcuerpo =(int)(Math.random()*3+1);
        double ppiernas =(int)(Math.random()*1+1);
        int shot;
        System.out.println("Podras disparar a Cabeza  Cuerpo o  Piernas ");        
        System.out.println("Que empiece el duelo");
        
        while(vidaJugador1 !=0 -1 -2 -3 -4 || vidaJugador2 != 0 -1 -2 -3 -4){
            System.out.println("Turno de " +jugador1);
        System.out.println( jugador1 +" elija cabeza , cuerpo o piernas");
            Tjugador1 = sc.nextLine();
            
            if(Tjugador1.equals("cabeza") || Tjugador1.equals("Cabeza")){
                System.out.println("Elije un numero del 1 al 5");
                    shot = sc.nextInt();
                        if(shot == pcabeza){
                            System.out.println("Felicidades " +jugador1 +" has ganado");
                            break;
                        }                       
                        else{
                            System.out.println("Has fallado la bala");
                        }
           }             
            else if(Tjugador1.equals("cuerpo") || Tjugador1.equals("Cuerpo")){
                System.out.println("Elije un numero del 1 al 3");
                    shot = sc.nextInt();
                        if(shot == pcuerpo){
                            System.out.println("Le diste en el cuerpo, -2 vidas para " +jugador2);
                        vidaJugador2 = vidaJugador2 - tiroCuerpo;
                            if (vidaJugador2 == 0 ||vidaJugador2 < 0){
                                System.out.println("Ha ganado " +jugador1);
                                break;
                            }
                        }
                        else{
                            System.out.println("Fallaste la bala");                        
                        }
            }
            else if(Tjugador1.equals("piernas") || Tjugador1.equals("Piernas")){
                System.out.println("Le diste en las piernas a "+jugador2+", ha perdido 1 vida");
                    vidaJugador2 = vidaJugador2 - tiroPiernas;
                        if(vidaJugador2 == 0 ||vidaJugador2 <0){
                            System.out.println("Ha ganado "+jugador1);
                            break;
                        }
            }
        System.out.println("Actualmente " +jugador2 +" tiene " +vidaJugador2 +" vidas");
        
            System.out.println("Turno de "+jugador2);   
        System.out.println( jugador2 +" elija cabeza , cuerpo o piernas");
            sc.nextLine();
            Tjugador2 =sc.nextLine();
            
            if(Tjugador2.equals("cabeza") || Tjugador2.equals("Cabeza")){
                System.out.println("Elije un numero del 1 al 5");
                    shot = sc.nextInt();
                        if(shot == pcabeza){
                            System.out.println("Felicidades " +jugador2 +" has ganado");
                            break;
                            
                        }
                        else{
                            System.out.println("Has fallado la bala");
                        }
           }             
            else if(Tjugador2.equals("cuerpo") || Tjugador2.equals("Cuerpo")){
                System.out.println("Elije un numero del 1 al 3");
                    shot = sc.nextInt();
                        if(shot == pcuerpo){
                            System.out.println("Le diste en el cuerpo, -2 vidas para " +jugador1);
                        vidaJugador1 = vidaJugador1 - tiroCuerpo;
                            if(vidaJugador1 == 0 || vidaJugador1<0){
                                System.out.println("Ha ganado "+jugador2);
                                break;
                            }
                        }
                        else{
                            System.out.println("Fallaste la bala");
                        
                        }
            }
            else if(Tjugador2.equals("piernas") || Tjugador2.equals("Piernas")){
                System.out.println("Le diste en las piernas a "+jugador1 +", ha perdido 1 vida");
                    vidaJugador1 = vidaJugador1 - tiroPiernas;
                        if(vidaJugador1 == 0 || vidaJugador1<0){
                            System.out.println("Ha ganado " +jugador2);
                            break;
                        }
            } 
        System.out.println("Actualmente " +jugador1 +" tiene "+vidaJugador1 +" vidas");    
              
            }
    
        }
}
    
 
    
    
    
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
            
           

