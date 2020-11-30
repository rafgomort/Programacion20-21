package entregable;

import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        //Crea una función con la siguiente cabecera:
        //
        //public String convierteEnMorse(int n)
        //
        //Esta función convierte el número n al sistema Morse y lo devuelve en una
        //cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
        //Morse. Utiliza esta función en un programa para comprobar que funciona bien.
        //Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
        //desde el programa principal.
        //
        //1 . _ _ _ _ 6 _ . . . .
        //2 . . _ _ _ 7 _ _ . . .
        //3 . . . _ _ 8 _ _ _ . .
        //4 . . . . _ 9 _ _ _ _ .
        //5 . . . . . 0 _ _ _ _ _
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();
        teclado.close();

        System.out.println(convierteEnMorse(num));

    }

    public static String convierteEnMorse(int n){
        //Concateno el int n a String para recorrer el bucle for
        String resul=n + "";
        for (int i = 0; i < resul.length(); i++) {
            switch (n){
                case 1:
                    System.out.println(".____");
                    break;
                case 2:
                    System.out.println("..___");
                    break;
                case 3:
                    System.out.println("...__");
                    break;
                case 4:
                    System.out.println("...._");
                    break;
                case 5:
                    System.out.println(".....");
                    break;
                case 6:
                    System.out.println("_....");
                    break;
                case 7:
                    System.out.println("__...");
                    break;
                case 8:
                    System.out.println("___..");
                    break;
                case 9:
                    System.out.println("____.");
                    break;
                case 10:
                    System.out.println("_____");
                    break;
            }
        }
        return resul;
    }
}
