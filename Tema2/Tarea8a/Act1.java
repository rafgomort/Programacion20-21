package Tarea8;

import java.util.Scanner;

public class Act1 {
    public static void main (String[]args){
        //Diseñar un programa que muestre, para cada número
        // introducido por teclado, si es par, si es positivo,
        // y su cuadrado. El proceso terminará cuando el número
        // introducido por teclado sea 0.
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número");
        int num = teclado.nextInt();

        while(num != 0) {
            if (num % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("No es par");
            }

            if (num > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }

            System.out.println("El cuadrado de tu numero es " + Math.pow((double)num, 2));
            System.out.println("Introduce un numero");
            num = teclado.nextInt();
            teclado.close();
        }
    }
}

