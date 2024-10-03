package com.shapes;

public class Principal {
    public static void main(String[] args) {
       
        Circulo circulo = new Circulo(2.0, "azul", false);
        System.out.println(circulo);
        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Perímetro del círculo: " + circulo.getPerimetro());

       
        Rectangulo rectangulo = new Rectangulo(4.0, 2.0, "verde", true);
        System.out.println(rectangulo);
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimetro());

        
        Cuadrado cuadrado = new Cuadrado(3.0, "rojo", false);
        System.out.println(cuadrado);
    }
}

