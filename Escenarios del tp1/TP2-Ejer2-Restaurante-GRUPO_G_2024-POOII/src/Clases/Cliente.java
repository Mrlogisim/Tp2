package Clases;

/**
 * Clase que representa al Cliente
 *
 * @version 2.0
 * @author Grupo G
 */
public class Cliente {
    /**
     * Nombres del Cliente
     */
    private String nombre;
    /**
     * telefono del Cliente
     */
    private String telefono;

    /**
     * Constructor de la clase Cliente
     *
     * @param nombre   nombres del Cliente
     * @param telefono Telefono del cliente
     */
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Metodo para hacer un pedido
     *
     * @param pedido pedido
     */
    public void hacerPedido(Pedido pedido) {
        System.out.println(nombre + " ha hecho un pedido con id: " + pedido.getIdPedido());
        // Aquí podrías agregar lógica adicional, como registrar el pedido en el cliente
        // si es necesario.
    }

    /**
     * Obtener nombre
     * 
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecer nombre
     * 
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener el telefono
     * 
     * @return String return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establecer telefono
     * 
     * @param telefono telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
