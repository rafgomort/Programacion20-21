package Tarea8;

import java.util.Scanner;

public class Act13 {
    public static void main(String[] args) {
        //Dadas 6 notas, escribir la cantidad de
        // alumnos aprobados, condicionados (=4) y suspensos.

        Scanner teclado = new Scanner(System.in);
        int aprobados = 0;
        int suspenso = 0;
        int condicional = 0;

        for(int i = 0; i <= 6; ++i) {
            System.out.println("Nota del alumno entero 1: ");
            int nota = teclado.nextInt();
            if (nota == 4) {
                ++condicional;
            } else if (nota >= 5) {
                ++aprobados;
            } else if (nota < 4) {
                ++suspenso;
            }
        }

        System.out.println("Hay " + aprobados + " alumnos aprobados");
        System.out.println("Hay " + suspenso + "alumnos suspensos");
        System.out.println("Hay " + condicional + "alumnos condicionales");
    }
}
