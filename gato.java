package Clases;

import java.awt.*;

public class gato {
    private Color color;
    private String sexo;
    private String raza;

    //contructores

    public gato() {
    }

    public gato(Color color, String sexo, String raza) {
        this.color = color;
        this.sexo = sexo;
        this.raza = raza;
    }
    //metodo de acceso

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //metodo toString

    @Override
    public String toString() {
        return "gato{" +
                "color=" + color +
                ", sexo='" + sexo + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
    //metodo de uso general

}
