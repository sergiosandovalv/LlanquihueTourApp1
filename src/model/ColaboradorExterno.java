
package model;

import exceptions.DatoInvalidoException;
import util.ValidadorDatos;

/**
 * Representa un colaborador externo de la agencia.
 * Almacena la empresa a la que pertenece y permite
 * mostrar un resumen de su informacion.
 *
 * @author Sergio Sandoval
 */
public class ColaboradorExterno extends RecursoAgencia
        implements Registrable, Marcable {

    private String empresa;

    /**
     * Crea un nuevo colaborador externo.
     *
     * @param nombre nombre del colaborador
     * @param identificador codigo del colaborador
     * @param empresa empresa a la que pertenece
     * @throws DatoInvalidoException si algun dato obligatorio no es valido
     */
    public ColaboradorExterno(
            String nombre,
            String identificador,
            String empresa)
            throws DatoInvalidoException {

        super(nombre, identificador);

        this.empresa = ValidadorDatos.validarTexto(
                empresa,
                "Empresa");
    }

    public String getEmpresa() {

        return empresa;
    }

    public void setEmpresa(String empresa)
            throws DatoInvalidoException {

        this.empresa = ValidadorDatos.validarTexto(
                empresa,
                "Empresa");
    }

    /**
     * Devuelve un resumen con la informacion del colaborador.
     *
     * @return resumen del colaborador
     */
    @Override
    public String mostrarResumen() {

        return "Colaborador externo: " + getNombre()
                + " | Identificador: " + getIdentificador()
                + " | Empresa: " + empresa;
    }

    /**
     * Registra la entrada del colaborador.
     */
    @Override
    public void marcarEntrada() {

        System.out.println(
                "Entrada registrada para el colaborador: "
                + getNombre());
    }

    /**
     * Registra la salida del colaborador.
     */
    @Override
    public void marcarSalida() {

        System.out.println(
                "Salida registrada para el colaborador: "
                + getNombre());
    }
} 
    
    
    
    

