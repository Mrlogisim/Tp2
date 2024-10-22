package Modelo;

public class Plato {

    private String nombre;
    private double precio;
    private CategoriaPlato categoria;

    

    //Constructor
    public Plato(String nombre, double precio, CategoriaPlato categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    
    //Getters (accesores)
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public CategoriaPlato getCategoria() {
        return categoria;
    }


}
