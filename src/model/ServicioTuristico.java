package model;

import exceptions.DatoInvalidoException;
import util.ValidadorDatos;

/**
 * Clase base que representa un servicio turistico.
 * Contiene los atributos comunes para todos
 * los servicios turisticos.
 *
 * @author Sergio Sandoval
 */
public abstract class ServicioTuristico implements Registrable {

    private String nombre;
    private int duracionHoras;
    private int precio;
    private boolean disponible;

    /**
     * Construye un nuevo servicio turistico.
     *
     * @param nombre nombre del servicio turistico
     * @param duracionHoras duracion del servicio en horas
     * @throws DatoInvalidoException si algun dato obligatorio no es valido
     */
    public ServicioTuristico(
            String nombre,
            int duracionHoras)
            throws DatoInvalidoException {

        this.nombre = ValidadorDatos.validarTexto(
                nombre,
                "Nombre del servicio");

        this.duracionHoras = ValidadorDatos.validarNumeroPositivo(
                duracionHoras,
                "Duracion");

        precio = 1;
        disponible = true;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre)
            throws DatoInvalidoException {

        this.nombre = ValidadorDatos.validarTexto(
                nombre,
                "Nombre del servicio");
    }

    public int getDuracionHoras() {

        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras)
            throws DatoInvalidoException {

        this.duracionHoras = ValidadorDatos.validarNumeroPositivo(
                duracionHoras,
                "Duracion");
    }

    public int getPrecio() {

        return precio;
    }

    public void setPrecio(int precio)
            throws DatoInvalidoException {

        this.precio = ValidadorDatos.validarNumeroPositivo(
                precio,
                "Precio");
    }

    public boolean isDisponible() {

        return disponible;
    }

    public void setDisponible(boolean disponible) {

        this.disponible = disponible;
    }

    /**
     * Muestra en consola la informacion del servicio turistico.
     */
    public void mostrarInformacion() {

        System.out.println(this);
    }

    /**
     * Devuelve un resumen especifico del servicio turistico.
     *
     * @return resumen del servicio turistico
     */
    @Override
    public abstract String mostrarResumen();

    /**
     * Devuelve la informacion general del servicio turistico.
     *
     * @return informacion del servicio turistico
     */
    @Override
    public String toString() {

        return "===== SERVICIO TURÍSTICO ====="
                + "\nNombre: " + nombre
                + "\nDuración: " + duracionHoras + " horas"
                + "\nPrecio: $" + precio
                + "\nDisponible: "
                + (disponible ? "Sí" : "No");
    }

} 
   
  
    

