/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class StarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DarthVader d = new DarthVader();
        Leia l = new Leia();
        Luke luk = new Luke();
        KyloRen ky = new KyloRen();
        
        d.hablar();
        l.hablar();
        luk.hablar();
        ky.hablar();
        
    }
    
}
