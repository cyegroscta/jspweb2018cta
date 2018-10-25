/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ADMIN
 */
public class PrincipalHerencia {
    public static void main(String[] args) {
        Directivo dir = new Directivo();
        String nombre="Pedro";
        dir.setNombre(nombre);
        
        System.out.println( dir.toString());
     Operario op = new Operario();
     nombre = "José";
     op.setNombre(nombre);
        System.out.println(op.toString());
    
    
    
    }
}
