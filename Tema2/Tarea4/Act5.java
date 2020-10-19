package Tarea4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Act5 {
    public static void main (String[]args){
        //Escribe un programa que muestre la hora actual
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora: " + hourFormat.format(date));
    }
}
