
package model;

/**
 * Define las operaciones para registrar
 * la entrada y salida de una entidad.
 *
 * @author Sergio Sandoval
 */

public interface Marcable {
    
    /**
    * Registra la entrada de la entidad.
    */
    void marcarEntrada();
    
    /**
    * Registra la salida de la entidad.
    */
    void marcarSalida();
}
