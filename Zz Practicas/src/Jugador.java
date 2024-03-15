import java.util.LinkedList;
public class Jugador {
    
    LinkedList<Carta> mano;
    int kmTotales;
    
    Jugador(LinkedList <Carta> mano,int km){
    this.mano=mano;
    this.kmTotales = km;
        
    }

    public int getKmTotales() {
        return kmTotales;
    }

    @Override
    public String toString() {
        return "[ " + mano + " ] ";
    }
    
    
}
