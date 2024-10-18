package Modelo;

public class Aeropuerto {

    private String codigo;
    private String nombre;
    private String ciudad;

    // Constructor
    public Aeropuerto(String codigo, String nombre, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    // Método para obtener el nombre del aeropuerto
    public String obtenerNombre() {
        return nombre;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

}
