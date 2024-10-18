package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

private int idPedido;
    private EstadoPedido estado;
    private LocalDateTime horaCreacion;
    private List<Plato> listaPlatos;
    private Mesa mesa;
    private Cliente cliente;

    // Constructor
    public Pedido(int idPedido, Mesa mesa, Cliente cliente) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.cliente = cliente;
        this.estado = EstadoPedido.PENDIENTE; // Estado inicial
        this.horaCreacion = LocalDateTime.now();
        this.listaPlatos = new ArrayList<>();
    }

    // Método para agregar un plato al pedido
    public void agregarPlato(Plato plato) {
        listaPlatos.add(plato);
        System.out.println("Se ha agregado el plato " + plato.getNombre() + " al pedido " + idPedido);
    }

    // Método para cambiar el estado del pedido
    public void cambiarEstado(EstadoPedido estado) {
        this.estado = estado;
        System.out.println("El estado del pedido " + idPedido + " ha cambiado a " + estado);
    }

    // Getters
    public int getIdPedido() {
        return idPedido;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public List<Plato> getPlatos() {
        return listaPlatos;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }


    //Setters
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public void setListaPlatos(List<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    
    

}
