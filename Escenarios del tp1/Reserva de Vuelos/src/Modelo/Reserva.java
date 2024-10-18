package Modelo;

import java.util.Date;

public class Reserva {


    private String numeroConfirmacion;
    private Date fechaReserva;
    private Asiento asientoAsignado;

    // Constructor de la clase Reserva
    public Reserva(String numeroConfirmacion, Date fechaReserva, Asiento asientoAsignado) {
        this.numeroConfirmacion = numeroConfirmacion;
        this.fechaReserva = fechaReserva;
        this.asientoAsignado = asientoAsignado;
    }

    // Método para cancelar la reserva
    public void cancelar() {
        if (asientoAsignado != null) {
            // Liberar el asiento
            asientoAsignado.asignarAsiento(null);
            System.out.println("La reserva ha sido cancelada y el asiento ha sido liberado.");
        } else {
            System.out.println("No hay asiento asignado para cancelar.");
        }

        // Aquí podrías implementar cualquier lógica adicional necesaria para cancelar la reserva.
        // Por ejemplo, notificar al cliente, eliminar la reserva de la lista de reservas del vuelo, etc.
    }

    // Getters y setters
    public String getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public Asiento getAsientoAsignado() {
        return asientoAsignado;
    }

    public void setAsientoAsignado(Asiento asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }


}
