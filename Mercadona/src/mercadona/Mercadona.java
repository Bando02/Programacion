
package mercadona;
import java.util.Scanner;
import java.io.*;

public class Mercadona {

    
    public static void main(String[] args, boolean exit) {
        
        Scanner sc = new Scanner(System.in);
        
        // Practica recuperacion 2part //
        
        Cesta[]c1 = new Cesta[20];
        
        
        // Productos Eroski
        
        Producto p1 = new Producto("Pollo",1);
        Producto p2 = new Producto("Avena",1.2);
        Producto p3 = new Producto("Cereales",1.9);
        Producto p4 = new Producto("Yogurt",0.5);
        Producto p5 = new Producto("Chocolate",2);
        Producto p6 = new Producto("Aguacate",1.1);
        Producto p7 = new Producto("Puerro",1.3);
        Producto p8 = new Producto("Manzana",0.4);
        Producto p9 = new Producto("Macarrones",0.8);
        Producto p10 = new Producto("Pan",1);
        
        // Productos Lidl
        
        Producto p11 = new Producto("Pollo",4);
        Producto p12 = new Producto("Avena",3);
        Producto p13 = new Producto("Cereales",1);
        Producto p14 = new Producto("Yogurt",0.9);
        Producto p15 = new Producto("Chocolate",2.3);
        Producto p16 = new Producto("Aguacate",0.2);
        Producto p17 = new Producto("Puerro",0.3);
        Producto p18 = new Producto("Manzana",2);
        Producto p19 = new Producto("Macarrones",0.7);
        Producto p20 = new Producto("Pan",0.5);
        
        Producto[]lista1 = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        Producto[]lista2 = {p11,p12,p13,p14,p15,p16,p17,p18,p19,p20};
       
        Supermercado eroski = new Supermercado("eroski",lista1);
        Supermercado lidl = new Supermercado("lidl",lista2);
        
        Producto pr1 = new Producto("Pollo");
        Producto pr2 = new Producto("Avena");
        Producto pr3 = new Producto("Cereales");
        Producto pr4 = new Producto("Yogurt");
        Producto pr5 = new Producto("Chocolate");
        Producto pr6 = new Producto("Aguacate");
        Producto pr7 = new Producto("Puerro");
        Producto pr8 = new Producto("Manzana");
        Producto pr9 = new Producto("Macarrones");
        Producto pr10 = new Producto("Pan");
        
        Producto[]listaN = new Producto[10];
        listaN[0] = pr1; listaN[1] = pr2; listaN[2]= pr3; listaN[3] = pr4; listaN[4] = pr5;
        listaN[5] = pr6; listaN[6] = pr7; listaN[7] = pr8; listaN[8] = pr9; listaN[9] = pr10;
        
       
        System.out.println("Bienvenidos a la APP SuperComparator");
        System.out.println("Los productos disponibles son los siguientes ");
        
        for (int i = 0; i < listaN.length; i++) {
            System.out.println(" --> " +listaN[i].getNombre());
        }
        
        
        
        do{
               
        
        System.out.println("MENU:  1. Comparator de productos, 2. Ver la cesta 3. Salir");
        
        int opcion;
        
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                break;
                
            case 2:
                Mostrar(c1);
                
                break;
                
            case 3:
                
                System.out.println("Saliendo del programa");
                exit = true;
                break;
                
        }
        }while( exit == false);
        
        
        
        
    }
    
    
    public static void Mostrar(Cesta[]a){
        
        if(a[0] == null){
            System.out.println("La cesta esta vacia");
            
        }
        else{
            for (int i = 0; i < a.length; i++) {
                if(a[i] == null){
                    System.out.println("Vacio");
                }
                else{
                    System.out.println(" --> " +a[i]);
                    
                    System.out.println(" ");
                    
                }
                
            }
        }
        
            
        
    }
    
}
