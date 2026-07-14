package model;

/**
 * Clase que representa una ruta gastronomica
 * Hereda los atributos de ServicioTuristico y agrega
 * la cantidad de restaurantes incluidos en el recorrido
 *
 * @author Sergio Sandoval
 */
public class RutaGastronomica extends ServicioTuristico {
    
    private int cantidadRestaurantes;
    
    
    
    /**
    * Constructor de la clase RutaGastronomica
    * 
    * @param nombre Nombre de la ruta gastronomica
    * @param duracionHoras Duracion del recorrido en horas
    * @param cantidadRestaurantes cantidadRestaurantes incluidos en la ruta
    */       
    public RutaGastronomica(String nombre, int duracionHoras, int cantidadRestaurantes) {
    
       super(nombre, duracionHoras);
       this.cantidadRestaurantes = cantidadRestaurantes;
           
}

    public int getCantidadRestaurantes() {
        return cantidadRestaurantes;
    }

    public void setCantidadRestaurantes(int cantidadRestaurantes) {
        this.cantidadRestaurantes = cantidadRestaurantes;
    }
    
    /**
    * Muestra la informacion de la ruta gastronomica.
    */
    @Override
    public void mostrarInformacion() {
        System.out.println(this.toString());
    }
    
/**
* Devuelve la información de la ruta gastronomica.
*
* @return Informacion completa del servicio.
*/      
@Override    
     public String mostrarResumen() {
        return "Ruta gastronómica: " + getNombre(); 
        
     }       
    
@Override
    public String toString() {
        return super.toString() +
               "\nCantidad de restaurantes: " + cantidadRestaurantes;    
    
 }

}