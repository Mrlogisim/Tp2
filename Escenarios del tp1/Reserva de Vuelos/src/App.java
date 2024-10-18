import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Date;

import Modelo.Aeropuerto;
import Modelo.Asiento;
import Modelo.Avion;
import Modelo.Cliente;
import Modelo.Reserva;
import Modelo.Vuelo;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            // Crear las fechas y horas usando la clase Date
            Date fechaSalida = dateFormat.parse("25/10/2024 23:45");
            Date fechaLlegada = dateFormat.parse("26/10/2024 06:15");

            // Crear aeropuertos
            Aeropuerto aeropuertoOrigen = new Aeropuerto("EZE", "Aeropuerto Internacional Ezeiza", "Buenos Aires");
            Aeropuerto aeropuertoDestino = new Aeropuerto("JFK", "Aeropuerto Internacional JFK", "Nueva York");

            // Crear avión
            Avion avion = new Avion("Boeing 777", 300, "Aerolineas Argentinas");

            // Crear vuelo
            Vuelo vuelo = new Vuelo("AA101", "Aerolineas Argentinas", fechaSalida, fechaLlegada, aeropuertoOrigen, aeropuertoDestino, avion);

            // Crear cliente
            Cliente cliente = new Cliente("Juan Pérez", "123456789", "juan.perez@gmail.com");

            // Cliente busca un vuelo (simplificado, suponemos que ya sabe qué vuelo quiere)
            List<Vuelo> vuelosDisponibles = cliente.buscarVuelo(aeropuertoOrigen, aeropuertoDestino, fechaSalida);

            if (!vuelosDisponibles.isEmpty()) {
                // Cliente realiza la reserva
                Asiento asiento = new Asiento("12A", "Económica");
                Reserva reserva = cliente.realizarReserva(vuelo, asiento);

                // Asignar asiento al cliente
                asiento.asignarAsiento(cliente);

                // Ver detalles de la reserva
                System.out.println("Reserva realizada con éxito:");
                System.out.println("Número de confirmación: " + reserva.getNumeroConfirmacion());
                System.out.println("Cliente: " + cliente.getNombre());
                System.out.println("Vuelo: " + vuelo.getNumeroVuelo());
                System.out.println("Asiento: " + reserva.getAsientoAsignado().getNumeroAsiento());

                // Si se decide cancelar la reserva
                reserva.cancelarReserva();
                System.out.println("La reserva ha sido cancelada.");
            } else {
                System.out.println("No hay vuelos disponibles para las fechas solicitadas.");
            }
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }


    }
}
