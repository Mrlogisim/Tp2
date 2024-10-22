package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private int idMesa;
    private List<Pedido> listaPedidos;

    // Constructor
    public Mesa(int idMesa) {
        this.idMesa = idMesa;
        this.listaPedidos = new ArrayList<>();
    }

    // Método para agregar un pedido a la mesa
    public void agregarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
        System.out.println("Se ha agregado el pedido " + pedido.getIdPedido() + " a la mesa " + idMesa);
    }

    // Método para obtener los pedidos de la mesa
    public List<Pedido> getPedidos() {
        return listaPedidos;
    }

    // Getter
    public int getIdMesa() {
        return idMesa;
    }

}
