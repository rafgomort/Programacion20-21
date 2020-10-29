package Tarea8;

public class Act7 {
    public static void main (String[]args){
        //Diseñar un programa que muestre el producto de los 10 primeros números impares.

        double num = 1.0D;

        for(int i = 1; i < 20; i += 2) {
            num *= 1.0D;
        }

        System.out.println("El producto de los 10 primeros numeros impares: " + num);
    }
}
