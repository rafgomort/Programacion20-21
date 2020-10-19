package Tarea1;

import java.util.Scanner;

public class Act5 {
    public static void main (String [] args){
        //Crea un programa que pida al usuario una temperatura en grados
        // centígrados y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce cuantos grados hace hoy en tu localidad");
        int num = teclado.nextInt();
        int n;
        n=9*num/5 +32;

        System.out.println(n);
    }
}
