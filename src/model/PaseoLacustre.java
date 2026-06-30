
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
* Devuelve la informacion del paseo lacustre.
*
* @return Información completa del servicio.
*/   

@Override
public String toString() {
   return super.toString() +
           "\nTipo de embarcación: " + tipoEmbarcacion;

    
   }
    
}

