
package java_e002;

import java.util.Random;


public class Ejercicio01 {
    public static void main (String [] args) {
        int [] aleat = new int [10]; //array de 10 elementos
        Random r = new Random ();
        int mayor = 0;
      
        for (int i=0; i<10;i++) { // se carga el array con numeros aleatorios dentro de un rango
            aleat [i] = r.nextInt(5+5)-5;
        }
        for (int i=0; i<10;i++) { //se imprime el array
            System.out.println("El valor del array en la posicion " + i + " es: " +aleat [i]);
        }
        for (int i=0; i<10;i++) { //Se calcula el mayor de ellos            
            if (aleat[i]>mayor) {
                mayor = aleat[i];
            }                        
        }
        System.out.println("El mayor es: " + mayor);
    }
}
