/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author Carlos Vargas
 */
public class MiEjemplo2 {

    public static void main(String[] args) {
        String nombresPersona; // Es la variable para almacenar un nombre 
        String apellidosPersona; // Es la variable para almacenar un apellido
        int edad;

        nombresPersona = "Carlos Andrés";
        apellidosPersona = "Vargas Ramírez";
        edad = 23;

        /**
         * System.out.println("Mis nombres son: " + NombresPersona + "\n\t Mis
         * Apellidos son: " + ApellidosPersona);
         */
        System.out.printf("Mi nombre es: %s \nMi apellido es: %s\n"
                + "Mi edad es: %s\n",
                nombresPersona, apellidosPersona, edad);

    }
}
