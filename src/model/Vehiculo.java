
package model;

/**
 * Representa un vehiculo perteneciente a la agencia.
 * Almacena el tipo de vehiculo y permite mostrar
 * un resumen de su informacion.
 *
 * @author Sergio Sandoval
 */

public class Vehiculo extends RecursoAgencia
       implements Registrable{
    
    private String tipoVehiculo;
    
    
    
     /**
     * Crea un nuevo vehiculo.
     *
     * @param nombre marca del vehiculo
     * @param identificador patente del vehiculo
     * @param tipoVehiculo tipo de vehiculo
     */
    public Vehiculo(
            String nombre,
            String identificador,
            String tipoVehiculo) {
    
    super(nombre, identificador);
        this.tipoVehiculo = tipoVehiculo;
    }    

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
        
    
    
     /**
     * Devuelve un resumen con la informacion del vehiculo.
     *
     * @return resumen del vehiculo
     */
    @Override
    public String mostrarResumen() {
        return "Vehículo: " + getNombre()
                + " | Identificador: " + getIdentificador()
                + " | Tipo: " + tipoVehiculo;    
        
   }

}