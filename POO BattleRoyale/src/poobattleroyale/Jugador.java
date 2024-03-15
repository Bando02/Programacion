
package poobattleroyale;


public class Jugador {
    
    
    // atributos 
    
    private String nombre;
    private int vida;
    
    // constructores
    public Jugador(){
        
    }
    public Jugador(String nombre){
        this.nombre = nombre;
        vida = 5;
    }
    
    
    
    //metodos 
    public String getNombre(){
        return nombre;
    }
    public int getVida(){
        return vida;
    }
    public void luchar(Jugador jugador){
        jugador.getVida();
        jugador.setVida(vida - 1);
    }
    public void setVida(int num){
        this.vida = vida;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "nombre" +nombre +"vida : " +vida;
    }
}
