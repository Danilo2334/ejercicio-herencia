package com.shapes;


public class Forma {
    private String color = "rojo";
    private boolean relleno = true;

 
    public Forma() {}

   
    public Forma(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

  
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

  
    @Override
    public String toString() {
        return "Forma[color=" + color + ", relleno=" + relleno + "]";
    }
}
