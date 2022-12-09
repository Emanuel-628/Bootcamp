
package java_e001;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String [] args) {
    String dia;
    
    System.out.println("Ingrese un dia de la semana: ");
    Scanner reader = new Scanner (System.in);
    dia = reader.nextLine();
    
    if (dia.compareTo("Lunes") == 0) {
        System.out.println("Es un dia laboral");
    }
    else if (dia.compareTo("Martes") == 0) {
        System.out.println("Es un dia laboral");
    }
    else if (dia.compareTo("Miercoles") == 0) {
        System.out.println("Es un dia laboral");
    }
    else if (dia.compareTo("Jueves") == 0) {
        System.out.println("Es un dia laboral");
    }
    else if (dia.compareTo("Viernes") == 0) {
        System.out.println("Es un dia laboral");
    }
    else if (dia.compareTo("Sabado") == 0) {
        System.out.println("No es un dia laboral");
    }
    else if (dia.compareTo("Domingo") == 0) {
        System.out.println("No es un dia laboral");
    }
    }
}
