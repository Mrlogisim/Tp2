package Modelo;

/**
 * Clase que representa a un empleado de la empresa
 * 
 * @author Grupo G POOll 2024
 * @version 2.0
 */
public class Aeropuerto {

    /**
     * Codigo unico
     */
    private String codigo;
    /**
     * Nombre del aeropuerto
     */
    private String nombre;
    /**
     * Ciudad del aeropuerto
     * 
     */
    private String ciudad;

    /**
     * Constructor de la clase Aeropuerto
     * 
     * @param codigo codigo unico de Aeropuerto
     * @param nombre nombre de aeropuerto
     * @param ciudad ciudad de aeropuerto
     */
    public Aeropuerto(String codigo, String nombre, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    /**
     * Obtiene nombre del aeropuerto
     * 
     * @return nombre del aeropuerto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene codigo del aeropuerto
     * 
     * @return codigo del aeropuerto
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtiene la ciudad del aeropuerto
     * 
     * @return ciudad del aeropuerto
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece el codigo
     * 
     * @param codigo Establece el codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Establece el nombre
     * 
     * @param nombre Establece el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la ciudad
     * 
     * @param ciudad Establece la ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
