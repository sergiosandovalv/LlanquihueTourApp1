package data;

import java.util.List;

import model.Registrable;
import model.ServicioTuristico;
import util.LectorEntidades;
import util.LectorServicios;

/**
 * Clase encargada de administrar una coleccion de
 * servicios turisticos y demostrar el uso del
 * polimorfismo mediante una lista de objetos.
 *
 * @author Sergio Sandoval
 */
public class GestorServicios {

    /**
     * Carga los servicios turisticos y las entidades
     * desde sus respectivos archivos, muestra la
     * informacion de los servicios y posteriormente
     * el resumen de todas las entidades registradas.
     */
    public void mostrarServicios() {

        // Carga los servicios turisticos desde el archivo.
        List<ServicioTuristico> servicios
                = LectorServicios.cargarServicios(
                        "src/resources/servicios.txt");

        // Carga las entidades desde el archivo.
        List<Registrable> entidades
                = LectorEntidades.cargarEntidades(
                        "src/resources/entidades.txt");

        GestorEntidades gestorEntidades
                = new GestorEntidades();

        // Agrega las entidades cargadas al gestor.
        for (Registrable entidad : entidades) {

            gestorEntidades.agregarEntidad(entidad);
        }

        System.out.println(
                "===== SERVICIOS TURÍSTICOS "
                + "LLANQUIHUE TOUR =====");

        System.out.println();

        // Recorre y muestra los servicios mediante polimorfismo.
        for (ServicioTuristico servicio : servicios) {

            gestorEntidades.agregarEntidad(servicio);

            servicio.mostrarInformacion();

            System.out.println();
        }

        System.out.println(
                "===== RESUMEN DE ENTIDADES =====");

        System.out.println();

        gestorEntidades.mostrarEntidades();
    }

 }
