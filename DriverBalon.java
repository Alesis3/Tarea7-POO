package Clases;

import java.awt.*;

public class DriverBalon {
    public static void main(String[] args){

//contructor por defecto y sobrecargado
     Balon b1 = new Balon();
     Balon b2 = new Balon("PUMA", Color.BLUE, "cuero sintetico");
     System.out.println(b2);

//metodo de acceso
    Balon b3 = new Balon();
    b3.setMarca("NIKE");
    b3.setColor(Color.black);
    b3.setMaterial("Cuero");

    System.out.println("Marca: " + b3.getMarca());
    System.out.println("Color: " + b3.getColor());
    System.out.println("Material: " + b3.getMaterial());

//metodo toString
    System.out.println(b2.toString());

    //metodo de uso general


    }
}
