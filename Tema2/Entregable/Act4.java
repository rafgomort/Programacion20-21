package Entregable1;

import java.util.Scanner;

public class Act4 {
    public static void main (String[]args){
    ////Escribe un programa que pida un número entero positivo por teclado y que
        //    //muestre a continuación los 5 números consecutivos a partir del número
        //    //introducido (incluyendo él mismo). Al lado de cada número se debe indicar
        //    //si se trata de un primo o no.
        //    //
        //    //Ejemplo:
        //    //Por favor, introduzca un número entero positivo: 17
        //    //17 es primo
        //    //18 no es primo
        //    //19 es primo
        //    //20 no es primo
        //    //21 no es primo

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numeros positivos");
        int num = teclado.nextInt();
        int contadorPrimo=0;

        for(int i = 1; i <= num; ++i) {
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

            System.out.println("De 1 a " + num + ", hay " + contadorPrimo + " numeros primos");
        }


    }
}

