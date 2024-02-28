package es.uah.matcomp.mp.e1.ejerciciosclases.Parte2Composicion.Ejercicio2;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int i,Customer c,double a) {
        this.id = i;
        this.customer = c;
        this.amount = a;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        double terminado = ( amount - (customer.getDiscount() * amount / 100) );
        this.amount = terminado;
        return terminado;
    }

    public String toString() {
        return "Invoice[Id=" + id + ", Customer=" + customer.toString() + ", amount=" + amount + "]";
    }

}
