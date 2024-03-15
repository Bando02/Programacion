/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.dinero;


public class Persona {
    
    
    // atributos
    String nombre;
    int edad;
    String dni;
    String email;
    
    
    //constructores
    
        Persona(){
            System.out.println("Has creado una persona");
        }
        Persona(String nombre){
            edad = 18;
        }
        Persona(String nombre,int edad){
            this.nombre = nombre;
            this.edad = edad;
        }
        Persona(int edad){
            this.edad = edad;
        }
        
        //metodos 
    
        void saludar(){
            System.out.println(nombre+" te dice Hola!");
        }
        void comer(){
            System.out.println("Estoy comiendo ");
        }
        void incrementar(int num){
            this.edad = edad + num;
        }
        boolean mayorEdad(){
            boolean resp;
            if(edad < 18){
                resp = false;
            }
            else{
                resp = true;
            }
            
            return resp;
        }
    
}
