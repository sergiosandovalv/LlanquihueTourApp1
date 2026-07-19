
package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

/**
 * Permite guardar entidades en el archivo
 * entidades.txt.
 *
 * @author Sergio Sandoval
 */
public class EscritorEntidades {

    /**
     * Guarda una entidad al final del archivo.
     *
     * @param entidad entidad que se desea guardar
     */
    public static void guardarEntidad(Registrable entidad) {

        if (entidad == null) {
            System.out.println(
                    "No se puede guardar una entidad nula.");
            return;
        }

        String linea = convertirLinea(entidad);

        if (linea.isEmpty()) {
            System.out.println(
                    "El tipo de entidad no puede ser guardado.");
            return;
        }

        try (BufferedWriter escritor =
                new BufferedWriter(
                        new FileWriter(
                                "src/resources/entidades.txt",
                                true))) {

            escritor.write(linea);
            escritor.newLine();

        } catch (IOException e) {

            System.out.println(
                    "Error al guardar la entidad: "
                    + e.getMessage());
        }
    }

    /**
     * Convierte una entidad al formato utilizado
     * por el archivo.
     *
     * @param entidad entidad a convertir
     * @return linea lista para guardar
     */
    private static String convertirLinea(
            Registrable entidad) {

        if (entidad instanceof GuiaTuristico guia) {

            return String.format(
                    "GUIA;%s;%s;%s;%s;%s;%s",
                    guia.getNombre(),
                    guia.getIdentificador(),
                    guia.getEspecialidad(),
                    guia.getTelefono(),
                    guia.getCorreo(),
                    guia.isDisponible()
                            ? "SI"
                            : "NO");
        }

        if (entidad instanceof Vehiculo vehiculo) {

            return String.format(
                    "VEHICULO;%s;%s;%s;%d;%s",
                    vehiculo.getNombre(),
                    vehiculo.getIdentificador(),
                    vehiculo.getTipoVehiculo(),
                    vehiculo.getCapacidad(),
                    vehiculo.isDisponible()
                            ? "SI"
                            : "NO");
        }

        if (entidad instanceof ColaboradorExterno colaborador) {

            return String.format(
                    "COLABORADOR;%s;%s;%s",
                    colaborador.getNombre(),
                    colaborador.getIdentificador(),
                    colaborador.getEmpresa());
        }

        return "";
    }
}
