package Modelo;

public class Asiento {

    private String numeroAsiento;
    private String clase;
    private Cliente clienteAsignado;

    // Constructor
    public Asiento(String numeroAsiento, String clase) {
        this.numeroAsiento = numeroAsiento;
        this.clase = clase;
        this.clienteAsignado = null; // Al principio, el asiento no está asignado a nadie
    }

    // Método para asignar el asiento a un cliente
    public void asignarAsiento(Cliente cliente) {
        if (clienteAsignado == null) { // Si el asiento no está ocupado
            this.clienteAsignado = cliente;
            System.out.println("El asiento " + numeroAsiento + " ha sido asignado al cliente " + cliente.getNombre());
        } else {
            System.out.println("El asiento ya está ocupado.");
        }
    }

    // Getters y Setters
    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public String getClase() {
        return clase;
    }

    public Cliente getClienteAsignado() {
        return clienteAsignado;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setClienteAsignado(Cliente clienteAsignado) {
        this.clienteAsignado = clienteAsignado;
    }

    

}
