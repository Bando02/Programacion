
package practica4_valbuena_fernando;


public class Camion extends Vehiculos{

    
    
    
    Camion(){
        nombre ="Camion";
        posx = 2;
        posy = 0;
    }
    
    
    
    @Override
    public void avanzar() {
        posy = posy + 2;
    }

    @Override
    public void retroceder() {
        posy = posy - 2;
    }
    
}
