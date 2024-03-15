/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_valbuena_fernando;

/**
 *
 * @author Medac
 */
public abstract class Vehiculos {
    
    
    protected String nombre;
    protected int posx;
    protected int posy;
    
    // constructor
    Vehiculos(){
        
    }
    
    
    public abstract void avanzar();
    
    public abstract void retroceder();

    
}
