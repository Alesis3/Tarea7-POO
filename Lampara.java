package Clases;

import java.awt.*;

public class Lampara {

    private String marca;
    private Color color;
    private String tipo;

    //contructores

    public Lampara() {
    }

    public Lampara(String marca, Color color, String tipo) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
    }
    //metodo acceso

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //metodo toString

    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", color=" + color +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    //metodo de uso general


}
