/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg27.pkg9.pkg24.kovalski.pooll;

import java.io.File;

/**
 * Cual es el orden de las etiquetas en javadoc?
 * 
 * Escenario 1: Método que lanza una excepción Descripción: Tienes un método que
 * divide dos números, pero puede lanzar una excepción si el divisor es cero.
 * 
 * Calcula la resta entre 2 numeros.
 * 
 * @param num1 primer numero para la division.
 * @param num2 segundo numero para la division.
 * @return La division entre los 2 numeros.
 * @author Krutki Daniel, Schiaffino Thiago
 * @throws devuelve division invertida
 */
public class Calculo {

    private double dividir(double num1, double num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            return num2 / num1;
        }

    }

    /**
     * Escenario 2: Método obsoleto con sugerencia de uso alternativo
     * Descripción: Tienes un método que ha quedado obsoleto, y quieres
     * documentarlo para que no sea utilizado, sugiriendo un nuevo método.
     *
     * Calcula la resta entre 2 numeros
     *
     * @param num1 primer numero para la resta.
     * @param num2 segundo numero para la resta.
     * @return La resta entre los 2 numeros.
     * @author Krutki Daniel, Schiaffino Thiago
     * @version 1.0
     * @deprecated En desuso
     * @link restar(double num1, double num2)
     */
    private double resta(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Calcula la resta entre 2 numeros
     *
     * @param num1 primer numero para la resta.
     * @param num2 segundo numero para la resta.
     * @return La resta entre los 2 numeros o el mensaje si da como negativo la
     * resta.
     * @author Krutki Daniel, Schiaffino Thiago
     * @version 2.0
     */
    private String restar(double num1, double num2) {
        String retorno = "Nada";
        if ((num1 - num2) < 0) {
            retorno = "No podemos devolver numeros negarivos";
        } else if ((num2 - num1) < 0) {
            retorno = "No podemos devolver numeros negarivos";
        }
        if ((num1 - num2) > 0) {
            retorno = String.valueOf(num1 - num2);

        } else if ((num2 - num1) > 0) {
            retorno = String.valueOf(num2 - num1);
        }
        return retorno;
    }

    /**
     * Escenario 3: Método con varios parámetros y retorno Descripción: Tienes
     * un método que calcula el índice de masa corporal (IMC) y devuelve un
     * valor basado en el peso y la altura. calcula el índice de masa corporal
     * (IMC)
     *
     * @param peso Primer valor - Peso en kg de la persona.
     * @param altura segundo valor - altura de la persona en metros.
     * @return la masa corporal IMC.
     * @author Krutki Daniel, Schiaffino Thiago
     */
    private String calcularIMC(double peso, double altura) {
        return String.valueOf(peso / altura);
    }

    /**
     * Escenario 4: Método que lanza múltiples excepciones Descripción: Tienes
     * un método que abre un archivo y lo lee, pero puede lanzar excepciones si
     * el archivo no existe o si hay un error de entrada/salida.. 
     * Metodo Abrir archivo
     *
     * @param nombre del archivo.
     * @return Datos del archivo o si no existe.
     * @author Krutki Daniel, Schiaffino Thiago
     * @throws devuelve el error
     */
    private String abrirArchivo(String nombre) {
        String resultado = "Nada";
        try {
            File file = new File(nombre);
            if (file.exists()) {
                resultado= "Nombre archivo = " +file.getName() + " - " + "Tamaño= " + file.length();
            }
            
        } catch (Exception e) {
            resultado = e.getMessage();
        }
        return resultado;
    }
    
}
