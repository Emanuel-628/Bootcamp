
package java_e002;

public class Ejercicio03 {
    public static void palindrome (String aux) {        
        int c = 0;
        String x = aux.replaceAll("\\s", ""); //eliminando los espacios
        int n = x.length()-1; //se le resta 1 para que no quede fuera de rango
        
        for (int i=0; i<x.length(); i++) { //como son numeros espejos, verificamos que si son iguales todos es un palindrome
            if  (x.charAt(i)== x.charAt(n)) {
                c++;
            }            
            n--;
        }
        if (c == x.length()) {
            System.out.println("Es palindrome ");
        }
        else {
            System.out.println("No es palindrome ");
        }
    }
    
    public static void main (String [] args) {
        String prueba = "racecar";
        palindrome (prueba);
    }
}
