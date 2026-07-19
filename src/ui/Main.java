package ui;

import data.GestorServicios;

/**
 * Clase principal del sistema.
 * Inicia la ejecucion de la aplicacion
 * Llanquihue Tour.
 *
 * @author Sergio Sandoval
 */
public class Main {

    /**
     * Metodo principal que inicia la ejecucion
     * de la aplicacion.
     *
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();
        gestor.mostrarServicios();
    }
}