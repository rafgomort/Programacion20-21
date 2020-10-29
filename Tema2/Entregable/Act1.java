package Entregable1;

import java.util.Scanner;

public class Act1 {
    public static void main (String[]args){
        //Realiza un programa que pinte por pantalla un rombo hueco hecho con
        //asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
        //sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
        //mensaje de error y volverlo a pedir hasta que sea correcto.
        //Ejemplo:
        //Por favor, introduzca la altura del rombo: 5
        //  *
        // * *
        //*   *
        // * *
        //  *

        int num;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la altura");
        int n = teclado.nextInt();
        teclado.close();

        num = (n-1)/2;

        for(int fila=0;fila<n;fila++){

            for(int columna=0;columna<num;columna++){
                System.out.println(" ");
            }

            for (int columna = 0; columna < n - 2*num; columna++) {

                if (columna==0 || columna== n-2*num-1 ) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
