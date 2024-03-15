
package poobattleroyale;

public class POOBattleRoyale {

   
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Alfonso");
        Jugador j2 = new Jugador("Mónico");
    
            do{
        
                int a = (int)(Math.random()*2);
        
                if(a == 0){ //Jugador 1 le pega a jugador 2 
            
                    j1.luchar(j2);
                } 
                else{ // Jugador 2 le pega a jugador 1
            
                    j2.luchar(j1);
                }
                }
            while(j1.getVida() > 0 && j2.getVida() > 0);
            
            
            if(j1.getVida() == 0){
                System.out.println("Ha ganado "+j2.toString());
            }
            else{
                System.out.println("Ha ganado "+j1.toString());
            }
            
            
            
    
    
    
    
    
        
    }
    
}
