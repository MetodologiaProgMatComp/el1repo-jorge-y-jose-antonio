package Introduccion2;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String n,Author a,double p) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = 0;
    }

    public Book(String n,Author a,double p,int q) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = q;
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

    public String toString() {
        return "Book[Name=" + name + ", " + author.toString() + ", Price=" + price + ", Qty=" + qty + "]";
    }

    public String getAuthorName() {
        return author.getName(); // cannot use author.name as name is private in Author class
    }

    public String getAuthorEmail() {
        return author.getEmail(); // cannot use author.email as email is private in Author class
    }

    public char getAuthorGender() {
        return author.getGender(); // cannot use author.gender as gender is private in Author class
    }

}
