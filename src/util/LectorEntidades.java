
package util;

import exceptions.DatoInvalidoException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

/**
 * Clase encargada de leer entidades de la agencia
 * desde un archivo de texto.
 *
 * @author Sergio Sandoval
 */
public class LectorEntidades {

    /**
     * Lee un archivo de entidades y transforma cada linea
     * valida en un objeto que implementa la interfaz
     * Registrable. Las lineas con datos incorrectos son
     * informadas y omitidas.
     *
     * @param rutaArchivo ruta del archivo de entidades
     * @return lista de entidades cargadas
     */
    public static List<Registrable> cargarEntidades(
            String rutaArchivo) {

        List<Registrable> entidades
                = new ArrayList<>();

        int numeroLinea = 0;

        try (BufferedReader lector
                = new BufferedReader(
                        new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                numeroLinea++;

                if (linea.trim().isEmpty()) {
                    continue;
                }

                try {

                    String[] datos = linea.split(";", -1);

                    String tipo = datos[0].trim();

                    switch (tipo.toUpperCase()) {

                        case "GUIA":

                            if (datos.length != 7) {

                                System.out.println(
                                        "Error en línea "
                                        + numeroLinea
                                        + ": una guía debe tener 7 campos.");

                                continue;
                            }

                            GuiaTuristico guia
                                    = new GuiaTuristico(
                                            datos[1].trim(),
                                            datos[2].trim(),
                                            datos[3].trim());

                            guia.setTelefono(
                                    datos[4].trim());

                            guia.setCorreo(
                                    datos[5].trim());

                            guia.setDisponible(
                                    convertirDisponibilidad(
                                            datos[6]));

                            entidades.add(guia);

                            break;

                        case "VEHICULO":

                            if (datos.length != 6) {

                                System.out.println(
                                        "Error en línea "
                                        + numeroLinea
                                        + ": un vehículo debe tener 6 campos.");

                                continue;
                            }

                            Vehiculo vehiculo
                                    = new Vehiculo(
                                            datos[1].trim(),
                                            datos[2].trim(),
                                            datos[3].trim());

                            vehiculo.setCapacidad(
                                    Integer.parseInt(
                                            datos[4].trim()));

                            vehiculo.setDisponible(
                                    convertirDisponibilidad(
                                            datos[5]));

                            entidades.add(vehiculo);

                            break;

                        case "COLABORADOR":

                            if (datos.length != 4) {

                                System.out.println(
                                        "Error en línea "
                                        + numeroLinea
                                        + ": un colaborador debe tener 4 campos.");

                                continue;
                            }

                            ColaboradorExterno colaborador
                                    = new ColaboradorExterno(
                                            datos[1].trim(),
                                            datos[2].trim(),
                                            datos[3].trim());

                            entidades.add(colaborador);

                            break;

                        default:

                            System.out.println(
                                    "Error en línea "
                                    + numeroLinea
                                    + ": tipo de entidad desconocido: "
                                    + tipo);
                    }

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Error en línea "
                            + numeroLinea
                            + ": la capacidad debe ser un número válido.");

                } catch (DatoInvalidoException e) {

                    System.out.println(
                            "Error en línea "
                            + numeroLinea
                            + ": "
                            + e.getMessage());
                }
            }

        } catch (IOException e) {

            System.out.println(
                    "Error al leer el archivo "
                    + rutaArchivo
                    + ": "
                    + e.getMessage());
        }

        return entidades;
    }

    /**
     * Convierte el texto SI o NO en un valor booleano.
     *
     * @param valor texto que representa la disponibilidad
     * @return true si el valor es SI, false si es NO
     * @throws DatoInvalidoException si el texto es distinto de SI o NO
     */
    private static boolean convertirDisponibilidad(
            String valor)
            throws DatoInvalidoException {

        String disponibilidad
                = valor.trim().toUpperCase();

        if (disponibilidad.equals("SI")) {
            return true;
        }

        if (disponibilidad.equals("NO")) {
            return false;
        }

        throw new DatoInvalidoException(
                "La disponibilidad debe ser SI o NO.");
    }
}
