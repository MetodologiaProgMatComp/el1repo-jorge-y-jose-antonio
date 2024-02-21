package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio2;

public class Customer {
    private int id;
    private String name;
    private int discount;   //El porcentaje

    public Customer(int i,String n,int d) {
        this.id = i;
        this.name = n;
        this.discount = d;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}
