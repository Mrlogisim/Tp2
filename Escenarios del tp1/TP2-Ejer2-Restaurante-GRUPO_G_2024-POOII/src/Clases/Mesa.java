package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la mesa
 *
 * @version 2.0
 * @author Grupo G
 */
public class Mesa {
    /**
     * id unico de la mesa
     */
    private int idMesa;
    /**
     * Lista pedidos
     */
    private List<Pedido> listaPedidos;

    /**
     * Constructor de la clase Mesa
     *
     * @param idMesa id de mesa
     */
    public Mesa(int idMesa) {
        this.idMesa = idMesa;
        this.listaPedidos = new ArrayList<>();
    }

    /**
     * Método para agregar un pedido a la mesa
     *
     * @param pedido pedido
     */
    public void agregarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
        System.out.println("Se ha agregado el pedido " + pedido.getIdPedido() + " a la mesa " + idMesa);
    }

    /**
     * Método para obtener los pedidos de la mesa
     *
     * @return lista pedidos
     */
    public List<Pedido> getPedidos() {
        return listaPedidos;
    }

    /**
     * Obtiene id unico de la mesa
     * 
     * @return int return idMesa
     */
    public int getIdMesa() {
        return idMesa;
    }

    /**
     * Establece id mesa
     * 
     * @param idMesa idMesa
     */
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    /**
     * Obtiene lista pedidos
     * 
     * @return Lista de pedidos return 
     */
    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    /**
     * Establece lista pedidos
     * 
     * @param listaPedidos listaPedidos
     */
    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

}
