
package model;

/**
 * Representa un recurso general perteneciente a la agencia turistica.
 * Contiene los datos comunes utilizados por guias, vehiculos
 * y colaboradores externos.
 *
 * @author Sergio Sandoval
 */

public class RecursoAgencia {
    private String nombre;
    private String identificador;
    
    
/**
* Construye un recurso de la agencia.
*
* @param nombre nombre o descripcion del recurso
* @param identificador codigo unico del recurso
*/    

public RecursoAgencia(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
    
   
    
    

