
package practica4_valbuena_fernando;


public class Coche extends Vehiculos{

    
    //atributos
    
    
    //constructores
    
    Coche(){
        nombre = "Coche";
        posx = 1;
        posy = 0;
}
    //metodos
    
    @Override
    public void avanzar() {
        posy = posy + 3;
        
    }

    @Override
    public void retroceder() {
        posy = posy - 3;
    }
    
}
