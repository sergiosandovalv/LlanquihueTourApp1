
package model;

/**
* Representa un guia turistico de la agencia.
* Almacena la especialidad del guia y permite
* mostrar un resumen de su informacion.
*
* @author Sergio Sandoval
*/
public class GuiaTuristico extends RecursoAgencia
        implements Registrable, Marcable {
    private String especialidad;
    
/**
* Crea un nuevo guia turistico.
*
* @param nombre nombre del guia
* @param identificador codigo unico del guia
* @param especialidad area de especializacion
*/
public GuiaTuristico(String nombre,
                         String identificador,
                         String especialidad) {

        super(nombre, identificador);
        this.especialidad = especialidad;
    }

public String getEspecialidad() {
        return especialidad;
    }

public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


/**
* Devuelve un resumen con la informacion del guia.
*
* @return resumen del guia turistico
*/    
@Override
public String mostrarResumen() {
        return "Guía turístico: " + getNombre()
                + " | Identificador: " + getIdentificador()
                + " | Especialidad: " + especialidad;
    }
    
/**
* Registra la entrada del guia.
*/
@Override
public void marcarEntrada() {
    System.out.println("Entrada registrada para el guía: "
            + getNombre());
}

/**
* Registra la salida del guia.
*/
@Override
public void marcarSalida() {
    System.out.println("Salida registrada para el guía: "
            + getNombre());
   }
}
