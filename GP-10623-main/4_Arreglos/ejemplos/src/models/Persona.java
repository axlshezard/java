package models;

public class Persona {
    public String nombre;
    public String color;

    public Persona(String nombre,String color){
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.nombre + " color = "+ this.color;
    }
}
