package com.ejemplo.herencia;

public class Principal {
    public static void main(String[] args) {
        
       
        Estudiante estudiante = new Estudiante("Danilo Carlosama", "123 Calle Principal", "Ingeniería Informática", 2023, 1500.0);
        System.out.println(estudiante);

       
        Personal personal = new Personal("Diana Ordoñez", "456 Calle Oriente", "Ingeniería Ambiental", 3000.0);
        System.out.println(personal);
    }
}
