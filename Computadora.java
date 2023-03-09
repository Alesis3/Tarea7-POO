package Clases;

import java.awt.*;

public class Computadora {

    private String marca;
    private String tamanio;
    private Color color;
    
//contructor por defecto
    public Computadora() {
    }
//constructor sobrecargado

    public Computadora(String marca, String tamaño, Color color) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.color = color;
    }
//metodo de acceso

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
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
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", color=" + color +
                '}';
    }
    //metodo de uso general


}
