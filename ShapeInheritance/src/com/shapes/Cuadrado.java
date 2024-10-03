package com.shapes;


public class Cuadrado extends Rectangulo {
  
    public Cuadrado() {}

    
    public Cuadrado(double lado) {
        super(lado, lado); 
    }

   
    public Cuadrado(double lado, String color, boolean relleno) {
        super(lado, lado, color, relleno);
    }

 
    public double getLado() {
        return getAncho();
    }

   
    public void setLado(double lado) {
        setAncho(lado);
        setLargo(lado);
    }

   
    @Override
    public String toString() {
        return "Cuadrado[" + super.toString() + "]";
    }
}

