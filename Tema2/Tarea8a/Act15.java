package Tarea8;

import java.util.Scanner;

public class Act15 {
    public static void main(String[] args) {
        //Realizar un programa que nos pida un número n, y nos diga cuantos
        // números hay entre 1 y n que sean primos. Un número primo es aquel
        // que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:
        //
        //1-> primo
        //
        //2->primo
        //
        //3->primo
        //
        //4->no primo
        //
        //5->primo
        //
        //6->no primo
        //
        //7->primo
        //
        //8->no primo
        //
        //Resultado del programa: Entre 1 y 8 hay 5 números primos.

        Scanner teclado = new Scanner(System.in);
        int contadorPrimo = 0;
        System.out.println("Introduce un numero");
        int n = teclado.nextInt();

        for(int i = 1; i <= n; ++i) {
            boolean primo = true;

            for(int a = 2; a <= i - 1 && primo; ++a) {
                if (i % a == 0) {
                    primo = false;
                }
            }

            if (primo=true) {
                ++contadorPrimo;
                System.out.println(i + " Es primo");
            }else{
                System.out.println(i + "No es primo");
            }

            System.out.println("De 1 a " + n + ", hay " + contadorPrimo + " numeros primos");
        }

    }
}
