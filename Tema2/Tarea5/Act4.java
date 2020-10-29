package Tarea5;

import java.util.Scanner;

public class Act4 {
    public static void main (String[] args){
        // Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();
        System.out.println("Introduce un numero");
        int num1 = teclado.nextInt();

        int contador=0;

        if(num%2==0 || num1%2==0){
            contador++;
        }

        if(num%2==0 || num1%2==0){
            contador++;
        }
        System.out.println("El número de números pares introducidos es: " +contador);
    }
}
