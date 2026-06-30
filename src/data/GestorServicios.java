
package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

/**
 * Clase encargada de crear servicios turiticos
 *
 * @author Sergio Sandoval
 */

public class GestorServicios {

    
/**
* Crea y muestra servicios turiticos
* 
*/
    
public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Ruta Sabores del Sur", 4, 5);

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta Gastronómica Llanquihue", 3, 4);

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Paseo por el Lago Llanquihue", 2, "Lancha turística");

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Navegación a Puerto Varas", 3, "Catamarán");

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Excursión Patrimonial Frutillar", 4, "Teatro del Lago");

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Recorrido Histórico Puerto Octay", 3, "Casa Niklitschek");

        System.out.println("===== RUTAS GASTRONÓMICAS =====");
        System.out.println();
        System.out.println(ruta1);
        System.out.println();
        System.out.println(ruta2);

        System.out.println("\n===== PASEOS LACUSTRES =====");
        System.out.println();
        System.out.println(paseo1);
        System.out.println();
        System.out.println(paseo2);

        System.out.println("\n===== EXCURSIONES CULTURALES =====");
        System.out.println();
        System.out.println(excursion1);
        System.out.println();
        System.out.println(excursion2);
    }    
    
}
