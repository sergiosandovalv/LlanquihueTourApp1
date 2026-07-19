package model;

import exceptions.DatoInvalidoException;
import util.ValidadorDatos;

/**
 * Clase que representa una ruta gastronomica.
 * Hereda los atributos de ServicioTuristico y agrega
 * la cantidad de restaurantes incluidos en el recorrido.
 *
 * @author Sergio Sandoval
 */
public class RutaGastronomica extends ServicioTuristico {

    private int cantidadRestaurantes;

    /**
     * Construye una nueva ruta gastronomica.
     *
     * @param nombre nombre de la ruta gastronomica
     * @param duracionHoras duracion del recorrido en horas
     * @param cantidadRestaurantes cantidad de restaurantes incluidos
     * @throws DatoInvalidoException si algun dato obligatorio no es valido
     */
    public RutaGastronomica(
            String nombre,
            int duracionHoras,
            int cantidadRestaurantes)
            throws DatoInvalidoException {

        super(nombre, duracionHoras);

        this.cantidadRestaurantes =
                ValidadorDatos.validarNumeroPositivo(
                        cantidadRestaurantes,
                        "Cantidad de restaurantes"
                );
    }

    public int getCantidadRestaurantes() {

        return cantidadRestaurantes;
    }

    public void setCantidadRestaurantes(int cantidadRestaurantes)
            throws DatoInvalidoException {

        this.cantidadRestaurantes =
                ValidadorDatos.validarNumeroPositivo(
                        cantidadRestaurantes,
                        "Cantidad de restaurantes"
                );
    }

    /**
     * Devuelve la informacion de la ruta gastronomica.
     *
     * @return informacion completa del servicio
     */
    @Override
    public String mostrarResumen() {

        return "Ruta gastronómica: " + getNombre()
                + " | Restaurantes: " + cantidadRestaurantes
                + " | Duración: "
                + getDuracionHoras() + " horas";
    }

    /**
     * Devuelve la informacion completa de la ruta gastronomica.
     *
     * @return informacion completa de la ruta
     */
    @Override
    public String toString() {

        return super.toString()
                + "\nCantidad de restaurantes: "
                + cantidadRestaurantes;
    }

}