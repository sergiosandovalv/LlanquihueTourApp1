
package exceptions;

/**
 * Excepcion utilizada cuando un dato ingresado
 * no cumple las reglas del sistema.
 *
 * @author Sergio Sandoval
 */
public class DatoInvalidoException extends Exception {

    /**
     * Construye una nueva excepcion con un mensaje descriptivo.
     *
     * @param mensaje descripcion del error ocurrido
     */
    public DatoInvalidoException(String mensaje) {

        super(mensaje);
    }
  
    
}
