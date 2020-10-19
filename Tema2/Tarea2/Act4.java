package Tarea1;

import groovy.json.JsonOutput;

import java.util.Scanner;

public class Act4 {
    public  static void main (String[]args){
        // Crea un programa que pida al usuario una longitud en millas
        // (por ejemplo, 3) y calcule su equivalencia en metros (1 milla = 1609 m).

        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce un número para la longitud");
        int num= teclado.nextInt();

        int milla=1609;

        System.out.println("Son " + num*milla + " m");

    }
}
