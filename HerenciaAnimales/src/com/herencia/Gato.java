package com.herencia;

public class Gato extends Mamifero {
    
    public Gato(String nombre) {
        super(nombre);
    }

    public void saluda() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Gato[" + super.toString() + "]";
    }
}
