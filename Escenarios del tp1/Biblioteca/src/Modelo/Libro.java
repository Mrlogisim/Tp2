package Modelo;

import java.sql.Date;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private EstadoLibro estado;
    private Usuario usuarioActual;
    private Date fechaPrestamo;
    private Date fechaDevolución;


    //Constructor
    public Libro(String titulo, String autor, int numeroPaginas, EstadoLibro estado, Usuario usuarioActual,
            Date fechaPrestamo, Date fechaDevolución) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.estado = estado;
        this.usuarioActual = usuarioActual;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolución = fechaDevolución;
    }



    // getters (accesores)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolución() {
        return fechaDevolución;
    }



    // Setters (Modificadores)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolución(Date fechaDevolución) {
        this.fechaDevolución = fechaDevolución;
    }



    

    //Metodo para prestar un libro
    public void prestar(Usuario usuario) {
        if (estaDisponible()) {
            this.estado = EstadoLibro.PRESTADO;  // Cambiamos el estado del libro a PRESTADO
            this.usuarioActual = usuario;        // Asignamos el libro al usuario
            this.fechaPrestamo = new Date(System.currentTimeMillis());     // Guardamos la fecha del préstamo (fecha actual)
            System.out.println("El libro ha sido prestado a " + usuario.getNombre());
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }



    //Metodo para devolver un libro
    public void devolver() {
        if (this.estado == EstadoLibro.PRESTADO) {
            this.estado = EstadoLibro.DISPONIBLE;   // Cambiamos el estado del libro a DISPONIBLE
            this.usuarioActual = null;              // Eliminamos la asociación con el usuario
            this.fechaDevolución = new Date(System.currentTimeMillis());      // Guardamos la fecha de devolución
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no está prestado actualmente.");
        }
    }


    
    //Metodo para verificar si un libro esta disponible
    public boolean estaDisponible () {
        return this.estado == EstadoLibro.DISPONIBLE;
    }

    


    

}
