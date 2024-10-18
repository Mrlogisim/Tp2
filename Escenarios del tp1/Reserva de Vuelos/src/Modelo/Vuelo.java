package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Vuelo {

    

    private String numeroVuelo;
    private String aerolinea;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String horaSalida;
    private String horaLlegada;
    private Aeropuerto aeropuertoOrigen;
    private Aeropuerto aeropuertoDestino;
    private Avion avion;
    private List<Reserva> listaReservas = new ArrayList<>();

    // Constructor
    public Vuelo(String numeroVuelo, String aerolinea, Date fechaSalida, Date fechaLlegada,
                 String horaSalida, String horaLlegada, Aeropuerto aeropuertoOrigen,
                 Aeropuerto aeropuertoDestino, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.avion = avion;
    }

    // Método para reservar un asiento
    public Reserva reservarAsiento(Cliente cliente, Asiento asiento) {
        if (asiento != null) {
            // Crear una nueva reserva
            Reserva reserva = new Reserva(generateConfirmationNumber(), new Date(), asiento);
            
            // Asignar el asiento al cliente
            asiento.asignarAsiento(cliente);
            
            // Agregar la reserva a la lista de reservas del vuelo
            listaReservas.add(reserva);
            
            System.out.println("Reserva realizada exitosamente para el cliente: " + cliente.getNombre());
            return reserva;
        } else {
            System.out.println("Asiento inválido. No se puede realizar la reserva.");
            return null;
        }
    }

    // Método para cancelar una reserva
    public void cancelarReserva(Reserva reserva) {
        if (reserva != null && listaReservas.contains(reserva)) {
            // Cancelar la reserva
            reserva.cancelar();
            
            // Eliminar la reserva de la lista de reservas del vuelo
            listaReservas.remove(reserva);
            
            System.out.println("Reserva cancelada exitosamente.");
        } else {
            System.out.println("Reserva no encontrada. No se puede cancelar.");
        }
    }

    // Método auxiliar para generar un número de confirmación (puede ser mejorado)
    private String generateConfirmationNumber() {
        return "CONF-" + Math.random();
    }

    // Getters y Setters (agrega más si es necesario)
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public Avion getAvion() {
        return avion;
    }



    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }



}
