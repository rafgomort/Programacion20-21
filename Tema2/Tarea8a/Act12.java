package Tarea8;

import java.util.Scanner;

public class Act12 {
    public static void main (String[]args){
        //Pedir 5 calificaciones de alumnos. El programa debe
        // decir, al final, si hay algún suspenso o no lo hay.
        // Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        boolean suspenso = false;

        for(int i = 0; i < 5; ++i) {
            System.out.println("Introduzca tu nota de 1 al 10");
            int notas = teclado.nextInt();
            if (notas < 5) {
                suspenso = true;
            }
        }

        if (suspenso=true) {
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay alumnos suspensos");
        }
    }
}
