package Clases;

import java.awt.*;

public class Balon {

    private String marca;
    private Color color;
    private String material;

//Contructor por defecto y dobrecargado
    public Balon() {
    }

    public Balon(String marca, Color color, String material) {
        this.marca = marca;
        this.color = color;
        this.material = material;
    }
//metodo de acceso

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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
 //metodo toString

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", color=" + color +
                ", material='" + material + '\'' +
                '}';
    }
 //metodo de uso general


}
