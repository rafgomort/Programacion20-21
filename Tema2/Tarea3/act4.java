package Tarea3;

import java.util.Scanner;

public class act4 {
    public static void main (String[]args){
        //Crea un programa que pida al usuario una
        // longitud en millas (por ejemplo, 3) y calcule
        // su equivalencia en kilómetros, usando datos de tipo
        // float (1 milla = 1.609 km).

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un numero");
        float  num = teclado.nextFloat();
        float milla=1609;

        System.out.println(num*milla);
    }
}
