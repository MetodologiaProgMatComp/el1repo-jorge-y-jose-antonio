package Introduccion2Mejorada;

import java.util.Arrays;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String n,Author[] a, double p) {
        this.name = n;
        this.authors = a;
        this.price = p;
        this.qty = 0;
    }

    public Book(String n,Author[] a, double p, int q) {
        this.name = n;
        this.authors = a;
        this.price = p;
        this.qty = q;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {

        StringBuilder TodosLosAutores = new StringBuilder();
        if (authors.length > 0) {
            TodosLosAutores.append(authors[0].toString());
            for (int i = 1; i < authors.length; i++) {
                TodosLosAutores.append(", ").append(authors[i].toString());
            }
        }
        return "Book[Name=" + name + ", Authors={" + TodosLosAutores + "}, Price=" + price + ", Qty=" + qty + "]";

    }

    public String getAuthorNames() {
        StringBuilder NombresDeLosAutores = new StringBuilder();
        if (authors.length > 0) {
            NombresDeLosAutores.append(authors[0].getName());
            for (int i = 1; i < authors.length; i++) {
                NombresDeLosAutores.append(", ").append(authors[i].getName());
            }
        }
        return NombresDeLosAutores.toString();
    }

}
