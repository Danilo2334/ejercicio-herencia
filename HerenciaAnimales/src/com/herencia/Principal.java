package com.herencia;

public class Principal {
    public static void main(String[] args) {
     
        Animal animal = new Animal("AnimalGenérico");
        System.out.println(animal);

        Mamifero mamifero = new Mamifero("MamíferoGenérico");
        System.out.println(mamifero);

        Gato gato = new Gato("Simba");
        System.out.println(gato);
        gato.saluda();

        Perro perro = new Perro("Hikly");
        System.out.println(perro);
        perro.saluda();

        Perro otroPerro = new Perro("Tobby");
        perro.saluda(otroPerro); 
    }
}
