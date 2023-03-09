package Clases;

import java.awt.*;

public class DriverPais {
    public static void main(String[] args){

   //Constructor por defecto y sobrecargdo
        Pais p1 = new Pais();
        Pais p2 = new Pais("Mexico","America","Español");
        System.out.println(p2);

   //Metodo de acceso
        Pais p3 = new Pais();
        p3.setNombre("Rusia");
        p3.setContinente("Europa");
        p3.setIdioma("Ruso");
        System.out.println("Nombre: " + p3.getNombre());
        System.out.println("Continente: " + p3.getContinente());
        System.out.println("Idioma: " + p3.getIdioma());

    //Metodo toSring
        System.out.println(p3.toString());

    //metodo de uso general

    }
}
