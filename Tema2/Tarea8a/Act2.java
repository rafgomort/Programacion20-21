package Tarea8;

import java.util.Scanner;

public class Act2 {
    public static void main (String[]args){
        //Un centro educativo nos ha pedido que diseñemos
        // una aplicación para calcular datos estadísticos
        // de los alumnos. Se introducirán las edades de los
        // alumnos hasta que una de ellas sea negativa. La
        // aplicación mostrará la suma de las edades, la media,
        // de cuántos alumnos hemos introducido su edad, y cuántos
        // alumnos son mayores de edad.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();
        int suma = 0;
        int media = 0;
        int alumnos = 0;

        int mayorEdad;
        for(mayorEdad = 0; edad > 0; edad = teclado.nextInt()) {
            suma += edad;
            media = suma / 2;
            ++alumnos;
            if (edad >= 18) {
                ++mayorEdad;
            }

            System.out.println("Introduce tu edad");
        }

        System.out.println("La suma de edad es " + suma);
        System.out.println("La media de edad es " + media);
        System.out.println("Han introducido su edad " + alumnos);
        System.out.println("Hay " + mayorEdad + " alumnos mayores de edad");
    }
}
