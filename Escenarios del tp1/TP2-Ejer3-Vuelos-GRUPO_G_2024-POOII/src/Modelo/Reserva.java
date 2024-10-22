package Modelo;

import java.util.Date;

/**
 * Clase que representa a la Clase Reserva
 * 
 * @author Grupo G POOll 2024
 * @version 2.0
 */
public class Reserva {
    /**
     * Numero unico de confirm
     */
    private String numeroConfirmacion;
    /**
     * Fecha de reserva
     */
    private Date fechaReserva;
    /**
     * Asiento asignado
     */
    private Asiento asientoAsignado;

    /**
     * Constructor de la clase Reserva.
     * 
     * @param numeroConfirmacion   Num confirm
     * @param fechaReserva         fecha reserva
     * @param asientoAsignado Asiento asig
     */
    public Reserva(String numeroConfirmacion, Date fechaReserva, Asiento asientoAsignado) {
        this.numeroConfirmacion = numeroConfirmacion;
        this.fechaReserva = fechaReserva;
        this.asientoAsignado = asientoAsignado;
    }

    /**
     * Metodo para liberar la reserva
     */
    public void cancelar() {
        if (asientoAsignado != null) {
            // Liberar el asiento
            asientoAsignado.asignarAsiento(null);
            System.out.println("La reserva ha sido cancelada y el asiento ha sido liberado.");
        } else {
            System.out.println("No hay asiento asignado para cancelar.");
        }

        // Aquí podrías implementar cualquier lógica adicional necesaria para cancelar
        // la reserva.
        // Por ejemplo, notificar al cliente, eliminar la reserva de la lista de
        // reservas del vuelo, etc.
    }

    /**
     * Obtiene el numero de confirmacion
     * 
     * @return String numeroConfirmacion
     */
    public String getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    /**
     * Establece el Num de confirmacion
     * 
     * @param numeroConfirmacion Numero de confirm
     */
    public void setNumeroConfirmacion(String numeroConfirmacion) {
        this.numeroConfirmacion = numeroConfirmacion;
    }

    /**
     * Obtiene fecha de reserva
     * 
     * @return Date fechaReserva
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Establece fecha de reserva
     * 
     * @param fechaReserva fecha de reserva
     */
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Obtiene el asiento asignado
     * 
     * @return Asiento asientoAsignado
     */
    public Asiento getAsientoAsignado() {
        return asientoAsignado;
    }

    /**
     * Establece el asiento asignado
     * 
     * @param asientoAsignado asientoAsignado
     */
    public void setAsientoAsignado(Asiento asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }

}
