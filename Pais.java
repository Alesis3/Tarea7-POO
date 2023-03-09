package Clases;

public class Pais {

    private String nombre;
    private String continente;
    private String idioma;
//Constructor por defecto
    public Pais() {
    }
//Constructor sobrecargado
    public Pais(String nombre, String continente, String idioma) {
        this.nombre = nombre;
        this.continente = continente;
        this.idioma = idioma;
    }
//Metodo de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
//Metodo toString
    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }

}
