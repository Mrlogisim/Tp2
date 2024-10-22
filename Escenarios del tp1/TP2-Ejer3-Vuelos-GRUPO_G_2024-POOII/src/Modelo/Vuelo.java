package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Clase que representa a la Clase Vuelo
 * 
 * @author Grupo G POOll 2024
 * @version 2.0
 */
public class Vuelo {
    /**
     * Numero unico de vuelo
     */
    private String numeroVuelo;
    /**
     * Aerolinea
     */
    private String aerolinea;
    /**
     * Fecha salida vuelo
     */
    private Date fechaSalida;
    /**
     * Fecha llegada vuelo
     */
    private Date fechaLlegada;
    /**
     * Hora salida vuelo
     */
    private String horaSalida;
    /**
     * Hora llegada vuelo
     */
    private String horaLlegada;
    /**
     * Aeropuerto origen
     */
    private Aeropuerto aeropuertoOrigen;
    /**
     * Aeropuerto destino
     */
    private Aeropuerto aeropuertoDestino;
    /**
     * Avion
     */
    private Avion avion;
    /**
     * Lista de reservas
     */
    private List<Reserva> listaReservas = new ArrayList<>();

    /**
     * Constructor de la clase Vuelo.
     * 
     * @param numeroVuelo       Num vuelo
     * @param aerolinea         aerolinea
     * @param fechaSalida       fecha salida
     * @param fechaLlegada      fecha llegada
     * @param horaSalida        hora salida
     * @param horaLlegada       hora llegada
     * @param aeropuertoOrigen  Aeropuerto origen
     * @param aeropuertoDestino Aeropuerto destino
     * @param avion             avion
     * 
     */
    public Vuelo(String numeroVuelo, String aerolinea, Date fechaSalida, Date fechaLlegada, String horaSalida,
            String horaLlegada, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino, Avion avion) {
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

    /**
     * Metodo para la reserva de asiento
     * 
     * @param cliente cliente
     * @param asiento asiento
     * @return reserva
     */
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

    /**
     * Metodo para cancelar una reserva
     * 
     * @param reserva una reserva
     */
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

    /**
     * Método auxiliar para generar un número de confirmación (puede ser mejorado)
     * 
     */
    private String generateConfirmationNumber() {
        return "CONF-" + Math.random();
    }

    /**
     * Obtener numero vuelo
     * 
     * @return String retorta vuelo
     */
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Establecer numero vuelo
     * 
     * @param numeroVuelo num vuelo
     */
    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    /**
     * Obtener aerolinea
     * 
     * @return String return aerolinea
     */
    public String getAerolinea() {
        return aerolinea;
    }

    /**
     * Establecer Aerolinea
     * 
     * @param aerolinea Aerolinea
     */
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    /**
     * Obtener fecha salida
     * 
     * @return Date fechaSalida
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Establecer fecha salida
     * 
     * @param fechaSalida fechaSalida
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Obtener fecha llegada
     * 
     * @return Date fechaLlegada
     */
    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * Establecer fecha llegada
     * 
     * @param fechaLlegada fechallegada
     */
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    /**
     * Obtener hora salida
     * 
     * @return String return horaSalida
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * Establecer hora salida
     * 
     * @param horaSalida horaSalida
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * Obtener hora llegada
     * 
     * @return String return horaLlegada
     */
    public String getHoraLlegada() {
        return horaLlegada;
    }

    /**
     * Establecer hora llegada
     * 
     * @param horaLlegada horaLlegada
     */
    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    /**
     * Obtener aeropuerto origen
     * 
     * @return Aeropuerto return aeropuertoOrigen
     */
    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    /**
     * Establecer Aeropuerto origen
     * 
     * @param aeropuertoOrigen aeropuertoOrigen
     */
    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    /**
     * Obtener aeropuerto destino
     * 
     * @return Aeropuerto return aeropuertoDestino
     */
    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    /**
     * Establecer aeropuerto destino
     * 
     * @param aeropuertoDestino aeropuertoDestino
     */
    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    /**
     * Obtener avion
     * 
     * @return Avion return avion
     */
    public Avion getAvion() {
        return avion;
    }

    /**
     * Establecer avion
     * 
     * @param avion avion
     */
    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    /**
     * Obtener lista de reservas
     * 
     * @return return listaReservas
     */
    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    /**
     * Establecer lista reservas
     * 
     * @param listaReservas listaReservas
     */
    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

}
