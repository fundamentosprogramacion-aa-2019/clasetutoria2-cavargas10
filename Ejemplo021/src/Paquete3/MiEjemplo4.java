/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

import java.util.Scanner;

/**
 *
 * @author Carlos Vargas
 */
public class MiEjemplo4 {

    public static void main(String[] args) {
        String nombresPersona; // Es la variable para almacenar un nombre 
        String apellidosPersona; // Es la variable para almacenar un apellido
        String ciudad;
        int edad;
        int nota1;
        int nota2;
        double promedio;

        Scanner entrada = new Scanner(System.in); // Me permite ingresar info

        System.out.println("Ingrese sus Nombres por favor: ");
        nombresPersona = entrada.nextLine();
        System.out.println("Ingrese sus Apellidos por favor: ");
        apellidosPersona = entrada.nextLine();
        System.out.println("Ingrese su edad por favor: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese su nota 1: ");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese su nota 2: ");
        nota2 = entrada.nextInt();
        System.out.println("Su promedio es: ");
        promedio = entrada.nextDouble();
        entrada.nextLine(); // Esto es una limpieza de mi buffer de entrada
        // Se hace luego de subir un numero entero y pedir una cadena
        System.out.println("Ingres su Ciudad por favor: ");
        ciudad = entrada.nextLine();

        System.out.printf("Mis nombres son: %s \nMis apellidos son: %s\n"
                + "Mi edad es: %d\n" + "Mis notas son: %d y %d\n"
                + "Mi promedio es: %f\n" + "Mi ciudad es: %s\n",
                nombresPersona, apellidosPersona, edad, nota1, nota2, promedio,
                ciudad);

    }
}
