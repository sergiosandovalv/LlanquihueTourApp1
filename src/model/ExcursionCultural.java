
package model;

import exceptions.DatoInvalidoException;
import util.ValidadorDatos;

/**
 * Clase que representa una excursion cultural.
 * Hereda los atributos de ServicioTuristico y agrega
 * el lugar historico que se visita durante el recorrido.
 *
 * @author Sergio Sandoval
 */
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    /**
     * Construye una nueva excursion cultural.
     *
     * @param nombre nombre de la excursion cultural
     * @param duracionHoras duracion del recorrido en horas
     * @param lugarHistorico lugar historico que se visita
     * @throws DatoInvalidoException si algun dato obligatorio no es valido
     */
    public ExcursionCultural(
            String nombre,
            int duracionHoras,
            String lugarHistorico)
            throws DatoInvalidoException {

        super(nombre, duracionHoras);

        this.lugarHistorico = ValidadorDatos.validarTexto(
                lugarHistorico,
                "Lugar historico");
    }

    public String getLugarHistorico() {

        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico)
            throws DatoInvalidoException {

        this.lugarHistorico = ValidadorDatos.validarTexto(
                lugarHistorico,
                "Lugar historico");
    }

    /**
     * Devuelve la informacion de la excursion cultural.
     *
     * @return informacion resumida del servicio
     */
    @Override
    public String mostrarResumen() {

        return "Excursión cultural: " + getNombre()
                + " | Lugar histórico: " + lugarHistorico
                + " | Duración: "
                + getDuracionHoras() + " horas";
    }

    /**
     * Devuelve la informacion completa de la excursion cultural.
     *
     * @return informacion completa de la excursion
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nLugar histórico: "
                + lugarHistorico;
    }

}