import java.util.Scanner;
public class Practica1_Fernando_Valbuena {
public static void main(String[] args) {
Scanner sc = new Scanner ( System.in);
    

    

    // EJERCICIO 1 // 
    
    /* Realiza un programa que reciba la inicial del nombre y la edad de una 
    persona mayor de edad  por teclado (hay que controlar esa condición) 
    y nos diga cuántos años le quedan para jubilarse (suponemos que la edad 
            de jubilación es de 65 años).
    Además, si ya está jubilado, nos debe decir cuántos años lleva jubilado.*/


    /*
    String nombre;
    int Meda;
    int jubilarse = 65;
    int mayorEdad = 18;
    System.out.println("Introduce la inicial de tu nombre ");
        nombre = sc.nextLine();
    System.out.println("Introduce tu edad ");
    Meda = sc.nextInt();
    if(Meda < mayorEdad ){
        System.out.println(" Hay que ser mayor de edad ");         
    }    
    else if(Meda > jubilarse){
        System.out.println(" Llevas jubilado "+(Meda - jubilarse) +" años ");
    }       
    else{
        System.out.println(" Te queda para jubilarte " +(jubilarse - Meda));
    }
    */
    // En este ejercicio hice un if, else if para condicionar la edad del usuario//
    
    
    // EJERCICIO 2 //
    /* Escriba un programa que lea desde teclado una cantidad en euros e imprima
su equivalente en dólares americanos con el formato del siguiente ejemplo:

1 euros equivalen a 1.16 dólares americanos

Hay que tener en cuenta que el valor del dólar es algo que cambia
con frecuencia y se busca hacer pocos cambios en el código para arreglar el programa. */
    
    
    /*
    int euro;
    double dolar = 1.16;
    /*
    System.out.println("Introduce una cantidad de euros ");
    euro = sc.nextInt();
    System.out.println(euro +" son en dolares " +(euro *dolar));
    
    */
    
    
    // EJERCICIO 3 //
    /* Realiza un programa que muestre la siguiente sucesión de 
    números: 3, 6, 9, 12, ..., 99, y, a continuación, imprima por pantalla 
    la suma total de todos esos números. */

    /*
    int num = 3;
    while (num < 100){
        System.out.println(" Secuencia " +num);
        num = num + 3;
    }
    System.out.println("Suma total es " +num+num);
    */
    
    
    
    
    
        
        
        
    
    // EJERCICIO 4 // 
    /* Realiza un programa que lea 10 calificaciones por teclado y a continuación, 
    imprima cuántos suspensos hay[1] (notas menores a 5), cuántos aprobados hay (notas entre 5 y 6),
    cuántos notables hay (notas entre 7 y 8) y cuanto sobresalientes hay (notas superiores a 9). */
    /*
    int nota1,nota2,nota3,nota4,nota5,nota6,nota7,nota8,nota9,nota10;
    int suspensos = 0;
    int aprobado = 0;
    int notable = 0;
    int sobresalientes = 0;
    
    System.out.println(" Introduce 10 notas ");
    
    for(int i = 1; i <= 10; i++){
        System.out.println(" Nota del alumno " + i + " : ");
        int nota = sc.nextInt();
        if (nota <= 4){   
            suspensos++;
        }
        else if(nota >= 5 ){
            aprobado++;
        }
        else if(nota >= 7 ){
            notable++;
        }
        else if (nota >=9){
            sobresalientes++;
        }
    
    
    }
    
    System.out.println(" Aprobados : " + aprobado );
    System.out.println(" Suspensos " +suspensos );
    System.out.println(" Notables : " +notable);
    System.out.println(" Sobresalientes " +sobresalientes);
    
    */
    
    
    
    
    // EJERCICIO 5// 
    
    
    
    char producto;
    double precio1 ,precio2,precio3,precio4 ,precio5,precio6 ;
    char elecSi = 'S';
    char elecNo = 'N';
    char elec;
        System.out.println(" Introduce la inicial del producto ");
        producto = sc.next().charAt(0);
        System.out.println(" Introduce el precio del producto ");
        precio1 = sc.nextDouble();
        System.out.println(" Quiere seguir con la compra ? S = si N = no ");
        elec = sc.next().charAt(0);
        if (elec == elecNo){
            System.out.println(" El precio total de la compra es " +precio1);
        }
        else{
            System.out.println(" Introduce la inicial del producto ");
            producto = sc.next().charAt(0);
            System.out.println(" Introduce el precio del producto ");
            precio2 = sc.nextDouble();
            System.out.println(" Quiere seguir con la compra ? S = si N = no ");
            elec = sc.next().charAt(0);
                if(elec == elecNo){
                System.out.println(" El precio total del producto es " +(precio1 + precio2));
                }
                else{
                    System.out.println(" Introduce la inicial del producto ");
                        producto = sc.next().charAt(0);
                    System.out.println(" Introduce el precio del producto ");
                    precio3 = sc.nextDouble();
                    System.out.println(" Quiere seguir con la compra ? S = si N = no ");
                    elec = sc.next().charAt(0);
                     if(elec == elecNo){
                        System.out.println(" El precio total de la compra es " +(precio1 + precio2 + precio3));    
                       }
                     else{
                            System.out.println(" Introduce la inicial del producto ");
                            producto = sc.next().charAt(0);
                             System.out.println(" Introduce el precio del producto ");
                            precio4 = sc.nextDouble();
                            System.out.println(" Quiere seguir con la compra ? S = si N = no ");
                            elec = sc.next().charAt(0);
                            if(elec == elecNo){
                                System.out.println(" El precio total de su compra es " +(precio1 + precio2 + precio3 + precio4));
                            }
                            else{
                                System.out.println(" Introduce la inicial del producto ");
                                producto = sc.next().charAt(0);
                                System.out.println(" Introduce el precio del producto ");
                                precio5 = sc.nextDouble();
                                System.out.println(" Quiere seguir con la compra ? S = si N = no ");
                                elec = sc.next().charAt(0);
                                if(elec == elecNo){
                                    System.out.println(" El precio total de la compra es " +(precio1+precio2+precio3+precio4+precio5));
                                }
                                else{
                                    System.out.println(" Introduce la inicial del producto ");
                                    producto = sc.next().charAt(0);
                                    System.out.println(" Introduce el precio del producto ");
                                    precio6 = sc.nextDouble();
                                    System.out.println(" Quiere seguir con la compra ? S = si N = no ");
                                    elec = sc.next().charAt(0);
                                    if(elec == elecNo){
                                        System.out.println(" El precio total de la compra es " +(precio1+precio2+precio3+precio4+precio5+precio6));
                                    }
                                    else{
                                        System.out.println(" Su compra es gigante, haga otra");
                                    }
                                        
                                        
                                        }
                            }
                     
                     }
    
    
  
    
   
 
    
    
    
    
    
    
    
                }}
    }}
    
    
    
    
    
    
    

