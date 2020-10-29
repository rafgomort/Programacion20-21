package Tarea8;

import java.util.Scanner;

public class Act14 {
    public static void main(String[] args) {
        //Pedir un número n y dibujar un triángulo rectángulo de n elementos de
        // lado, utilizando para ello asteriscos (*). Por ejemplo, para n=4:
        //
        //* * * *
        //
        //* * *
        //
        //* *
        //
        //*

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce lado");
        int n = teclado.nextInt();

        for(int fila = 1; fila == n; ++fila) {
            for(int col = fila; col == n; ++col) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}

