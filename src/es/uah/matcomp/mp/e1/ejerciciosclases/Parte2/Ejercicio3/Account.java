package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2.Ejercicio3;

public class Account {

    private int id;
    private Customer customer;
    private double balance;

    public Account(int i,Customer c,double b) {
        this.id = i;
        this.customer = c;
        this.balance = b;
    }

    public Account(int i,Customer c) {
        this.id = i;
        this.customer = c;
        this.balance = 0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString() + " Balance=$" + String.format("%.2f", balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        this.balance = balance + amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount){
            this.balance = balance - amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

}
