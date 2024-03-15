            /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle;

/**
 *
 * @author Medac
 */
class Jugador {
    
    // atributos 
    
    private String nombre;
    private int vida;  

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", vida=" + vida + '}';
    }
    public void luchar(Jugador jugador){
        jugador.getVida();
        jugador.setVida(vida - 1);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }
}
