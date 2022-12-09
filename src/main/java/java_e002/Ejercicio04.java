
package java_e002;

public class Ejercicio04 {
    public static void main (String [] args) {
        String cadena="12345";
        int n = cadena.length();
        char [] array = new char [n]; //array dimensionado en la longitud de la cadena
        
        for (int i=0;i<n;i++) { //se guarda en el array cada digito de la cadena
            array[i] = cadena.charAt(i);
        }
        for (int i=0;i<n;i++) { //se imprime el array
            System.out.println("El elemento "+ i + " es: " + array[i]);
        }
    }
}
