package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de administrar una coleccion de
 * servicios turisticos y demostrar el uso del
 * polimorfismo mediante una lista de objetos.
 *
 * @author Sergio Sandoval
 */
public class GestorServicios {

/**
* Crea y muestra servicios turisticos aplicando polimorfismo.
*/
    public void mostrarServicios() {

        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                "Ruta Sabores del Sur", 4, 5));

        servicios.add(new RutaGastronomica(
                "Ruta Gastronomica Llanquihue", 3, 4));

        servicios.add(new PaseoLacustre(
                "Paseo por el Lago Llanquihue", 2, "Lancha turistica"));

        servicios.add(new PaseoLacustre(
                "Navegacion a Puerto Varas", 3, "Catamaran"));

        servicios.add(new ExcursionCultural(
                "Excursion Patrimonial Frutillar", 4, "Teatro del Lago"));

        servicios.add(new ExcursionCultural(
                "Recorrido Historico Puerto Octay", 3, "Casa Niklitschek"));

        System.out.println("===== SERVICIOS TURÍSTICOS LLANQUIHUE TOUR =====");
        System.out.println();

        
// Recorre la lista de servicios turisticos y muestra su informacion
        
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
            System.out.println();
        }
    }
}