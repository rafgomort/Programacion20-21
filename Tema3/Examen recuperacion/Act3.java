package ExamenRecu1;

import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        //Escribe un programa que cambie un dígito dentro de un número
        // dando la posición y el valor nuevo. Las posiciones se cuentan
        // de izquierda a derecha empezando por el 1. Se recomienda usar
        // long en lugar de int ya que el primero admite números más largos.
        // Suponemos que el usuario introduce correctamente los datos.
        //
        //Ejemplo:
        //Por favor, introduzca un número entero positivo: 406783
        //Introduzca la posición dentro del número: 3
        //Introduzca el nuevo dígito: 1
        //El número resultante es 401783

        long num1;
        int num2;
        int num3;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        num1 = teclado.nextLong();
        System.out.println("El número introducido es " + num1);
        System.out.println("Introduzca la posición dentro del número: ");
        num2 = teclado.nextInt();

        System.out.println("Introduzca el nuevo dígito: ");
        num3 = teclado.nextInt();

        for (int i = 0; i < num1; i++) {
            if(i!=num2){
                num1 = num1 /10;
            }else if(i==num2){
                num1= num1*10;
                num1=num3;
            break;
            }
            System.out.println(num1);



        }
    }
}
