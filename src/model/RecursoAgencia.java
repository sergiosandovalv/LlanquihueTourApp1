
package model;

import exceptions.DatoInvalidoException;
import util.ValidadorDatos;

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
     * @throws DatoInvalidoException si los datos no son validos
     */
    public RecursoAgencia(
            String nombre,
            String identificador)
            throws DatoInvalidoException {

        this.nombre = ValidadorDatos.validarTexto(
                nombre,
                "El nombre"
        );

        this.identificador = ValidadorDatos.validarTexto(
                identificador,
                "El identificador"
        );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)
            throws DatoInvalidoException {

        this.nombre = ValidadorDatos.validarTexto(
                nombre,
                "El nombre"
        );
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador)
            throws DatoInvalidoException {

        this.identificador = ValidadorDatos.validarTexto(
                identificador,
                "El identificador");
    }
}
    
   
    
    

