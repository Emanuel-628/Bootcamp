
package java_e001;

public class Ejercicio02 {
    public static void main (String [] args) {
        int n1=12;
        int n2=13;
        
        if (n1>n2) {
            System.out.println("El mayor es: " + n1);
            System.out.println("El menor es: " + n2);
        }
        else if (n1<n2) {
            System.out.println("El mayor es: " + n2);
            System.out.println("El menor es: " + n1);
        }
        else if (n1 == n2) {
            System.out.println("Ambos numeros son iguales: " + n1);
        }
    }
}
