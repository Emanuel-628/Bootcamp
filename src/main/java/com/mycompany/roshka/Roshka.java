
package com.mycompany.roshka;

import java.util.Random;
import java.util.Scanner;


public class Roshka {

    public static void main(String[] args) {
        
        String numero = null; //declaracion de la variable que contiene el numero que introduce el usuario
        int vacas = 0; //contador de toros
        int toros = 0; //contador de vacas
        
        System.out.println("Ingrese un numero de 4 digitos (sin repetir los digitos): "); //mensaje para pedir el numero
        Scanner reader = new Scanner (System.in); //se lee el numero
        while(toros != 4) {
            toros = 0;
            vacas = 0;       
            numero = reader.nextLine();
            while ((numero.length() != 4)) { //verificacion para que tenga 4 digitos
                System.out.println("El numero no tiene 4 digitos: "); //mensaje para pedir el numero
                numero = reader.nextLine();
                for (int i=0;i<numero.length();i++) { //verificacion para que no sea un caracter
                    if (Character.isDigit(numero.charAt(i)) == false) {
                        System.out.println("El valor ingresado no es un numero, ingrese un numero: "); //mensaje para pedir el numero
                        numero = reader.nextLine(); 
                    }
                }
            }            
            
            int numero_auxiliar = Integer.parseInt(numero); //se convierte el string a numero
            //se separan los numeros por digito
            char n1 = numero.charAt(0);
            char n2 = numero.charAt(1);
            char n3 = numero.charAt(2);
            char n4 = numero.charAt(3);
        
            System.out.println("Numero del usuario: "+n1+n2+n3+n4);

        
            char [] user_numbs = {n1,n2,n3,n4}; //se guardan los numeros en un array
            Random random = new Random ();
            //numeros aleatorios que crea la maquina
            int n01 = random.nextInt(9);
            int n02 = random.nextInt(9);
            int n03 = random.nextInt(9);
            int n04 = random.nextInt(9);
    
            System.out.println("Numero de la compu: "+n01+n02+n03+n04);
                    
            if (n01 == n02 || n01 == n03 || n01 == n04) {
                n01= random.nextInt(9);
            }
            if (n02 == n01 || n02 == n03 || n02 == n04) {
                n02= random.nextInt(9);
            }
            if (n03 == n01 || n03 == n02 || n03 == n04) {
                n03= random.nextInt(9);
            }
            if (n04 == n01 || n04 == n02 || n04 == n03) {
                n04= random.nextInt(9);      
            }
            if (n01 == 0) {
                n01= random.nextInt(9);
            }
            System.out.println("Numero sin repetir "+n01+n02+n03+n04);
            char [] rand_numbs = {(char)(n01+'0'),(char)(n02+'0'),(char)(n03+'0'),(char)(n04+'0')}; //array de los numeros aleatorios
        
            for (int i=0;i<4;i++) { //condicion para los toros
                if (user_numbs [i] == rand_numbs[i]){                
                    toros++;
                }
                for(int j=0;j<4;j++) { //condicion para las vacas
                    if (user_numbs [i] == rand_numbs[j]){
                        vacas++;
                    }
                    if ((i == j) && (toros > 0) && (vacas > 0)) {
                        vacas--;
                    }
                }
            }
        System.out.println("Cantidad de vacas: " + vacas);
        System.out.println("Cantidad de toros: " + toros);
        System.out.println("Por favor, intente de nuevo: ");
        }
        System.out.println("Felicidades! El numero secreto era: " + numero);
    }   
}

