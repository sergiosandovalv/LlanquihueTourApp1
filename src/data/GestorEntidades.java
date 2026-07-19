
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import model.ColaboradorExterno;
import model.ExcursionCultural;
import model.GuiaTuristico;
import model.Marcable;
import model.PaseoLacustre;
import model.Registrable;
import model.RutaGastronomica;
import model.Vehiculo;

/**
 * Administra la coleccion de entidades registradas
 * en el sistema Llanquihue Tour.
 *
 * @author Sergio Sandoval
 */
public class GestorEntidades {

    private final List<Registrable> entidades;

    /**
     * Crea un nuevo gestor de entidades.
     */
    public GestorEntidades() {

        entidades = new ArrayList<>();
    }

    /**
     * Agrega una entidad a la coleccion.
     *
     * @param entidad entidad a registrar
     * @throws NullPointerException si la entidad es nula
     */
    public void agregarEntidad(Registrable entidad) {

        Objects.requireNonNull(
                entidad,
                "La entidad no puede ser nula");

        entidades.add(entidad);
    }

    /**
     * Devuelve la coleccion de entidades registradas.
     *
     * @return lista de entidades
     */
    public List<Registrable> getEntidades() {

        return entidades;
    }

    /**
     * Muestra el resumen de todas las entidades
     * registradas, identifica su tipo y ejecuta
     * el registro de asistencia cuando corresponde.
     */
    public void mostrarEntidades() {

        for (Registrable entidad : entidades) {

            System.out.println(entidad.mostrarResumen());

            mostrarTipoEntidad(entidad);

            if (entidad instanceof Marcable entidadMarcable) {

                entidadMarcable.marcarEntrada();
                entidadMarcable.marcarSalida();

            } else {

                System.out.println(
                        "Esta entidad no registra asistencia");
            }

            System.out.println(
                    "------------------------------");
        }
    }

    /**
     * Identifica y muestra el tipo de una entidad.
     *
     * @param entidad entidad que se desea identificar
     */
    private void mostrarTipoEntidad(Registrable entidad) {

        if (entidad instanceof ExcursionCultural) {

            System.out.println(
                    "Tipo identificado: Excursión cultural");

        } else if (entidad instanceof PaseoLacustre) {

            System.out.println(
                    "Tipo identificado: Paseo lacustre");

        } else if (entidad instanceof RutaGastronomica) {

            System.out.println(
                    "Tipo identificado: Ruta gastronómica");

        } else if (entidad instanceof GuiaTuristico) {

            System.out.println(
                    "Tipo identificado: Guía turístico");

        } else if (entidad instanceof Vehiculo) {

            System.out.println(
                    "Tipo identificado: Vehículo");

        } else if (entidad instanceof ColaboradorExterno) {

            System.out.println(
                    "Tipo identificado: Colaborador externo");

        } else {

            System.out.println(
                    "Tipo identificado: Entidad registrable");
        }
    }
 }


    
   
    

