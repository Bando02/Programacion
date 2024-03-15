
package practicafantasi;
import java.util.Scanner;
import java.util.Arrays;
public class PracticaFantasi {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        // Lista 22 jugadores 
        
        int posRandom = (int)(Math.random()*11);
        
        Jugadores[] personas = new Jugadores[22];
        
        Jugadores j1 = new Jugadores("Kroos","Centrocampista",37000000.0);
        Jugadores j2 = new Jugadores("Emilio","Portero",10000000.0);
        Jugadores j3 = new Jugadores("Sergio","Portero",11000000.0);
        Jugadores j4 = new Jugadores("Leandro","Centrocampista",11100000.0);        
        Jugadores j5 = new Jugadores("Volo","Centrocampista",37600000.0);
        Jugadores j6 = new Jugadores("Pablo","Centrocampista",37060000.0);       
        Jugadores j7 = new Jugadores("Damian","Centrocampista",37670000.0);       
        Jugadores j8 = new Jugadores("Curro","Defensa",20000000.0);       
        Jugadores j9 = new Jugadores("Luis","Defensa",35000000.0);      
        Jugadores j10 = new Jugadores("Imad","Defensa",8000000.0);
        Jugadores j11 = new Jugadores("Pepe","Portero",50.0);
        Jugadores j12 = new Jugadores("Alvaro","Delantero",870000000.0);
        Jugadores j13 = new Jugadores("Jose","Delantero",25000000.0);
        Jugadores j14 = new Jugadores("Dani","Portero",35000000.0);
        Jugadores j15 = new Jugadores("LuisH","Centrocampista",52.0);
        Jugadores j16 = new Jugadores("Armando","Portero",30000000.0);
        Jugadores j17 = new Jugadores("Victor","Defensa",38000000.0);
        Jugadores j18 = new Jugadores("Javi","Centrocampista",8000000.0);
        Jugadores j19 = new Jugadores("Ivan","Delantero",21.0);
        Jugadores j20 = new Jugadores("Ting","Portero",40000000.0);
        Jugadores j21 = new Jugadores("Santiago","Centrocampista",40000000.0);
        Jugadores j22 = new Jugadores("Jaime","Defensa",20000000.0);
              
        personas[0] = j1;
        personas[1] = j2;
        personas[2] = j3;
        personas[3] = j4;
        personas[4] = j5;
        personas[5] = j6;
        personas[6] = j7;
        personas[7] = j8;
        personas[8] = j9;
        personas[9] = j10;
        personas[10] = j11;
        personas[11] = j12;
        personas[12] = j13;
        personas[13] = j14;
        personas[14] = j15;
        personas[15] = j16;
        personas[16] = j17;
        personas[17] = j18;
        personas[18] = j19;
        personas[19] = j20;
        personas[20] = j21;
        personas[21] = j22;
        
        
        Jugadores[]plantilla = new Jugadores[11];
        
        // Rellenar plantilla 11 jugadores 
        
        rellenar(personas,plantilla);
        boolean salir = false;
        double valor = 0;
        do{
        
        System.out.println(" 1. Mostrar plantilla , 2. Cambiar jugador , 3. Valor del equipo , 4.salir ");
        
        
        int opcion;
        
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                
                for(int i = 0; i<plantilla.length ; i++){
                    
                    System.out.println(plantilla[i]);
                }
                salir = false;
                
                break;
            case 2:
                
                System.out.println("Todos los jugadores disponibles: ");
                
                int lib = 0;
                
                for(int a = 0 ; a < personas.length ; a++){
                    if(personas[a] != null){
                        System.out.println("Pos " +a +" : "+personas[a].toString()); 
                    }
                    else{
                        
                    }
                }
                
                System.out.println("Tu plantilla es ");
                
                for(int i = 0; i<plantilla.length ; i++){
                    
                    System.out.println("Pos " +i +" : " +plantilla[i]);
                }
                
                int posPer;
                int posPlan;
                System.out.println("Elije el num del jugador que quieres ");
                posPer = sc.nextInt();
                System.out.println("Elije el num del jugador que quieres quitar de tu plantilla");
                posPlan = sc.nextInt();
                
                plantilla[posPlan] = null;
                plantilla[posPlan] = personas[posPer];
                
                break;

                
            case 3:
                
                for(int i = 0 ; i < plantilla.length ; i++){
                    
                
                    valor = plantilla[i].getPrecio() + valor;
                }
                    System.out.println("El valor total del equipo es " +valor);
                    
                
                break;
                
            case 4:
                salir = true;
                break;
        }
          
        
        
        
        }while(salir == false);
    
        System.out.println("Has salido del programa");        
                
                }           

    
    public static void rellenar(Jugadores[]personas , Jugadores[]plantilla){
        
        int posRandom;      
        for(int i = 0 ; i < plantilla.length ; i++){
            posRandom = (int)(Math.random()*22);
           if(personas[posRandom] != null){
               
               plantilla[i] = personas[posRandom];
               personas[posRandom] = null;
                       
           }
           else{
               i--;
           }
            
        }  
        }
        }
        
   
    
    
        
            
            

            
            
            
            
        
        
    
    
    
    

