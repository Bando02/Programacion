
package practica4_valbuena_fernando;

import java.util.Scanner;

public class Practica4_Valbuena_Fernando {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        Coche cochex = new Coche();
        Moto motox = new Moto();
        Camion camionx = new Camion();
        
    Vehiculos [] array ={ cochex , motox , camionx };
    
    String [][] carretera = new String[3][10];
    
    
    
        
        
    
    
        String[]objetivo = new String[3];
        objetivo[0] = "Camion primero y moto Segundo";
        objetivo[1] = "Camion segundo y Moto primero";
        objetivo[2] = "Camion tercero y Moto primero";
        
        
        System.out.println("El objetivo del Camion es " +objetivo[0]);
        System.out.println("El objetivo del Coche es " +objetivo[1]);
        System.out.println("El objetivo de la moto es " +objetivo[2]);
        
        int posCa = 0;
        int posCo = 0;
        int posMo = 0;
        
        carretera[0][posCa] = "Camion";
        carretera[1][posCo] = "Coche";
        carretera[2][posMo] = "Moto";
        
        
            
                
            
            System.out.println("Camion coge carta");
            
            int cartax = (int)(Math.random()*2);
            int move;
            
            switch(cartax){
                case 1: // avanzar //
                    
                    System.out.println("Quien quieres que avance: 1.Camion  2.Coche  3.Moto ");
                    move = sc.nextInt();
                    
                    switch(move){
                        case 1:
                            posCa = posCa + 2;
                            
                            carretera[0][posCa] = "Camion";
                            
                            carretera[0][posCa - 2] = "null";
                            break;
                        case 2:
                            posCo = posCo + 3;
                            
                            carretera[1][posCo] = "Coche";
                            carretera[1][posCo - 3] = "null";
                            break;
                            
                        case 3:
                            posMo = posMo + 4;
                            carretera[2][posMo] = "Moto";
                            carretera[2][posMo - 4] = "null";
                            break;
                            
                    }
                    
                    
                    
                    
                case 2: // retroceder //
                    
                    System.out.println("Quien quieres que retroceda: 1.Camion  2.Coche  3.Moto  ");
                    move = sc.nextInt();
                    
                    switch(move){
                        case 1:
                            posCa = posCa - 2;
                            
                            carretera[0][posCa] = "Camion";
                            
                            carretera[0][posCa + 2] = "null";
                            break;
                        case 2:
                            posCo = posCo - 3;
                            
                            carretera[1][posCo] = "Coche";
                            carretera[1][posCo + 3] = "null";
                            break;
                            
                        case 3:
                            posMo = posMo - 4;
                            carretera[2][posMo] = "Moto";
                            carretera[2][posMo + 4] = "null";
                            break;
                    
            }
            
            
            
            
            
            }
            

                System.out.println("Coche coge carta");
                

            
            cartax = (int)(Math.random()*2);
            
            
            switch(cartax){
                case 1: // avanzar //
                    
                    System.out.println("Quien quieres que avance: 1.Camion  2.Coche  3.Moto ");
                    move = sc.nextInt();
                    
                    switch(move){
                        case 1:
                            System.out.println("Camion a avanzado");
                            posCa = posCa + 2;
                            
                            carretera[0][posCa] = "Camion";
                            
                            carretera[0][posCa - 2] = "null";
                            break;
                        case 2:
                            System.out.println("Coche a avanzado");
                            posCo = posCo + 3;
                            
                            carretera[1][posCo] = "Coche";
                            carretera[1][posCo - 3] = "null";
                            break;
                            
                        case 3:
                            System.out.println("Moto a avanzado");
                            posMo = posMo + 4;
                            carretera[2][posMo] = "Moto";
                            carretera[2][posMo - 4] = "null";
                            break;
                            
                    }
                    
                    
                    
                    
                case 2: // retroceder //
                    
                    System.out.println("Quien quieres que retroceda: 1.Camion  2.Coche  3.Moto  ");
                    move = sc.nextInt();
                    
                    switch(move){
                        case 1:
                            posCa = posCa - 2;
                            
                            carretera[0][posCa] = "Camion";
                            
                            carretera[0][posCa + 2] = "null";
                            break;
                        case 2:
                            posCo = posCo - 3;
                            
                            carretera[1][posCo] = "Coche";
                            carretera[1][posCo + 3] = "null";
                            break;
                            
                        case 3:
                            posMo = posMo - 4;
                            carretera[2][posMo] = "Moto";
                            carretera[2][posMo + 4] = "null";
                            break;
                    
            }
            
            
            
            
            
            }
            
            System.out.println("Moto coge carta");
            
            cartax = (int)(Math.random()*2);
            
            
            switch(cartax){
                case 1: // avanzar //
                    
                    System.out.println("Quien quieres que avance: 1.Camion  2.Coche  3.Moto ");
                    move = sc.nextInt();
                    
                    switch(move){
                        case 1:
                            posCa = posCa + 2;
                            
                            carretera[0][posCa] = "Camion";
                            
                            carretera[0][posCa - 2] = "null";
                            break;
                        case 2:
                            posCo = posCo + 3;
                            
                            carretera[1][posCo] = "Coche";
                            carretera[1][posCo - 3] = "null";
                            break;
                            
                        case 3:
                            posMo = posMo + 4;
                            carretera[2][posMo] = "Moto";
                            carretera[2][posMo - 4] = "null";
                            break;
                            
                    }
                    
                    
                    
                    
                case 2: // retroceder //
                    
                    System.out.println("Quien quieres que retroceda: 1.Camion  2.Coche  3.Moto  ");
                    move = sc.nextInt();
                    
                    switch(move){
                        case 1:
                            posCa = posCa - 2;
                            
                            carretera[0][posCa] = "Camion";
                            
                            carretera[0][posCa + 2] = "null";
                            break;
                        case 2:
                            posCo = posCo - 3;
                            
                            carretera[1][posCo] = "Coche";
                            carretera[1][posCo + 3] = "null";
                            break;
                        case 3:
                            posMo = posMo - 4;
                            carretera[2][posMo] = "Moto";
                            carretera[2][posMo + 4] = "null";
                            break;
                    
            }}}}
            
            
            
            
            
            

                  
            
            
            
        
        
        
        
       
        
        
        
    
    
    
    
    

