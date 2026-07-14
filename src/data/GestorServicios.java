package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;
import java.util.ArrayList;
import java.util.List;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;

/**
 * Clase encargada de administrar una coleccion de
 * servicios turisticos y demostrar el uso del
 * polimorfismo mediante una lista de objetos.
 *
 * @author Sergio Sandoval
 */
public class GestorServicios {

/**
* 
*/
    public void mostrarServicios() {

        List<ServicioTuristico> servicios = new ArrayList<>();
        
        GestorEntidades gestorEntidades = new GestorEntidades();
        
        gestorEntidades.agregarEntidad(
        new GuiaTuristico(
                "Pedro González",
                "GUIA-001",
                "Turismo aventura"));

        gestorEntidades.agregarEntidad(
        new Vehiculo(
                "Minibús Llanquihue Tour",
                "VEH-001",
                "Minibús"));

        gestorEntidades.agregarEntidad(
        new ColaboradorExterno(
                "Carolina Soto",
                "COL-001",
                "Servicios Turísticos del Sur"));

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

        
    // Recorre la lista y muestra la información      


    for (ServicioTuristico servicio : servicios) {

    gestorEntidades.agregarEntidad(servicio);

    servicio.mostrarInformacion();
    System.out.println();
    
           
     }

    // Muestra una sola vez el resumen de todas las entidades
    System.out.println("===== RESUMEN DE ENTIDADES =====");
    System.out.println();

    gestorEntidades.mostrarEntidades();


   }
    
}

