/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo021;

/**
 *
 * @author Carlos Vargas
 */
public class Ejemplo021 {

    /**
     * Asi para crear un comentario largo
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Este metodo es el principal de mi clase
        // Comentario corto
        // Clic derecho FORMAT, para arreglar el codigo
        
        /**
         * \n significa salto de linea 
         * \t significa dar tabulacion Las lineas de
         * codigo no pueden ser mayor que la columna 80
         */

        String nombresPersona; // Es la variable para almacenar un nombre 
        String apellidosPersona; // Es la variable para almacenar un apellido

        nombresPersona = "Carlos Andrés";
        apellidosPersona = "Vargas Ramírez";

        System.out.println("Mis nombres son: " + nombresPersona
                + "\n\tMis Apellidos son: " + apellidosPersona);

    }

}
