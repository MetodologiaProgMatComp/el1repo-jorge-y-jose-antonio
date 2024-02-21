package es.uah.matcomp.mp.e1.ejerciciosclases.Ejercicio5;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String i,String n) {
        this.balance = 0;
        this.id = i;
        this.name = n;
    }

    public Account(String i,String n,int b) {
        this.balance = b;
        this.id = i;
        this.name = n;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance = (balance + amount);
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance){
            this.balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another,int amount) {
        if (amount <= balance) {
            debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
