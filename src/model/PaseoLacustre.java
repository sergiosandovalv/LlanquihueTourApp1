
package model;

import exceptions.DatoInvalidoException;
import util.ValidadorDatos;

/**
 * Clase que representa un paseo lacustre.
 * Hereda los atributos de ServicioTuristico y agrega
 * el tipo de embarcacion utilizada en el recorrido.
 *
 * @author Sergio Sandoval
 */
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    /**
     * Construye un nuevo paseo lacustre.
     *
     * @param nombre nombre del paseo
     * @param duracionHoras duracion del paseo en horas
     * @param tipoEmbarcacion tipo de embarcacion
     * @throws DatoInvalidoException si algun dato obligatorio no es valido
     */
    public PaseoLacustre(
            String nombre,
            int duracionHoras,
            String tipoEmbarcacion)
            throws DatoInvalidoException {

        super(nombre, duracionHoras);

        this.tipoEmbarcacion = ValidadorDatos.validarTexto(
                tipoEmbarcacion,
                "Tipo de embarcacion"
        );
    }

    public String getTipoEmbarcacion() {

        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion)
            throws DatoInvalidoException {

        this.tipoEmbarcacion = ValidadorDatos.validarTexto(
                tipoEmbarcacion,
                "Tipo de embarcacion"
        );
    }

    /**
     * Devuelve la informacion del paseo lacustre.
     *
     * @return informacion completa del servicio
     */
    @Override
    public String mostrarResumen() {

        return "Paseo lacustre: " + getNombre()
                + " | Embarcación: " + tipoEmbarcacion
                + " | Duración: "
                + getDuracionHoras() + " horas";
    }

    /**
     * Devuelve la informacion completa del paseo lacustre.
     *
     * @return informacion completa del paseo
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nTipo de embarcación: "
                + tipoEmbarcacion;
    }
    
}

