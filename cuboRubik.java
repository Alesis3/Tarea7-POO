package Clases;

public class cuboRubik {
    private String marca;
    private int cantCuadros;
    private String diseño;

    //constructor por defecto y sobrecargado
    public cuboRubik() {
    }

    public cuboRubik(String marca, int cantCuadros, String diseño) {
        this.marca = marca;
        this.cantCuadros = cantCuadros;
        this.diseño = diseño;
    }
//metodo de acceso

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantCuadros() {
        return cantCuadros;
    }

    public void setCantCuadros(int cantCuadros) {
        this.cantCuadros = cantCuadros;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }
 //metoodo toString

    @Override
    public String toString() {
        return "cuboRubik{" +
                "marca='" + marca + '\'' +
                ", cantCuadros=" + cantCuadros +
                ", diseño='" + diseño + '\'' +
                '}';
    }

//metodo de uso general

}
