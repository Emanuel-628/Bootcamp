
package java_e001;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main (String [] args) {
        String nombre;
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        nombre = reader.nextLine();
        System.out.println("Bienvenido " + nombre);
    }
}
