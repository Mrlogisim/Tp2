
import Clase.Biblioteca;
import Clase.Libro;
import Clase.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Daniel K
 */
public class Principal {

    /**
     * Método principal de la aplicación
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
       Usuario unUsuario = new Usuario(1, "Pepe", null);
       Libro unLibro = new Libro(1, "Programacion Full stack", "Claudio Biale y Kovalski Nicolas", 250, "Disponible");
       //Biblioteca unaBiblio = new Biblioteca(1, null, null);
       Biblioteca unaBiblio = new Biblioteca();
       unaBiblio.agregarLibro(unLibro);
       unaBiblio.agregarUsuario(unUsuario);
       unaBiblio.agregarPrestamo(unLibro, unUsuario);
       
        System.out.println("Libro: "+ unLibro.getTitulo() + " Autor: "+ unLibro.getAutor() + " Estado:"+unLibro.getEstado());
        

    }
    
}
