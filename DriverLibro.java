package Clases;

import java.net.SocketOption;

public class DriverLibro {
    public static void main(String[] args){
        //contructor por defecto y sobrecargado
        Libro lib = new Libro();
        Libro lib1 = new Libro("Java a fondo", "Educativo", 327);
        System.out.println(lib1);

        //metodo de acceso
        Libro lib2 = new Libro();
        lib2.setNombre("Maze runner");
        lib2.setGenero("Ciencia ficcion");
        lib2.setNumPag(398);
        System.out.println("Nombre: " + lib2.getNombre());
        System.out.println("Genero: " + lib2.getGenero());
        System.out.println("Numero de paginas: " + lib2.getNumPag());

        //metodo toString
        System.out.println(lib1.toString());



    }
}
