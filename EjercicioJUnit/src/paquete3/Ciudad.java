/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {

    private String nombre;
    private int poblacion;

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    
      public void establecerPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    @Override
    
    public String toString(){
    
        String cadena = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n", 
                nombre,poblacion);
    
    
        return cadena;
    
    
    }
    
    
  

    
}
