package Modelo;

/**
 * Clase que representa al Asiento
 * 
 * @author Grupo G POOll 2024
 * @version 2.0
 */
public class Asiento {
    /**
     * Codigo unico de asiento
     */
    private String numeroAsiento;
    /**
     * Clase
     */
    private String clase;
    /**
     * Cliente asignado al asiento
     */
    private Cliente clienteAsignado;

    /**
     * Constructor de la clase Asiento
     * 
     * @param numeroAsiento Num asiento
     * @param clase         clase al que pertenece el asiento
     */
    public Asiento(String numeroAsiento, String clase) {
        this.numeroAsiento = numeroAsiento;
        this.clase = clase;
        this.clienteAsignado = null; // Al principio, el asiento no está asignado a nadie
    }

    /**
     * Metodo para asignar un asiento al cliente
     * 
     * @param cliente cliente asignado
     */
    public void asignarAsiento(Cliente cliente) {
        if (clienteAsignado == null) { // Si el asiento no está ocupado
            this.clienteAsignado = cliente;
            System.out.println("El asiento " + numeroAsiento + " ha sido asignado al cliente " + cliente.getNombre());
        } else {
            System.out.println("El asiento ya está ocupado.");
        }
    }

    /**
     * Retorna numero de asiento
     * 
     * @return String numero de asiento
     */
    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * Establece el nmumero de aciento
     * 
     * @param numeroAsiento nmumero de aciento
     */
    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    /**
     * Obtiene la clase
     * 
     * @return String return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * Establece la clase
     * 
     * @param clase clase
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * Obtiene el cliente asignado
     * 
     * @return Cliente el cliente asignado
     */
    public Cliente getClienteAsignado() {
        return clienteAsignado;
    }

    /**
     * Establece el cliente asignado
     * 
     * @param clienteAsignado cliente asignado
     */
    public void setClienteAsignado(Cliente clienteAsignado) {
        this.clienteAsignado = clienteAsignado;
    }

}
