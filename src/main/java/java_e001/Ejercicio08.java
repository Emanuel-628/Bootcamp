
package java_e001;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main (String [] args) {
        int n;
        
        System.out.println("Ingrese un numero: ");
        Scanner reader = new Scanner (System.in);
        n = reader.nextInt();
        
        do {
            System.out.println("Ingrese un numero mayor o igual a 0: ");
            n = reader.nextInt();
        }
        while(n<0);
    }
}
