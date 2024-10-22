package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Clase que representa al Cliente
 * 
 * @author Grupo G POOll 2024
 * @version 2.0
 */
public class Cliente {
    /**
     * Nombre del cliente
     */
    private String nombre;
    /**
     * id del cliente
     */
    private String idCliente;
    /**
     * Correo del cliente
     */
    private String email;

    /**
     * Constructor de la clase Cliente.
     * 
     * @param nombre    Nombre cliente
     * @param idCliente id unico cliente
     * @param email     correo cliente
     */
    public Cliente(String nombre, String idCliente, String email) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.email = email;
    }

    /**
     * Metodo para buscar vuelos disponibles
     * 
     * @param origen  origen de vuelo
     * @param destino destino de vuelo
     * @param fecha   fecha de vuelo
     * @return retorna lista vuelos
     */
    public List<Vuelo> buscarVuelo(Aeropuerto origen, Aeropuerto destino, Date fecha) {
        List<Vuelo> vuelosDisponibles = new ArrayList<>();

        // Lógica para buscar vuelos (esto es solo un ejemplo, podrías reemplazarlo con
        // lógica real)
        // Aquí podrías hacer una búsqueda en una base de datos o lista de vuelos
        for (Vuelo vuelo : obtenerTodosLosVuelos()) {
            if (vuelo.getAeropuertoOrigen().equals(origen) &&
                    vuelo.getAeropuertoDestino().equals(destino) &&
                    vuelo.getFechaSalida().equals(fecha)) {
                vuelosDisponibles.add(vuelo);
            }
        }

        return vuelosDisponibles;
    }

    /**
     * Metodo para realizar reservas
     * 
     * @param vuelo   vuelo a reservar
     * @param asiento asiento a reservar
     * @return retorna reserva
     */
    public Reserva realizarReserva(Vuelo vuelo, Asiento asiento) {
        if (vuelo != null && asiento != null) {
            Reserva nuevaReserva = vuelo.reservarAsiento(this, asiento);
            if (nuevaReserva != null) {
                System.out.println("Reserva realizada con éxito.");
                return nuevaReserva;
            }
        }
        System.out.println("No se pudo realizar la reserva.");
        return null;
    }

    /**
     * Metodo para listar vuelos
     * 
     * @return la lista de vuelos
     */
    private List<Vuelo> obtenerTodosLosVuelos() {
        return new ArrayList<>(); // Simulación de una lista de vuelos disponibles
    }

    /**
     * retorna el nombre
     * 
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre
     * 
     * @param nombre el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * retorna el id del cliente
     * 
     * @return id del cliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Establece el id del cliente
     * 
     * @param idCliente id cliente
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Obtiene el correo del cliente
     * 
     * @return String correo del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo del cliente
     * 
     * @param email correo del cliente
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
