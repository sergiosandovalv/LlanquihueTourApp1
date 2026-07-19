
package model;

import exceptions.DatoInvalidoException;
import util.ValidadorDatos;

/**
 * Representa un vehiculo perteneciente a la agencia.
 * Almacena el tipo de vehiculo y permite mostrar
 * un resumen de su informacion.
 *
 * @author Sergio Sandoval
 */
public class Vehiculo extends RecursoAgencia
        implements Registrable {

    private String tipoVehiculo;
    private int capacidad;
    private boolean disponible;

    /**
     * Crea un nuevo vehiculo.
     *
     * @param nombre nombre del vehiculo
     * @param identificador patente del vehiculo
     * @param tipoVehiculo tipo de vehiculo
     * @throws DatoInvalidoException si algun dato obligatorio no es valido
     */
    public Vehiculo(
            String nombre,
            String identificador,
            String tipoVehiculo)
            throws DatoInvalidoException {

        super(nombre, identificador);

        this.tipoVehiculo = ValidadorDatos.validarTexto(
                tipoVehiculo,
                "Tipo de vehiculo");

        capacidad = 1;
        disponible = true;
    }

    public String getTipoVehiculo() {

        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo)
            throws DatoInvalidoException {

        this.tipoVehiculo = ValidadorDatos.validarTexto(
                tipoVehiculo,
                "Tipo de vehiculo");
    }

    public int getCapacidad() {

        return capacidad;
    }

    public void setCapacidad(int capacidad)
            throws DatoInvalidoException {

        this.capacidad = ValidadorDatos.validarNumeroPositivo(
                capacidad,
                "Capacidad");
    }

    public boolean isDisponible() {

        return disponible;
    }

    public void setDisponible(boolean disponible) {

        this.disponible = disponible;
    }

    /**
     * Devuelve un resumen con la informacion del vehiculo.
     *
     * @return resumen del vehiculo
     */
    @Override
    public String mostrarResumen() {

        String textoCapacidad;

        if (capacidad == 1) {
            textoCapacidad = capacidad + " pasajero";
        } else {
            textoCapacidad = capacidad + " pasajeros";
        }

        return "Vehículo: " + getNombre()
                + " | Patente: " + getIdentificador()
                + " | Tipo: " + tipoVehiculo
                + " | Capacidad: " + textoCapacidad
                + " | Disponible: "
                + (disponible ? "Sí" : "No");
    }

}