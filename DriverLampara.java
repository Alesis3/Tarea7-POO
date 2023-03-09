package Clases;

import java.awt.*;

public class DriverLampara {
    public static void main(String[] args){

        //contructores
        Lampara lam = new Lampara();
        Lampara lam2 = new Lampara("TaoTronics", Color.black ,"De escritorio");
        System.out.println(lam2);

        //metodo acceso
        Lampara lam3 = new Lampara();
        lam3.setMarca("VicTsing");
        lam3.setColor(Color.black);
        lam3.setTipo("De escritorio");

        System.out.println("Marca: " + lam3.getMarca());
        System.out.println("Color: " + lam3.getColor());
        System.out.println("Tipo: " + lam3.getTipo());


        //metodo toString
        System.out.println(lam3.toString());

        //metodo de uso general

    }
}
