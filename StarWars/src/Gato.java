
public class Gato extends Animal{

    // atributos
    
    // constructor
    
    public Gato(){
        patas = 4;
        nombre = "gato";
    }
    
    // metodos 
    
    @Override
    public void comer() {
        System.out.println("Como pescado, soy un gato");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo como un gato");
    }
    
}
