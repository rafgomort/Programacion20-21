package Tarea4;

public class Act1 {
    //El tipo short permite almacenar valores comprendidos entre -32768 y
    // 32767. Realiza un programa que muestre si el rango de valores de un
    // tipo se comporta de forma cíclica. Es decir, que muestre el valor
    // máximo de una variable de tipo short, y muestre también qué ocurre
    // si sumamos 1 a esa variable.
    public static void main (String[]args) {
        boolean a = true;
        short b = 32767;
        b = (short) (b + 1);
        System.out.println(b);
    }
}

