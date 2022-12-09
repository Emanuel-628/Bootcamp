
package java_e001;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main (String [] args) {
        float n,iva;

        System.out.println("Ingrese el precio de un producto: ");
        Scanner reader = new Scanner (System.in);
        n = reader.nextFloat();
        iva = (float) (n*0.1);
        System.out.println("El iva es de: " + iva);
   }
}
