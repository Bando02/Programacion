/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class KyloRen extends Leia {

    public KyloRen() {
        super();
        lado_oscuro = true;
        habilidad_diplomacia = 1;
        habilidad_espadalaser = 4;
    }
    
    @Override
    public void hablar() {
        System.out.println("Hola, soy tu nieto");
    }
    
    
}
