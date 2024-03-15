
public class Perro extends Animal{

  
        
         
    // atributos
    
    
    // constructores 
    
    public Perro(){
        patas = 4;
        nombre = "perro";
        
    }
    
    // metodos
    
    @Override
    public void dormir() {
        System.out.println("Soy un perro durmiendo");
        
    }
    
    @Override
    public void comer() {
        System.out.println("Como pienso, soy un perro");
    }
    
}

