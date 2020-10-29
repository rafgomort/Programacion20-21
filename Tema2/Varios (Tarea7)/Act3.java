package Varios;

public class Act3 {
    public  static void main (String[]args){
        //Realiza un programa que genere una letra minúscula de
        // forma aleatoria. Investiga el uso de la función Math.random().
        // Investiga también sobre el sistema de codificación ASCII
        // y ten en cuenta que las letras minúsculas se corresponden
        // con los números del 97 al 122.

        int max=122;
        int min=97;
        double resul;

        resul= Math.floor(Math.random() * (max - min) + min);

        System.out.print("La letra es: ");

        char letra= (char) resul;
        System.out.println(letra);


        System.out.println("El numero es: " + resul);
    }
}
