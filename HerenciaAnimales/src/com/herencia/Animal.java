package com.herencia;

public class Animal {
    protected String nombre;

  
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public String toString() {
        return "Animal[nombre=" + nombre + "]";
    }
}
