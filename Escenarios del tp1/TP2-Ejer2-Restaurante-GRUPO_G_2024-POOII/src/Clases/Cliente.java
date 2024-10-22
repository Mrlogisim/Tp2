package Modelo;

public class Cliente {
    private String nombre;
    private String telefono;

    // Constructor
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Método para hacer un pedido
    public void hacerPedido(Pedido pedido) {
        System.out.println(nombre + " ha hecho un pedido con id: " + pedido.getIdPedido());
        // Aquí podrías agregar lógica adicional, como registrar el pedido en el cliente si es necesario.
    }


    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
    

}
