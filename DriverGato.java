package Clases;

import java.awt.*;

public class DriverGato {
    public static void main(String[] args){

        //constructores
        gato g1 = new gato();
        gato g2 = new gato(Color.DARK_GRAY, "macho","British shorthair");
        System.out.println(g2);

        //metodo de acceso
        gato g3 = new gato();
        g3.setColor(Color.white);
        g3.setSexo("Hembra");
        g3.setRaza("Slames");
        System.out.println("Color: " + g3.getColor());
        System.out.println("Sexo: " + g3.getSexo());
        System.out.println("Raza: " + g3.getRaza());

        //metodo tostring
        System.out.println(g2.toString());



    }
}
