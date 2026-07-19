
package model;

import exceptions.DatoInvalidoException;
import util.ValidadorDatos;

/**
 * Representa un guia turistico de la agencia.
 * Almacena la especialidad del guia y permite
 * mostrar un resumen de su informacion.
 *
 * @author Sergio Sandoval
 */
public class GuiaTuristico extends RecursoAgencia
        implements Registrable, Marcable {

    private String especialidad;
    private String telefono;
    private String correo;
    private boolean disponible;

    /**
     * Crea un nuevo guia turistico.
     *
     * @param nombre nombre del guia
     * @param identificador codigo unico del guia
     * @param especialidad area de especializacion
     * @throws DatoInvalidoException si algun dato obligatorio no es valido
     */
    public GuiaTuristico(
            String nombre,
            String identificador,
            String especialidad)
            throws DatoInvalidoException {

        super(nombre, identificador);

        this.especialidad = ValidadorDatos.validarTexto(
                especialidad,
                "Especialidad"
        );

        telefono = "Sin registrar";
        correo = "Sin registrar";
        disponible = true;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad)
            throws DatoInvalidoException {

        this.especialidad = ValidadorDatos.validarTexto(
                especialidad,
                "Especialidad"
        );
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono)
            throws DatoInvalidoException {

        this.telefono = ValidadorDatos.validarTexto(
                telefono,
                "Telefono"
        );
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo)
            throws DatoInvalidoException {

        this.correo = ValidadorDatos.validarTexto(
                correo,
                "Correo"
        );
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Devuelve un resumen con la informacion del guia.
     *
     * @return resumen del guia turistico
     */
    @Override
    public String mostrarResumen() {

        return "Guía turístico: " + getNombre()
                + " | Identificador: " + getIdentificador()
                + " | Especialidad: " + especialidad
                + " | Teléfono: " + telefono
                + " | Correo: " + correo
                + " | Disponible: "
                + (disponible ? "Sí" : "No");
    }

    /**
     * Registra la entrada del guia.
     */
    @Override
    public void marcarEntrada() {

        System.out.println(
                "Entrada registrada para el guía: " + getNombre()
        );
    }

    /**
     * Registra la salida del guia.
     */
    @Override
    public void marcarSalida() {

        System.out.println(
                "Salida registrada para el guía: " + getNombre());
    }
}
