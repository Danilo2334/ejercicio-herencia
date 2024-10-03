package com.herencia;


public class Perro extends Mamifero {

   
    public Perro(String nombre) {
        super(nombre);
    }

    
    public void saluda() {
        System.out.println("Woof");
    }

    
    public void saluda(Perro otro) {
        System.out.println("Wooooof");
    }

  
    @Override
    public String toString() {
        return "Perro[" + super.toString() + "]";
    }
}
