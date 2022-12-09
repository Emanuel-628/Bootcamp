
package java_e001;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main (String [] args) {
        String contra;
        String contrav = "abc";
        int i=0;
        
        System.out.println("Ingrese su contraseña: ");
        Scanner reader = new Scanner (System.in);
        contra = reader.nextLine();
        
        if (contra.compareTo(contrav) == 0) {
            System.out.println("Correcto!");
        }
        else {
            
            do {
                System.out.println("Ingrese su contaseña nuevamente: ");
                contra = reader.nextLine();
                if (contra.compareTo(contrav) == 0) {
                    System.out.println("Correcto!");
                    break;
                }
                i++;
            }
            while(i<3);
        }
        if (i==3) {
            System.out.println("Fallaste jaja!!");
        }
    }
}
