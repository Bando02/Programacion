
public class Carta {
    
    protected String nombre;
    protected int distancia;
    protected boolean sem;
    protected boolean ataque;
    
    
    /* 
    Ataque
    Integer tipo 1
    boolean ataque true
    int distancia 0km
    
    
    Defensa
    Integer tipo 2
    boolean ataque false
    int distancia 0
    
    Avanzar
    Integer tipo 3
    boolean ataque false
    int distancia;
    
    
    */
    Carta(String nombre, int distancia, boolean ataque){
        this.nombre = nombre;
        this.distancia = distancia;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

    
    
    
}
