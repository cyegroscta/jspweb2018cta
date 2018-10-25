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
public class Gato {
    // atributos /////////////////////////////

    String color;
    String raza;
    String sexo;
    int edad;
    double peso;
// métodos //////////////////////////////
// constructor

    public Gato() {
    }

    public Gato(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void maullar() {
        System.out.println("Miauu");
    }

    public void ronronear() {
        System.out.println("Rrrrrr");
    }

    public void comer(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    
    void peleaCon(Gato contrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println("no me gusta pelear");
        } else if (contrincante.getSexo().equals("hembra")) {
            System.out.println("no peleo contra gatitas");
        } else {
            System.out.println("ven aquí que te vas a enterar");
        }
    }
}
