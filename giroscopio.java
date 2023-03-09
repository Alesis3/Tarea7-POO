package Clases;

import java.awt.*;

public class giroscopio {
    private String tipo;
    private String marca;
    private Color color;



    //constructores

    public giroscopio() {
    }

    public giroscopio(String tipo, String marca, Color color) {
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
    }
    //metodo de acceso

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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


    //metodo toString

    @Override
    public String toString() {
        return "giroscopio{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", color=" + color +
                '}';
    }


    //metodo uso general
}
