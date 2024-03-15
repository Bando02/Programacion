package lista;

import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;

public class LISTA {

    public static void main(String[] args) {

        // Lista de numeros 
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros.size());

        numeros.add(5);
        numeros.add(3);
        numeros.add(8);

        System.out.println(numeros);

        System.out.println(numeros.size());

        numeros.add(1, 4);

        System.out.println(numeros);

        System.out.println(numeros.get(0));

        System.out.println(" Listado de Arraylist con .add ");

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pepe");
        nombres.add("Armando");
        nombres.remove(1);
        System.out.println(nombres);

        System.out.println(" ^^^^^^^^^ ARRAY LINK ^^^^^^^^ \n\n");

        LinkedList<String> arrayLink = new LinkedList<>();

        arrayLink.add("Pepe");
        arrayLink.add("Juan");
        arrayLink.add(1, "Elena"); // Pone Elena en posicion 1 y mueve los demas
        arrayLink.set(1, "Maria"); // Elimina la posicion 1 y pone el nuevo nombre ( Eliminaria Elena )

        System.out.println(" \n\nArrayList con clases Persona \n\n");

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 18));
        personas.add(new Persona("Pepe", 20));
        personas.add(new Persona());
        personas.add(new Persona("Elena", 25));

        System.out.println(personas);
        
        System.out.println("\n\n ^^ JAVA COLLECTION ^^ \n\n");
        
        ArrayList <Integer> numeros2 = new ArrayList <>();
        
        numeros2.add(7);
        numeros2.add(2);
        numeros2.add(3);
        
        System.out.println(numeros2); // 7,2,3
        
        // ordenar 
        
        Collections.sort(numeros2);
        
        System.out.println(numeros2); // 2 3 7
        
        Collections.shuffle(numeros2); // desordena
        System.out.println(numeros2);
        
        System.out.println("");
        
        

    }

}
