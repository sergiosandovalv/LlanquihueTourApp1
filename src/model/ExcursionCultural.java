
package model;

/**
 * Clase que representa una excursion cultural
 * 
 * Hereda los atributos de ServicioTuristico y agrega
 * el lugar historico que se visita durante el recorrido
 *
 * @author Sergio Sandoval
 */
public class ExcursionCultural extends ServicioTuristico {
    
    private String lugarHistorico;
    
/**
* Constructor de la clase ExcursionCultural.
*
* @param nombre Nombre de la excursion cultural
* @param duracionHoras Duracion del recorrido en horas
* @param lugarHistorico Lugar historico que se visita
*/
public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
    
    super(nombre, duracionHoras);
    this.lugarHistorico = lugarHistorico;
}

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
    
    /**
 * Muestra la informacion de la excursion cultural.
 */
@Override
public void mostrarInformacion() {
    System.out.println(this.toString());
}

/**
* Devuelve la informacion de la excursion cultural
*
* @return Informacion completa del servicio
*/
    
@Override
public String toString() {
    return super.toString() +
           "\nLugar histórico: " + lugarHistorico;    

    
  }

}