package Tarea4;

import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        //Sería interesante disponer de un programa que pida como
        // entrada un número decimal y lo muestre redondeando al entero
        // más próximo. ej: 2,3 -> 2      4,8 -> 5

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num = teclado.nextDouble();

        Math.round(num);
    }
}
