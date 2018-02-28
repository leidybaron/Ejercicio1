/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Estudiantes
 */
public class Vehiculo {

    //Atributos
    public String marca;
    public int cilindraje;
    public String modelo;
    public int año;

    //Metodos o Funciones
    void acelerar() {
        System.out.println("El vehiculo esta acelerando");
    }

    void frenar() {
        System.out.println("El vehiculo esta frenando");
    }
}
