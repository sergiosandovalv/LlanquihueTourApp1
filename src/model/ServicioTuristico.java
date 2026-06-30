
package model;

/**
 * Clase base que representa un servicio turístico.
 * Contiene los atributos comunes para todos los servicios turísticos.
 *
 * @author Sergio Sandoval
 */

public class ServicioTuristico {
    
   private String nombre;
   private int duracionHoras; 

/**
* Constructor de la clase ServicioTuristico.
*
* @param nombre Nombre del servicio turistico.
* @param duracionHoras Duracion del servicio en horas.
*/   
   
   
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
  
    @Override
    public String toString() {
        return "===== SERVICIO TURÍSTICO =====" +
               "\nNombre: " + nombre +
               "\nDuración: " + duracionHoras + " horas";
    }
    
} 
   
  
    

