package com.ejemplo.herencia;


public class Cilindro extends Circulo {
    private double altura = 1.0;

   
    public Cilindro() {}

    
    public Cilindro(double radio) {
        super(radio);
    }

    
    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    
    public Cilindro(double radio, double altura, String color) {
        super(radio, color);
        this.altura = altura;
    }

    
    public double getAltura() {
        return altura;
    }

    
    public void setAltura(double altura) {
        this.altura = altura;
    }

   
    public double getVolumen() {
        return getArea() * altura;
    }

   
    @Override
    public String toString() {
        return "Cilindro[radio=" + getRadio() + ", altura=" + altura + ", color=" + getColor() + "]";
    }
}
