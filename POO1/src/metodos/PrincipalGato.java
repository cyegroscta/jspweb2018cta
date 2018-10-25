/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author ADMIN
 */
public class PrincipalGato {

    public static void main(String[] args) {
        Gato garfield = new Gato("macho");
        
        System.out.println("hola gatito");
        
        garfield.maullar();
        
        System.out.println("toma tarta");
        
        garfield.comer("tarta selva negra");
        
        System.out.println("toma pescado, a ver si esto te gusta");
        
        garfield.comer("pescado");
        
        Gato tom = new Gato("macho");
        
        System.out.println("Tom, toma sopita de verduras");
        
        tom.comer("sopa de verduras");
        
        Gato lisa = new Gato("hembra");
        
        System.out.println("gatitos, a ver cómo maulláis");
        
        garfield.maullar();
        
        tom.maullar();
        
        lisa.maullar();
        
        garfield.peleaCon(lisa);
        
        lisa.peleaCon(tom);
        
        tom.peleaCon(garfield);
    }
}
