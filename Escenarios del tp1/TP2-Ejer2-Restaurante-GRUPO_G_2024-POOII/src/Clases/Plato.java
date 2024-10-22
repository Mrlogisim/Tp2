package Clases;

/**
 * Clase que representa al Plato
 *
 * @version 2.0
 * @author Grupo G
 */
public class Plato {
    /**
     * id unico del plato
     */
    private String nombre;
    /**
     * precio del plato
     */
    private double precio;
    /**
     * categ del plato
     */
    private CategoriaPlato categoria;

    /**
     * Constructor de la clase Plato
     *
     * @param nombre    Nombre del plato
     * @param precio    precio
     * @param categoria categoria del plato
     */
    public Plato(String nombre, double precio, CategoriaPlato categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Obtener el nombre
     * 
     * @return String return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecer el nombre
     * 
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener el precio
     * 
     * @return double return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establecer el precio
     * 
     * @param precio precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtener la categoria
     * 
     * @return CategoriaPlato return categoria
     */
    public CategoriaPlato getCategoria() {
        return categoria;
    }

    /**
     * Establecer la categoria
     * 
     * @param categoria categoria
     */
    public void setCategoria(CategoriaPlato categoria) {
        this.categoria = categoria;
    }

}
