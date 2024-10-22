package Modelo;

/**
 * Clase que representa al Avion
 * 
 * @author Grupo G POOll 2024
 * @version 2.0
 */
public class Avion {

    private String modelo;
    private int capacidadMaxima;
    private String aerolinea;

    /**
     * Constructor de la clase Avion.
     * 
     * @param modelo          El modelo del avión.
     * @param capacidadMaxima La capacidad máxima del avión.
     * @param aerolinea       La aerolínea a la que pertenece el avión.
     */
    public Avion(String modelo, int capacidadMaxima, String aerolinea) {
        /**
         * Modelo de avion
         */
        this.modelo = modelo;
        /**
         * Capac maxima del avion
         */
        this.capacidadMaxima = capacidadMaxima;
        /**
         * Aerolinea del avion
         */
        this.aerolinea = aerolinea;
    }

    /**
     * Obtiene la capacidad máxima del avión.
     * 
     * @return La capacidad máxima del avión.
     */
    public int obtenerCapacidad() {
        return capacidadMaxima;
    }

    /**
     * Obtiene el modelo del avión.
     * 
     * @return El modelo del avión.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene la aerolínea del avión.
     * 
     * @return La aerolínea del avión.
     */
    public String getAerolinea() {
        return aerolinea;
    }

    /**
     * Establece el modelo del avión.
     * 
     * @param modelo El modelo a establecer.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Establece la capacidad máxima del avión.
     * 
     * @param capacidadMaxima La capacidad máxima a establecer.
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Establece la aerolinea del avión.
     * 
     * @param aerolinea aerolinea.
     */
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

}
