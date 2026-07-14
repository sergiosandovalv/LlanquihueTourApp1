
package data;

import java.util.ArrayList;
import model.Registrable;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;
import model.Marcable;

/**
* Administra la coleccion de entidades registradas
* en el sistema Llanquihue Tour.
*
* @author Sergio Sandoval
*/
public class GestorEntidades {
    
    private final ArrayList<Registrable> entidades;
    
    
    
    /**
    * Crea un nuevo gestor de entidades.
    */
    public GestorEntidades() {
        entidades = new ArrayList<>();
    }
    
    
    /**
    * Agrega una entidad a la coleccion.
    *
    * @param entidad  entidad a registrar
    */
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }
    
    

    
    /**
    * Devuelve la coleccion de entidades registradas.
    *
    * @return lista de entidades
    */
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }
    
        
    /**
    * Muestra el resumen de todas las entidades
    * registradas e identifica su tipo.
    */
    public void mostrarEntidades() {

    for (Registrable entidad : entidades) {

        System.out.println(entidad.mostrarResumen());

        if (entidad instanceof ExcursionCultural) {
            System.out.println("Tipo identificado: Excursión cultural");

        } else if (entidad instanceof PaseoLacustre) {
            System.out.println("Tipo identificado: Paseo lacustre");

        } else if (entidad instanceof RutaGastronomica) {
            System.out.println("Tipo identificado: Ruta gastronómica");

        } else if (entidad instanceof GuiaTuristico) {
            System.out.println("Tipo identificado: Guía turístico");

        } else if (entidad instanceof Vehiculo) {
            System.out.println("Tipo identificado: Vehículo");

        } else if (entidad instanceof ColaboradorExterno) {
            System.out.println("Tipo identificado: Colaborador externo");
        }

        if (entidad instanceof Marcable) {
            Marcable entidadMarcable = (Marcable) entidad;
            entidadMarcable.marcarEntrada();
            entidadMarcable.marcarSalida();
        } else {
            System.out.println("Esta entidad no registra asistencia");
        }

        System.out.println("------------------------------");
    }

  }

}
    
   
    

