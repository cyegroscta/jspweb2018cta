/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring;

/**
 *
 * @author ADMIN
 */
public class Cuadrado {

    int lado;

    public Cuadrado(int l) {
        this.lado = l;
    }

    public String toString() {

        int i, espacios;
        String resultado = "┼";
        for (i = 0; i < this.lado; i++) {
            resultado += "";
        }
        resultado += "\n";
        for (i = 1; i < this.lado - 1; i++) {
            resultado += "┼";
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += " ";
            }
            resultado += "┼\n";
        }
        for (i = 0; i < this.lado; i++) {
            resultado += "┼";
        }
        resultado += "\n";
        return resultado;

    }
}
