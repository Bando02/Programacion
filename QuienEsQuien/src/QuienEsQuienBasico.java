import java.util.Scanner;
public class QuienEsQuienBasico {
 public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
int num;
System.out.println("Quieres jugar el quien es quien ? 1 = Si , 2 = No");
num = sc.nextInt();

if (num == 2){
  System.out.println("Vale, hasta la proxima ");
}
else if ( num == 1){
    boolean gafas;
    boolean perilla;
    boolean gorro;
    boolean barba;
    boolean pegibolo;
    boolean bigote;
    System.out.println("Este juego es el quien es quien, piensa en un personaje de los monstrados en la pizarra y responde a las siguientes preguntas, donde true = si y false = no ");
    System.out.println("Tiene gafas ? ");
    gafas = sc.nextBoolean();
    if (gafas == true){
        System.out.println("Estas pensado en Lupas ");
    }
    else {
        System.out.println("Tiene bigote ?");
        bigote = sc.nextBoolean();
        
    if (bigote == true){
        System.out.println("Estas pensando en Nike ");
    }
    else{
        System.out.println("Tiene gorro ? ");
        gorro = sc.nextBoolean();
        if( gorro == true){
            System.out.println("Tiene perilla ? ");
            perilla = sc.nextBoolean();
            if ( perilla == true){
                System.out.println("Estas pensado en Alejandro ");
            }
                else{
                        System.out.println("Es kiko ");
                        
            
            
            }
            
            }
        else {
            System.out.println("Tiene barba ? ");
            barba = sc.nextBoolean();
            if(barba == true){
                System.out.println("Es Medinilla ");
            }
            
            else{
                System.out.println("Estas pensando en Mónico");
            }
    
    
    
    }
    }
    }




}



}
}  
     
     
 
 
 
 
 
 
    

