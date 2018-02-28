/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Propietario {

    int nivelAlcohol;
    String genero;

    boolean ebrio() {
        if (nivelAlcohol > 1) {
            return true;
        }
        return false;
    }

    String obtenergenero() {
        return genero;
    }

}
