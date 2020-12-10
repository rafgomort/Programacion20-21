package entregable;

import java.util.Arrays;
import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        //Hacer una algoritmo que solicite al usuario una cifra N y rellene un
        // array bidimensional de N filas y N columnas con número aleatorios entre 100 y 200.
        //
        //Mostrar dicho array y a continuación rotarlo 90 grados:
        //
        //Ejemplo:
        //
        //Introduce la dimensión del Array: 5

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la dimension del array");
        int x = teclado.nextInt();
        teclado.close();

        int [][] n = new int[x][x];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = (int) Math.floor(Math.random()*(100-200+1)+200);
                System.out.print(n[i][j]);

            }
        }



    }
}
