package com.ejemplo.herencia;

public class PruebaHerencia {
    public static void main(String[] args) {
       
        Circulo circulo = new Circulo(2.0, "azul");
        System.out.println(circulo);
        System.out.println("Área del círculo: " + circulo.getArea());

       
        Cilindro cilindro = new Cilindro(2.0, 5.0, "verde");
        System.out.println(cilindro);
        System.out.println("Volumen del cilindro: " + cilindro.getVolumen());
    }
}
