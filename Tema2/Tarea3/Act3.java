package Tarea3;

import java.util.Scanner;

public class Act3 {
    public static void main (String[]args){
        // Crea un programa que calcule y muestre la división
        // de dos números reales de doble precisión introducidos por el usuario.

        Scanner teclado = new Scanner (System.in);
        System.out.println("Intorduce un numero real");
        double num = teclado.nextDouble();
        System.out.println("Introduce otr numero real");
        double num1 = teclado.nextDouble();

        System.out.println(num/num1);
    }
}
