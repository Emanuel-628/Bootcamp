
package com.mycompany.roshka;

import java.util.Scanner;

public class Nim {
    int A = 3;
    int B = 4;
    int C = 5;
    String pila,j1,j2;
    int contj=0;
    int num_pila;
    
    Scanner reader = new Scanner (System.in);
    
    public void turno (String j) {
            System.out.println(j + ", elija una pila: ");
            pila = reader.next();
            
            if (pila.equals("A")) {
                System.out.println("Cuantos quitara de la pila " + pila + ":");
                num_pila = reader.nextInt();
                if (num_pila > A) {
                    System.out.println("Error");
                    System.exit(0);
                }
                else {
                    A = A - num_pila;
                    System.out.println("A: " + A + " B: " + B + " C: " + C);
                }
            }
            else if (pila.equals("B")) {
                System.out.println("Cuantos quitara de la pila " + pila + ":");
                num_pila = reader.nextInt();
                if (num_pila > B) {
                    System.out.println("Error");
                    System.exit(0);
                }
                else {
                    B = B - num_pila;
                    System.out.println("A: " + A + " B: " + B + " C: " + C);
                }
            }
            else if (pila.equals("C")) {
                System.out.println("Cuantos quitara de la pila " + pila + ":");
                try {
                    num_pila = reader.nextInt();
                }
                catch (Exception e) {
                    System.out.println("Error");
                    System.exit(0);
                }
                if (num_pila > C) {
                    System.out.println("Error");
                    System.exit(0);
                }
                else {
                    C = C - num_pila;
                    System.out.println("A: " + A + " B: " + B + " C: " + C);
                }
            }
            else {
                System.out.println("Error");
                System.exit(0);
            }          
            contj++;   
    }
    
    public void jugador () {
        System.out.println("Jugador 1, ingrese su nombre: ");
        j1 = reader.nextLine();
        System.out.println("Jugador 2, ingrese su nombre: ");
        j2 = reader.nextLine();
        System.out.println("A: " + A + " B: " + B + " C: " + C);
        
        while (A!= 0 || B!= 0 || C!=0) {
            if (contj%2 == 0) {
                turno (j1);
            }        
            if (contj%2 != 0) {
                turno (j2);
            }
        }
        if (contj%2 == 0) {
            System.out.println(j1 + ", ya no quedan contadores, asi que... Ganaste!");
        }
        else {
            System.out.println(j2 + ", ya no quedan contadores, asi que... Ganaste!");
        }
           
    }
    
    public static void main (String [] args) {
        Nim x = new Nim ();
        x.jugador();     
    }
}
