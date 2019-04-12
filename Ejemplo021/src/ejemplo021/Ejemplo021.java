/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo021;

/**
 *
 * @author Salas
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
        String NombresPersona; // Es la variable para almacenar un nombre 
        String ApellidosPersona; // Es la variable para almacenar un apellido

        NombresPersona = "Carlos Andrés";
        ApellidosPersona = "Vargas Ramírez";
        
        System.out.println("Mis nombres son: " + NombresPersona 
                + "\n\t Mis Apellidos son: " + ApellidosPersona); 
        // \n significa salto de linea
        // \t significa dar tabulacion
        //Las lineas de codigo no pueden ser mayor que la columna 80
    }

}
