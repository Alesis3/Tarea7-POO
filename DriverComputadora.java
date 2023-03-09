package Clases;

import java.awt.*;
import java.net.SocketOption;

public class DriverComputadora {
    public static void main(String[] args)
    {
        //contructores por defecto y sobrecargado
        Computadora com = new Computadora();
        Computadora com1 = new Computadora("ASUS", "Grande", Color.blue);
        System.out.println(com1);

        //metodo de acceso
        Computadora c = new Computadora();
        c.setMarca("Lenovo");
        c.setTamanio("Grande");
        c.setColor(Color.RED);

        System.out.println("Marca: " + c.getMarca());
        System.out.println("Tamaño: " + c.getTamanio());
        System.out.println("Color: " + c.getColor());

        //Metodo toString
        Computadora com3 = new Computadora();
        System.out.println(com1.toString());

    }
}
