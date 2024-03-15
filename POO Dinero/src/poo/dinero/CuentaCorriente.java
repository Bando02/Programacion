
package poo.dinero;
public class CuentaCorriente {
    
    //atributos
    
    double saldo;
    String nombre;
    int limite = -50;
    String dni;
    Persona persona;
    
    // constructores
    
    CuentaCorriente(){
        System.out.println(" Cuenta creada");
       
    }
    CuentaCorriente(Persona persona , double saldo , int limite){
        this.persona = persona;
        this.saldo = saldo;
        this.limite = limite;
        
    }
    CuentaCorriente(double saldo){
        this.saldo = saldo;
    }
    
    CuentaCorriente(String nombre,double saldo, int limite, String dni){
        
        this.nombre = nombre;
        this.saldo = saldo;
        this.limite = limite;
        this.dni = dni;
        
    }
    
    
    
    
    // metodos 
    
    void SacarDinero(double num){
        if(saldo - num < limite){
            System.out.println("No puedes sacar dinero, superas el limite");
        }
        else{
            saldo = saldo - num;
            
            System.out.println("Su saldo en banco actualmente es " +saldo);
            
        }
        
    }
    void IngresarDinero(double num){
        saldo = saldo + num;
        
        if( num == 0){
            
        }
        else{
        System.out.println("Su saldo a aumentado a " +saldo);
        }
    }
    void MostrarDatos(){
        
        System.out.println("Nomre propietario cuenta "+nombre);
        System.out.println("Su saldo actual es " +saldo);
        System.out.println("Su dni es " +dni);
        System.out.println("Limite establecio de " +limite);
        
    }
    
    
}