package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa al Pedido
 *
 * @version 2.0
 * @author Grupo G
 */
public class Pedido {
    /**
     * id unico de pedido
     */
    private int idPedido;
    /**
     * Estado de pedido
     */
    private EstadoPedido estado;
    /**
     * Hora de creacion del pedido
     */
    private LocalDateTime horaCreacion;
    /**
     * Lista de platos
     */
    private List<Plato> listaPlatos;
    /**
     * mesa
     */
    private Mesa mesa;
    /**
     * cliente que realiza el pedido
     */
    private Cliente cliente;

    /**
     * Constructor de la clase Pedido
     *
     * @param idPedido Num pedido
     * @param mesa     mesa
     * @param cliente  cliente
     */
    public Pedido(int idPedido, Mesa mesa, Cliente cliente) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.cliente = cliente;
        this.estado = EstadoPedido.PENDIENTE; // Estado inicial
        this.horaCreacion = LocalDateTime.now();
        this.listaPlatos = new ArrayList<>();
    }

    /**
     * Método para agregar un plato al pedido
     *
     * @param plato plato
     */
    public void agregarPlato(Plato plato) {
        listaPlatos.add(plato);
        System.out.println("Se ha agregado el plato " + plato.getNombre() + " al pedido " + idPedido);
    }

    /**
     * Método para cambiar el estado del pedido
     *
     * @param estado estado
     */
    public void cambiarEstado(EstadoPedido estado) {
        this.estado = estado;
        System.out.println("El estado del pedido " + idPedido + " ha cambiado a " + estado);
    }

    /**
     * Obtener id unico pedido
     * 
     * @return int return idPedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Establecer id pedido
     * 
     * @param idPedido idPedido
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Obtener Estado Pedido
     * 
     * @return EstadoPedido return estado
     */
    public EstadoPedido getEstado() {
        return estado;
    }

    /**
     * Establecer estado de pedido
     * 
     * @param estado estado
     */
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    /**
     * Obtener hora
     * 
     * @return LocalDateTime return horaCreacion
     */
    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    /**
     * Establecer hora
     * 
     * @param horaCreacion horaCreacion
     */
    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    /**
     * Obtener lista de pedidos
     * 
     * @return  return listaPlatos
     */
    public List<Plato> getListaPlatos() {
        return listaPlatos;
    }

    /**
     * Establecer lista de pedidos
     * 
     * @param listaPlatos listaPlatos
     */
    public void setListaPlatos(List<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    /**
     * Obtener mesa
     * 
     * @return Mesa return mesa
     */
    public Mesa getMesa() {
        return mesa;
    }

    /**
     * Establecer mesa
     * 
     * @param mesa mesa
     */
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    /**
     * Obtener cliente
     * 
     * @return Cliente return cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establecer cliente
     * 
     * @param cliente cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
