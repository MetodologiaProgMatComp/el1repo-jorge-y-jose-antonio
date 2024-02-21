package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio1;

public class Book {

    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String i,String n,Author a, double p) {
        this.isbn = i;
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = 0;
    }

    public Book(String i,String n,Author a, double p, int q) {
        this.isbn = i;
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = q;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
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

    public String getAuthorName() {
        return author.getName(); // cannot use author.name as name is private in Author class
    }

    public String toString() {
        return "Book[Isbn=" + isbn + ", Name=" + name + ", " + author.toString() + ", Price=" + price + ", Qty=" + qty + "]";
    }

}
