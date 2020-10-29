package Tarea8;

import java.util.Scanner;

public class Act5 {
    public static void main (String[]args){
        //Desarrollar un programa que solicite los valores mínimo
        // y máximo de un rango. A continuación, solicitará por teclado
        // un valor que debe estar dentro del rango. Si no es asi,
        // volverá a solicitar un número, y así repetidas veces hasta
        // que el valor esté dentro del rango.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor minimo");
        int min = teclado.nextInt();
        System.out.println("Introduce el valor maximo");
        int max = teclado.nextInt();

        int num;
        do {
            do {
                System.out.println("Introduce un numero");
                num = teclado.nextInt();
            } while(min > num);
        } while(num > max);

        System.out.println(num + " pertenece al rango");
    }
}
