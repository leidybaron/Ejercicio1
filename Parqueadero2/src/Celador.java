/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Celador {
    
   String saludo()
   {
       return "Hola Buenos dias";
   }
   
    String saludo(boolean ebrio)
   {
      
       return "Largo de aqui!!!";
   }
    
   String saludo(String genero)
   {
       if(genero=="Mujer")
       {
           return "Hola estas muy hermosa";
       }
       else
       {
           return "Buenas tardes doctor";
           
       }
       
   }
    
    
    
}
