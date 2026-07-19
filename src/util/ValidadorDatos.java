
package util;

import exceptions.DatoInvalidoException;

/**
 * Contiene metodos reutilizables para validar datos.
 *
 * @author Sergio Sandoval
 */
public class ValidadorDatos {

    /**
     * Valida que un texto no sea nulo ni este vacio.
     *
     * @param valor texto a validar
     * @param nombreCampo nombre del campo validado
     * @return texto sin espacios al inicio ni al final
     * @throws DatoInvalidoException si el texto es invalido
     */
    public static String validarTexto(
            String valor,
            String nombreCampo)
            throws DatoInvalidoException {

        if (valor == null || valor.trim().isEmpty()) {
            throw new DatoInvalidoException(
                    nombreCampo + " no puede estar vacío.");
        }

        return valor.trim();
    }

    /**
     * Valida que un numero sea mayor que cero.
     *
     * @param valor numero a validar
     * @param nombreCampo nombre del campo validado
     * @return numero validado
     * @throws DatoInvalidoException si el numero no es valido
     */
    public static int validarNumeroPositivo(
            int valor,
            String nombreCampo)
            throws DatoInvalidoException {

        if (valor <= 0) {
            throw new DatoInvalidoException(
                    nombreCampo + " debe ser mayor que cero.");
        }

        return valor;
    }
}

