package Entregable1;

import java.util.Scanner;

public class Act2 {
    public static void main (String[]args){
        //Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
        //hay dentro de un número. Se recomienda usar long en lugar de int ya que el
        //primero admite números más largos.
        //
        //Ejemplo 1:
        //Por favor, introduzca un número entero positivo: 406783
        //El 406783 contiene 4 dígitos pares y 2 dígitos impares.
        //
        //Ejemplo 2:
        //Por favor, introduzca un número entero positivo: 3177840
        //El 3177840 contiene 3 dígitos pares y 4 dígitos impares.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long num = teclado.nextLong();
        int par=0;
        int impar=0;

        while(num>0){
            int numero = (int)(num%10);
            if(numero%2==0){
                par++;
            }else{
                impar++;
            }
            num = num - numero;
            num = num /10;
        }

        System.out.print ("El " + num + " contiene " + par + "digitos pares y " + impar + " impares.");
    }
}
