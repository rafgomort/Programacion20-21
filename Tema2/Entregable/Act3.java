package Entregable1;

import java.util.Scanner;

public class Act3 {
    public static void main (String[]args){
        //Escribe un programa que sea capaz de insertar un dígito dentro de un número
        //indicando la posición. El nuevo dígito se colocará en la posición indicada y el
        //resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
        //izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
        //correctamente los datos. Se recomienda usar long en lugar de int ya que el
        //primero admite números más largos.
        //
        //Ejemplo:
        //Por favor, introduzca un número entero positivo: 406783
        //Introduzca la posición donde quiere insertar: 3
        //Introduzca el dígito que quiere insertar: 5
        //El número resultante es 4056783.

        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        String num = teclado.next();
        teclado.nextLine();

        System.out.println("Introduzca la posición donde quiere insertar:");
        int numero = teclado.nextInt();

        System.out.println("Introduzca el dígito que quiere insertar: ");
        String n = teclado.next();
        teclado.nextLine();

        for(int i=0;i<num.length();i++){
            if(i==numero){
                System.out.println(n);
            }else{
                System.out.println(n.substring(Integer.parseInt(num), i));
            }
            System.out.print(" ");
        }
    }
}
