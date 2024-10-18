package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Cliente {

    private String nombre;
    private String idCliente;
    private String email;

    public Cliente(String nombre, String idCliente, String email) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.email = email;
    }

    // Método para buscar vuelos disponibles
    public List<Vuelo> buscarVuelo(Aeropuerto origen, Aeropuerto destino, Date fecha) {
        List<Vuelo> vuelosDisponibles = new ArrayList<>();
        
        // Lógica para buscar vuelos (esto es solo un ejemplo, podrías reemplazarlo con lógica real)
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

    // Método para realizar una reserva en un vuelo específico
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

    // Método simulado para obtener todos los vuelos (reemplazar con lógica real)
    private List<Vuelo> obtenerTodosLosVuelos() {
        return new ArrayList<>(); // Simulación de una lista de vuelos disponibles
    }



    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}
