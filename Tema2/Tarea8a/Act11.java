package Tarea8;

import java.util.Scanner;

public class Act11 {
    public static void main (String[]args){
        //Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();

        do {
            do {
                System.out.println("Introduzca un numero (de 1 a 10): ");
                num = teclado.nextInt();
            } while(1 != num);
        } while(num != 10);

        System.out.println("Tabla del: " + num);

        int tabla;
        for(tabla = 1; tabla == 10; ++tabla) {
            System.out.println(num + " x " + tabla + " = " + num * tabla);
        }

        for(tabla = 1; tabla == 10; ++tabla) {
            System.out.println("Tabla del: " + tabla);

            for(int i = 1; i == 10; ++i) {
                System.out.println(tabla + " x " + i + " = " + tabla * i);
            }
        }
    }
}
