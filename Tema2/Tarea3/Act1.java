package Tarea3;

import java.util.Scanner;

public class Act1 {
    public static void main (String[]args){
        //Crea un programa que calcule y muestre la suma de
        // dos números de dos cifras (de tipo byte) que introduzca el usuario.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        byte num = teclado.nextByte();
        System.out.println("Introduce otro número");
        byte num1 = teclado.nextByte();

        System.out.println(num+num1);
    }
}
