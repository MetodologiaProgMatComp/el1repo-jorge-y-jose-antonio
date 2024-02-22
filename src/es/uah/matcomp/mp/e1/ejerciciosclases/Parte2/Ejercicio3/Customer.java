package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio3;

public class Customer {

    private int id;
    private String name;
    private char gender;

    public Customer(int i,String n,char g) {
        this.id = i;
        this.name = n;
        this.gender = g;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + id + ")";
    }

}
