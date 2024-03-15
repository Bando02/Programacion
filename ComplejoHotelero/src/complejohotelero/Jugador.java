/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complejohotelero;


public class Jugador {
    
    // atributos
    
    int DineroJugador = 25000000;
    String Nombre;
        
    // constructores
    
    public Jugador(String Nombre){
        this.Nombre = Nombre;
    }
    
    // metodos 

    public void setJugador(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }
    

    
    
    
    
    
}
