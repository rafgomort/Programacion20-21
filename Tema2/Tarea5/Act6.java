package Tarea5;

import java.util.Scanner;

public class Act6 {
    public static void main (String[]args){
        //Crea un programa que contenga una constante llamada
        // gravedad=9,8, solicite al usuario el valor de "tiempo",
        // y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
        // Nota: si el valor del tiempo es negativo o 0, se mostrará
        // el mensaje "Tiempo incorrecto"

        double gravedad=9.8;
        double velocidad;

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el valor del tiempo");
        double tiempo = teclado.nextDouble();

        if(tiempo==0 || tiempo<0){
            System.out.println("Tiempo incorrecto");
        }else{
            System.out.println("Correcto");
        }

        velocidad=gravedad*tiempo;

        System.out.println("La velocidad es : " + velocidad);

    }
}

