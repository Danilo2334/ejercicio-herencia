package com.shapes;


public class Circulo extends Forma {
    private double radio = 1.0;

  
    public Circulo() {}


    public Circulo(double radio) {
        this.radio = radio;
    }


    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public double getArea() {
        return Math.PI * radio * radio;
    }

  
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

   
    public String toString() {
        return "Círculo[" + super.toString() + ", radio=" + radio + "]";
    }
}
