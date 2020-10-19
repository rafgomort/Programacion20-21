package Tarea3;

import java.util.Scanner;

public class act2 {
    public static void main  (String[]args){
        //Crea un programa que pida al usuario su año de nacimiento
        // y el año actual (usando datos de tipo short) y halle la
        // diferencia de ambos para obtener su edad.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu año de nacimiento");
        int nacimiento = teclado.nextInt();
        System.out.println("Introduce el año actual");
        int actual = teclado.nextInt();
        int año=nacimiento-actual;

        System.out.println("Tienes " + año + " años");

    }
}
