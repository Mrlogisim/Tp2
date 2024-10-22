import Clases.CategoriaPlato;
import Clases.Cliente;
import Clases.EstadoPedido;
import Clases.Mesa;
import Clases.Pedido;
import Clases.Plato;

/**
 * Clase principal de la aplicación
 *
 * @version 2.0
 * @author Grupo G
 */
public class App {
    /**
     * Método principal de la aplicación
     *
     * @param args Argumentos de la línea de comandos
     * @throws Error en la realizacion del pedido
     */
    public static void main(String[] args) throws Exception {

        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan Pérez", "123-456-789");

        // Crear una mesa
        Mesa mesa1 = new Mesa(1);

        // Crear algunos platos
        Plato plato1 = new Plato("Ensalada César", 8.50, CategoriaPlato.ENTRADA);
        Plato plato2 = new Plato("Bife de Chorizo", 15.00, CategoriaPlato.PLATO_PRINCIPAL);
        Plato plato3 = new Plato("Flan con Dulce de Leche", 5.00, CategoriaPlato.POSTRE);

        // Crear un pedido para la mesa y el cliente
        Pedido pedido1 = new Pedido(101, mesa1, cliente1);

        // El cliente realiza el pedido
        cliente1.hacerPedido(pedido1);

        // Agregar platos al pedido
        pedido1.agregarPlato(plato1);
        pedido1.agregarPlato(plato2);
        pedido1.agregarPlato(plato3);

        // Agregar el pedido a la mesa
        mesa1.agregarPedido(pedido1);

        // Cambiar el estado del pedido a EN_PREPARACION
        pedido1.cambiarEstado(EstadoPedido.EN_PREPARACIÓN);

        // Cambiar el estado del pedido a SERVIDO
        pedido1.cambiarEstado(EstadoPedido.SERVIDO);

    }
}