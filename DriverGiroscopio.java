package Clases;

import java.awt.*;

public class DriverGiroscopio {
    public static void main(String[] args){

        //constructores
        giroscopio gi1 = new giroscopio();
        giroscopio gi2 = new giroscopio("Optico", "NEWSIGAR", Color.GRAY);
        System.out.println(gi2);

        //metodos de acceso
        giroscopio gi3 = new giroscopio();
        gi3.setTipo("Optico");
        gi3.setMarca("Quickstart");
        gi3.setColor(Color.yellow);
        System.out.println("Tipo: " + gi3.getTipo());
        System.out.println("Marca: " + gi3.getMarca());
        System.out.println("Color: " + gi3.getColor());

        //metodo toString
        System.out.println(gi3.toString());

        //metodo de uso general




    }
}
