/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Principal {

    public static void main(String[] args) {
        
       
        String saludo;
        Celador miCelador=new Celador();
        Propietario propietario1 = new Propietario();
        Propietario propietario2 = new Propietario();
        Propietario propietario3 = new Propietario();
        Propietario propietario4 = new Propietario();
        
        propietario1.nivelAlcohol=0;
        propietario1.genero="Mujer";
        saludo=miCelador.saludo("Mujer");
        System.out.println(saludo);
        
      
        propietario1.nivelAlcohol=2;
        propietario1.genero="Mujer";
        saludo=miCelador.saludo("Mujer");
        System.out.println(saludo);
        saludo=miCelador.saludo(true);
        System.out.println(saludo);
        
        propietario2.nivelAlcohol=0;
        propietario2.genero="Hombre";
        saludo=miCelador.saludo("Hombre");
        System.out.println(saludo);
        
        propietario3.nivelAlcohol=2;
        propietario3.genero="Hombre";
        saludo=miCelador.saludo("Hombre");
        System.out.println(saludo);
        saludo=miCelador.saludo(true);
        System.out.println(saludo);
        
      
    }

}
