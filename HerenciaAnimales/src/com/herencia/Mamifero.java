package com.herencia;

public class Mamifero extends Animal {

    
    public Mamifero(String nombre) {
        super(nombre);
    }
 
    @Override
    public String toString() {
        return "Mamífero[" + super.toString() + "]";
    }
}
