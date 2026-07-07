package ui;

import data.GestorServicios;

/**
 * Clase principal del sistema.
 * Ejecuta la demostracion de los servicios turisticos
 * utilizando polimorfismo.
 *
 * @author Sergio Sandoval
 */


public class Main {

/**
* Metodo principal que inicia la ejecucion del sistema.
*
* @param args Argumentos de la linea de comandos.
*/    

    public static void main(String[] args) {
       
        GestorServicios gestor = new GestorServicios();
        gestor.mostrarServicios();
    }
    
}
