package com.shapes;


public class Rectangulo extends Forma {
    private double ancho = 1.0;
    private double largo = 1.0;


    public Rectangulo() {}

        public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

 
    public Rectangulo(double ancho, double largo, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.largo = largo;
    }

 
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    
    public double getArea() {
        return ancho * largo;
    }

   
    public double getPerimetro() {
        return 2 * (ancho + largo);
    }

  
    @Override
    public String toString() {
        return "Rectángulo[" + super.toString() + ", ancho=" + ancho + ", largo=" + largo + "]";
    }
}
