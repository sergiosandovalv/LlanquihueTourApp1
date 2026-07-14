
package model;

/**
 * Clase que representa un paseo lacustre
 * Hereda los atributos de ServicioTuristico y agrega
 * el tipo de embarcacion utilizada en el recorrido
 *
 * @author Sergio Sandoval
 */

public class PaseoLacustre extends ServicioTuristico {
    
    private String tipoEmbarcacion;
    
    
    /**
     * 
     * @param nombre Nombre del paseo
     * @param duracionHoras Duracion del paseo en horas
     * @param tipoEmbarcacion Tipo de embarcacion 
     */
    
    
public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
       
       super(nombre, duracionHoras);
       this.tipoEmbarcacion = tipoEmbarcacion;
   } 

public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    
 /**
 * Muestra la informacion del paseo lacustre.
 */
@Override
public void mostrarInformacion() {
    System.out.println(this.toString());
}
    
/**
* 
*
* 
*/   

@Override
public String mostrarResumen() {
    return "Paseo lacustre: " + getNombre();
}


@Override
public String toString() {
   return super.toString() +
           "\nTipo de embarcación: " + tipoEmbarcacion;

    
   }
    
}

