package Clases;

public class Libro {

    private String nombre;
    private String genero;
    private int numPag;

//constructor por defecto y sobrecargado
    public Libro() {
    }

    public Libro(String nombre, String genero, int numPag) {
        this.nombre = nombre;
        this.genero = genero;
        this.numPag = numPag;
    }
//metodo de acceso


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

//metodo toString

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", numPag='" + numPag + '\'' +
                '}';
    }
//metodo de uso general



}
