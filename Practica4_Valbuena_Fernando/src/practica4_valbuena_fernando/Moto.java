
package practica4_valbuena_fernando;

public class Moto extends Vehiculos{

    
    
    
    
    Moto(){
        nombre = "Moto";
        posx = 0;
        posy = 0;
    }
    
    @Override
    public void avanzar() {
        posy = posy + 4;
    }

    @Override
    public void retroceder() {
        posy = posy - 4;
    }
    
}
