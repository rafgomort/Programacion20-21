package Tarea8;

import java.util.Scanner;

public class Act3 {
    public static void main (String[]args){
        //Realizar un aplicación que genere un número aleatorio
        // entre 1 y 100. El jugador debe ir probando números
        // tratando de acertarlo. El programa debe indicar "mayor"
        // o "menor" según el número secreto sea mayor o menor que
        // el introducido por el usuario. El proceso finaliza cuando
        // el usuario acierta o cuando se rinde (introduciendo un -1).

        double aleatorio = Math.floor(Math.random() * 100.0D);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero hasta que lo adivines");
        int a = teclado.nextInt();

        do {
            if ((double)a > aleatorio) {
                System.out.println("te has pasado");
            } else if ((double)a == aleatorio) {
                System.out.println("has acertado");
            } else if ((double)a < aleatorio) {
                System.out.println("Te has quedado corto");
            }

            System.out.println("Introduce un numero");
            a = teclado.nextInt();
        } while((double) a != aleatorio && a != -1);

    }
}
