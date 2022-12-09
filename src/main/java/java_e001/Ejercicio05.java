
package java_e001;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main (String [] args) {
        int n;
        
        System.out.println("Ingrese un numero: ");
        Scanner reader = new Scanner (System.in);
        n = reader.nextInt();
        
        if (n%2 == 0) {
            System.out.println("El numero es divisible entre 2");
        }
        else {
            System.out.println("El numero no es divisible entre 2");
        }
    }
}
