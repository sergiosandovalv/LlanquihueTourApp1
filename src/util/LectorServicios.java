
package util;

import exceptions.DatoInvalidoException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase encargada de leer servicios turisticos
 * desde un archivo de texto.
 *
 * @author Sergio Sandoval
 */
public class LectorServicios {

    /**
     * Lee un archivo de servicios y transforma cada linea
     * valida en un objeto de tipo ServicioTuristico.
     * Las lineas con datos incorrectos son informadas
     * y omitidas.
     *
     * @param rutaArchivo ruta del archivo que se desea leer
     * @return lista de servicios turisticos cargados
     */
    public static List<ServicioTuristico> cargarServicios(
            String rutaArchivo) {

        List<ServicioTuristico> servicios
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

                    if (datos.length != 5) {

                        System.out.println(
                                "Error en línea "
                                + numeroLinea
                                + ": se esperaban 5 campos.");

                        continue;
                    }

                    String tipo = datos[0].trim();
                    String nombre = datos[1].trim();

                    int duracion
                            = Integer.parseInt(
                                    datos[2].trim());

                    String datoEspecifico
                            = datos[3].trim();

                    int precio
                            = Integer.parseInt(
                                    datos[4].trim());

                    ServicioTuristico servicio;

                    switch (tipo.toUpperCase()) {

                        case "RUTA":

                            int cantidadRestaurantes
                                    = Integer.parseInt(
                                            datoEspecifico);

                            servicio
                                    = new RutaGastronomica(
                                            nombre,
                                            duracion,
                                            cantidadRestaurantes);

                            break;

                        case "PASEO":

                            servicio
                                    = new PaseoLacustre(
                                            nombre,
                                            duracion,
                                            datoEspecifico);

                            break;

                        case "EXCURSION":

                            servicio
                                    = new ExcursionCultural(
                                            nombre,
                                            duracion,
                                            datoEspecifico);

                            break;

                        default:

                            System.out.println(
                                    "Error en línea "
                                    + numeroLinea
                                    + ": tipo de servicio desconocido: "
                                    + tipo);

                            continue;
                    }

                    servicio.setPrecio(precio);

                    servicios.add(servicio);

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Error en línea "
                            + numeroLinea
                            + ": uno de los valores numéricos "
                            + "no tiene un formato válido.");

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

        return servicios;
    }
}
