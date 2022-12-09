
package java_e002;

import java.util.Random;

public class Ejercicio02 {
    public static void main (String [] args) {
        int [] aleat = new int [100]; //el array de 100 elementos
        Random r = new Random ();
        int [][] aux = new int [61][2]; //un array bidimensional que va a servir para saber los que no aparecen y los que mas aparecen
        int repeat = 0; //variable para saber quien aparecio mas veces
        int cont= -30; //contador auxiliar para cargar el array bidimensional
        
        for (int i=0; i<100;i++) {//cargando el array con numeros aleatorios dentro del rango
            aleat [i] = r.nextInt(30+30)-30;
        }
        for (int i=0; i<100;i++) { //Impresion del array
            System.out.println("El valor del array en la posicion " + i + " es: " + aleat [i]);
        }
        for (int i=0; i<61;i++)  { //cargando el array auxiliar          
                aux[i][0] = cont++;
                aux[i][1] = 0;
        }
        /*for(int i=0; i<61; i++) { //impresion de la matriz
            System.out.println("Matriz: " + aux[i][0] + " " + aux[i][1]);
        }*/
        
        for (int i=0; i<100; i++) { //calculando los que mas aparecen
            for(int j=0; j<61; j++) {
                if (aleat [i] == aux[j][0]) {
                    aux[j][1]++;
                }
            }
        }
        int mayor = 0;
        for (int i=0; i<61; i++) { //calculando el que mas aparecio y su valor
            if (aux[i][1]> mayor) {
                mayor = aux [i][1];
                repeat = aux[i][0];
            }
        }
        System.out.println("El que mas aparecio es " + repeat + " con " + mayor + " ");
        for (int i=0; i<61; i++) { //Impresion de los que no aparecieron
            if (aux [i][1] == 0) {
                System.out.println("No aparecio " + aux[i][0]);
            }
        }
    }
}
